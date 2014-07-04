package main.java.it.sevenbits.code_formatter;

import java.io.File;

public class StringOutStream implements OutStream {

    private FileOutStream out;
    private File file;

    //private FileOutputStream
    public void writeSymbol(int c) throws StreamException {

        out.writeSymbol(c);
    }

    @Override
    public void close() throws StreamException {

    }
}
