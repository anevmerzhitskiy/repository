package main.java.it.sevenbits.code_formatter;

import java.io.IOException;

/**
 * Created by anton on 02/07/14.
 */
public class StreamException extends Exception {
    StreamException() {}
    StreamException(String message) {}
    StreamException(IOException e) {}
}
