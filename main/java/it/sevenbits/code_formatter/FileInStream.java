package main.java.it.sevenbits.code_formatter;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.log4j.Logger;

public class FileInStream implements InStream{

    private FileInputStream in;
    private File file;

    FileInStream (String fileName) throws FileNotFoundException {
        file = new File(fileName);
        try {
            in = new FileInputStream(file);
        }
        catch (FileNotFoundException e) {
            Logger LOG=Logger.getLogger(FileInStream.class);
            LOG.fatal("Create stream error");
        }
    }

    public int getSymbol() throws StreamException, IOException {

        return in.read();
    }


    public void close() throws StreamException {

    }


    public boolean isEnd() {
        return true;
    }
}
