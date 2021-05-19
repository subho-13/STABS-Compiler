package lexer.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Scanner {
    FileReader inputStream;
    char lookahead;
    String currentString;
    private boolean eof = false;
    static int lineNum = 1;

    public boolean isEOF() {
        return eof;
    }

    public Scanner(File file) throws FileNotFoundException {
        this.inputStream = new FileReader(file);
    }

    private char getNextChar() throws IOException {
        int c = inputStream.read();

        if (c == -1) {
            lookahead = '\0';
            eof = true;
        }

        if (c == '\n') {
            lineNum++;
        }

        return (char) c;
    }

    private void skipWhiteSpace() throws IOException {
        if (lookahead != '\0') {
            return;
        }

        while(!eof) {
            char temp = getNextChar();
            if (! Character.isWhitespace(temp)) {
                lookahead = temp;
                break;
            }
        }
    }

    public int getNextLineNum() {
        return lineNum;
    }

    public String getNextString() throws IOException {
        if(lookahead == '\0') {
            skipWhiteSpace();
            if (isEOF()) {
                return "eof";
            }
        }

        if (Character.isLetterOrDigit(lookahead) || lookahead == '.') {
            char tmp = lookahead;
            lookahead = '\0';
            return tmp + getAlphaNum();
        } else {
            switch (lookahead) {
                case '+' -> {
                    char temp = getNextChar();
                    if (Character.isWhitespace(temp)) {
                        lookahead = '\0';
                        return "+";
                    } else if (temp == '+') {
                        lookahead = '\0';
                        return "++";
                    } else {
                        lookahead = temp;
                        return "+";
                    }
                }

                case '-' -> {
                    char temp = getNextChar();
                    if (Character.isWhitespace(temp)) {
                        lookahead = '\0';
                        return "-";
                    } else if (temp == '-') {
                        lookahead = '\0';
                        return "--";
                    } else {
                        lookahead = temp;
                        return "-";
                    }
                }

                case '>', '<', '!', '=' -> {
                    char temp = getNextChar();
                    if (Character.isWhitespace(temp)) {
                        temp = lookahead;
                        lookahead = '\0';
                        return "" + temp;
                    } else if (temp == '=') {
                        temp = lookahead;
                        lookahead = '\0';
                        return temp + "=";
                    } else {
                        char tmp = lookahead;
                        lookahead = temp;
                        return "" + tmp;
                    }
                }

                case '&', '|' -> {
                    char temp = getNextChar();
                    if (Character.isWhitespace(temp)) {
                        temp = lookahead;
                        lookahead = '\0';
                        return "" + temp;
                    } else if (temp == lookahead) {
                        lookahead = '\0';
                        return temp + "" + temp;
                    } else {
                        char tmp = lookahead;
                        lookahead = temp;
                        return "" + tmp;
                    }
                }
                default -> {
                    char tmp = lookahead;
                    lookahead = '\0';
                    return "" + tmp;
                }
            }
        }
    }

    private String getAlphaNum() throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        while(!isEOF()) {
            char temp = getNextChar();
            if (Character.isLetterOrDigit(temp) || temp == '.') {
                stringBuilder.append(temp);
            } else if (!Character.isWhitespace(temp)) {
                lookahead = '\0';
                lookahead = temp;
                break;
            } else {
                break;
            }
        }

        return stringBuilder.toString();
    }
}
