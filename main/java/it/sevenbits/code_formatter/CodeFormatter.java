package main.java.it.sevenbits.code_formatter;

public class CodeFormatter {

    private int braceLevel = 0;

    public CodeFormatter() {}

    private void increaseBrace() {
        braceLevel++;
    }

    private void reduceBrace() {
        braceLevel--;
    }

    private void shiftNextString(OutStream out, FormatOptions formatOptions) throws StreamException {
        try {
            out.writeSymbol(formatOptions.getSymbolEndOfString());
            for (int i = 0; i < formatOptions.getIndent() * braceLevel; i++) {
                out.writeSymbol(formatOptions.getTabSymbol());
            }
        }
        catch (StreamException e) {
            throw e;
        }
    }

    /**
     * @param in symbol input stream
     * @param out symbol output stream
     * @throws FormatterException
     */
    public void format(InStream in, OutStream out, FormatOptions formatOptions) throws FormatterException {

        boolean isNewString = false;
        boolean isAloneSpaceButton = false;
        char c;
        int braceCount = 0;
        int parenthesisCount = 0;
        char space = ' ';

        try {
            while (!in.isEnd()) {
                c = in.getSymbol();
                switch (c) {
                    case ';': {
                        out.writeSymbol(c);
                        isNewString = true;
                        shiftNextString(out, formatOptions);
                        break;
                    }
                    case '{': {
                        out.writeSymbol(c);
                        isNewString = true;
                        increaseBrace();
                        shiftNextString(out, formatOptions);
                        break;
                    }
                    case '}': {
                        isNewString = true;
                        reduceBrace();
                        // add try-catch
                        shiftNextString(out, formatOptions);
                        out.writeSymbol(c);
                    }
                    case ' ': {
                        if (!isNewString) {
                            if (isAloneSpaceButton) {
                                isAloneSpaceButton = false;
                                out.writeSymbol(c);
                            }
                        }
                        break;
                    }
                    default: {
                        isNewString = false;
                        isAloneSpaceButton = true;
                        out.writeSymbol(c);
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
