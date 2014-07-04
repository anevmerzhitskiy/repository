package main.java.it.sevenbits.code_formatter;


import java.io.*;

public class CodeFormatter {

    CodeFormatter() {};

    /**
     * @param in input stream
     * @param out output stream
     * @throws FormatterException
     * @throws IOException
     * @throws StreamException
     */
    void format(InStream in, OutStream out) throws FormatterException, IOException, StreamException {

        int c;
        int braceCount = 0;
        int parenthesisCount = 0;
        char space = ' ';

        while(in.isEnd()) {
            //
            c = in.getSymbol();
            switch (c) {
                case ';' : {
                    out.writeSymbol(c);
                    out.writeSymbol('\n');
                    break;
                }
                case '{' : {
                    out.writeSymbol(c);
                    out.writeSymbol('\n');
                    braceCount++;
                    for (int i = 0; i < braceCount; i++) {
                        out.writeSymbol('\t');
                    }
                    break;
                }
                case '}' : {
                    if (braceCount > 0) {
                        out.writeSymbol(c);
                        out.writeSymbol('\n');
                        braceCount--;
                    }
                    else {
                        throw new FormatterException();
                    }
                    break;
                }
                case '(' : {
                    out.writeSymbol(space);
                    out.writeSymbol(c);
                    out.writeSymbol(space);
                    parenthesisCount++;
                    break;
                }
                case ')' : {
                    if (parenthesisCount > 0) {
                        out.writeSymbol(space);
                        out.writeSymbol(c);
                        out.writeSymbol(space);
                        parenthesisCount--;
                    }
                    else {
                        throw new FormatterException();
                    }
                    break;
                }
            }
        }
    }


}
