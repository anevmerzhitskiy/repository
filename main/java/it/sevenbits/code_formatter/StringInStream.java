package main.java.it.sevenbits.code_formatter;


import java.io.IOException;

public class StringInStream implements InStream {

    private int index;
    private String code;

    public StringInStream(String str) {
        code = new String(str);
        index = 0;
    }

    public int getSymbol() throws StreamException {
            int result = code.charAt(index);
            index++;
            return result;

    }

    public void close() throws StreamException {

    }

    public boolean isEnd() {
        return code.endsWith("");
    }
}
