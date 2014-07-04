package main.java.it.sevenbits.code_formatter;

import org.apache.log4j.Logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class StringOutStream implements OutStream {

    private StringOutStream out;
    private int index;

    /*StringOutStream (String str) throws FileNotFoundException {
        try {
            PrintWriter printWriter = new PrintWriter(fileName);
        }
        catch (FileNotFoundException e) {
            Logger LOG=Logger.getLogger(FileOutStream.class);
            LOG.fatal("Create stream error");
        }
    }*/
    public void writeSymbol(int c) throws StreamException {

        out.writeSymbol(c);
    }

    @Override
    public void close() throws StreamException {

    }
}
