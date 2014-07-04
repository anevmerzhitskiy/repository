package main.java.it.sevenbits.code_formatter;


import java.io.IOException;

public interface InStream {

    /**
     * @return current symbol
     * @throws StreamException
     * @throws IOException
     */
    int getSymbol() throws StreamException, IOException;

    /**
     * @throws StreamException
     */
    void close() throws StreamException;

    /**
     * @return true, if end of file
     * @throws IOException
     */
    boolean isEnd() throws IOException;
}
