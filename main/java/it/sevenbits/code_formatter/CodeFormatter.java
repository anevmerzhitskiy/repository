package main.java.it.sevenbits.code_formatter;

public class CodeFormatter {

    public CodeFormatter() {}

    /**
     *
     * @param in symbol input stream
     * @param out symbol output stream
     * @throws FormatterException
     */
    public void format(InStream in, OutStream out) throws FormatterException {

        int c;
        int braceCount = 0;
        int parenthesisCount = 0;
        char space = ' ';

        try {
            while (in.isEnd()) {
                c = in.getSymbol();
                switch (c) {
                    case ';': {
                        out.writeSymbol(c);
                        out.writeSymbol('\n');
                        break;
                    }
                    case '{': {
                        out.writeSymbol(c);
                        out.writeSymbol('\n');
                        braceCount++;
                        for (int i = 0; i < braceCount; i++) {
                            out.writeSymbol('\t');
                        }
                        break;
                    }
                    case '}': {
                        if (braceCount > 0) {
                            out.writeSymbol(c);
                            out.writeSymbol('\n');
                            braceCount--;
                        } else {
                            throw new FormatterException();
                        }
                        break;
                    }
                    case '(': {
                        out.writeSymbol(space);
                        out.writeSymbol(c);
                        out.writeSymbol(space);
                        parenthesisCount++;
                        break;
                    }
                    case ')': {
                        if (parenthesisCount > 0) {
                            out.writeSymbol(space);
                            out.writeSymbol(c);
                            out.writeSymbol(space);
                            parenthesisCount--;
                        } else {
                            throw new FormatterException();
                        }
                        break;
                    }
                }
            }
        }
        catch (StreamException e) {
            throw new FormatterException(e);
        }
    }
}
