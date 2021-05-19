package lexer.lexerstate;

import token.Token;

import java.util.Map;

public class LexerState {
    Map<Character, LexerState> map;
    TokenBuilder tokenBuilder;

    public void setTokenBuilder(TokenBuilder tokenBuilder) {
        this.tokenBuilder = tokenBuilder;
    }

    public void setTransitionMap(Map<Character, LexerState> map) {
        this.map = map;
    }

    public LexerState move(char c) throws Exception {
        LexerState state = map.get(c);

        if (state == null) {
            throw new Exception("No valid Lexer State for current lexeme");
        }

        return  state;
    }
    public Token getToken(String string) {
        if (tokenBuilder == null) {
            // throw error saying no tokens can be returned
        }

        return tokenBuilder.construct(string);
    }
}
