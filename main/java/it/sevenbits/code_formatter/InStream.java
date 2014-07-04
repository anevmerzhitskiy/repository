package main.java.it.sevenbits.code_formatter;


import java.io.IOException;

public interface InStream {

    /**
     * @return current symbol
     * @throws StreamException
     */
    int getSymbol() throws StreamException;

    /**
     * @throws StreamException
     */
    void close() throws StreamException;

    /**
     * @return true, if end of file
     */
    boolean isEnd() throws StreamException;
}
