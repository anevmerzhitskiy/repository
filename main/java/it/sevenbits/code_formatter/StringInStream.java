package main.java.it.sevenbits.code_formatter;


import java.io.IOException;

public class StringInStream implements InStream {

    private int index;
    private String code;

    public StringInStream(String str) {
        code = str;
        index = 0;
    }

    public char getSymbol() throws StreamException {
            char result = code.charAt(index);
            index++;
            return result;
    }

    public void close() throws StreamException {

    }

    public boolean isEnd() {
        return index == code.length();
    }
}
