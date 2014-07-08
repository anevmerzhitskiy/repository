package main.java.it.sevenbits.code_formatter;

import org.apache.log4j.Logger;

import java.io.FileNotFoundException;

public class StringOutStream implements OutStream {

    private StringBuffer out;

    public StringOutStream() {
        out = new StringBuffer("");
    }

    public StringOutStream(String str) {
        out = new StringBuffer(str);
    }

    public void writeSymbol(char c) throws StreamException {

        out.append(c);
    }

    public void close() throws StreamException {
        out = null;
    }

    public String getString() {
        return out.toString();
    }
}
