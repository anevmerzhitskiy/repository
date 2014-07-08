package main.java.it.sevenbits.code_formatter;

import com.thoughtworks.xstream.io.StreamException;


public interface OutStream {

    /**
     * @param c symbol, which must be written
     * @throws StreamException
     * @throws main.java.it.sevenbits.code_formatter.StreamException
     */
    void writeSymbol(char c) throws StreamException, main.java.it.sevenbits.code_formatter.StreamException;

    /**
     * @throws StreamException
     * @throws main.java.it.sevenbits.code_formatter.StreamException
     */
    void close() throws StreamException, main.java.it.sevenbits.code_formatter.StreamException;
}
