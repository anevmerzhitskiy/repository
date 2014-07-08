package test.java.it.sevenbits.code_formatter;

import junit.framework.Assert;
import main.java.it.sevenbits.code_formatter.*;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by anton on 02/07/14.
 */
public class formatTests {

    @Test
    public void twoEqualStrings() {
        String in = new String("{ abc }");
        String res = new String("{ abc }");
        assertTrue(res.equals(in));
    }

    @Test
    public void lineFeed() throws StreamException, FormatterException {
        InStream in = new StringInStream("a;");
        StringOutStream out = new StringOutStream("");
        String res = new String("a;\n");
        CodeFormatter formatter = new CodeFormatter();
        FormatOptions formatOpt = new FormatOptions();
        formatter.format(in, out, formatOpt);
        String temp = out.getString();
        assertTrue(res.equals(temp));
    }

    @Test
    public void isTab() throws StreamException, FormatterException, IOException {
        InStream in = new StringInStream("{a}");
        String res = new String("{\n    a\n}");
        StringOutStream out = new StringOutStream();
        CodeFormatter formatter = new CodeFormatter();
        FormatOptions formatOpt = new FormatOptions();
        formatter.format(in, out, formatOpt);
        String temp = out.getString();
        assertTrue(res.equals(temp));
    }

    public void tabAndLineFeed() throws StreamException, FormatterException, IOException {
        InStream in = new StringInStream("{a;}");
        String res = new String("{\n    a;\n}");
        StringOutStream out = new StringOutStream();
        CodeFormatter formatter = new CodeFormatter();
        FormatOptions formatOpt = new FormatOptions();
        formatter.format(in, out, formatOpt);
        String temp = out.getString();
        assertTrue(res.equals(temp));
    }

    public void deleteSpace() throws StreamException, FormatterException, IOException {
        InStream in = new StringInStream("{  a;}");
        String res = new String("{\n    a;\n}");
        StringOutStream out = new StringOutStream();
        CodeFormatter formatter = new CodeFormatter();
        FormatOptions formatOpt = new FormatOptions();
        formatter.format(in, out, formatOpt);
        String temp = out.getString();
        assertTrue(res.equals(temp));
    }
}
