package main.java.it.sevenbits.code_formatter;

/**
 * Created by anton on 04/07/14.
 */
public class FormatOptions {
    FormatOptions() {}

    String getIndent() {return "";}
    String getIndent(int count) {return "";}
    int getIndentSize() {return 0;}
    String getNewLine() {return "";}
    void setDefaultParams() {}
    void setIndentSize(int indentSize) {}
    void useCRLF() {}
    void useLF() {}
    void useSpaces() {}
    void useTabs() {}

    public FormatOptions(String pathToConfig) {}
}
