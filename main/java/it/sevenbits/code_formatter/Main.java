package main.java.it.sevenbits.code_formatter;


import org.apache.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, StreamException, FormatterException {
        String fileIn = new String(args[1]);//try-catch?
        InStream in =  new FileInStream(fileIn);
        String fileOut = new String(args[2]);
        CodeFormatter formatter = new CodeFormatter();
        OutStream out = new FileOutStream(fileOut);
        try {
            formatter.format(in, out);
        }
        catch (FormatterException e) {
            Logger LOG=Logger.getLogger(Main.class);
            LOG.fatal("formatter error");
        }
    }
}
