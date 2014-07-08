package main.java.it.sevenbits.code_formatter;

import com.thoughtworks.xstream.io.StreamException;
import org.apache.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Created by anton on 02/07/14.
 */
public class FileOutStream implements OutStream {
    PrintWriter printWriter;

    FileOutStream (String fileName) throws FileNotFoundException {
        try {
            PrintWriter printWriter = new PrintWriter(fileName);
        }
        catch (FileNotFoundException e) {
            Logger LOG=Logger.getLogger(FileOutStream.class);
            LOG.fatal("Create stream error");
        }
    }

    public void writeSymbol(char c) throws StreamException {
        printWriter.print(c);
    }


    public void close() throws StreamException {

    }
}
