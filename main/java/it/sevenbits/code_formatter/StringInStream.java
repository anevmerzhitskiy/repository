package main.java.it.sevenbits.code_formatter;




public class StringInStream implements InStream {

    private int index;
    private String code;

    StringInStream(String str) {
        code = str;
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
        return false;
    }
}
