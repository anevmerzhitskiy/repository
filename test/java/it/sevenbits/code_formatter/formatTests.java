package test.java.it.sevenbits.code_formatter;

import main.java.it.sevenbits.code_formatter.*;
import org.junit.Test;

import java.io.FileNotFoundException;
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
    public void twoEqualStreams() throws StreamException, FileNotFoundException {
        InStream in = new StringInStream("a");
        OutStream out = new StringOutStream("a");
        //assertTrue(out.equals(in));
        assertEquals(in, out);
    }

    /*@Test
    public void twoEqualStreams() throws StreamException {
        //StringInStream in = new StringInStream("{ a }");
        StringInStream in = new StringInStream("a");
        StringOutStream out = new StringOutStream();
        //out.writeSymbol('{');
        //out.writeSymbol(' ');
        out.writeSymbol('a');
        //out.writeSymbol(' ');
        //out.writeSymbol('}');
        assertTrue(out.equals(in));
    }*/

    /*@Test
    public void braceToNewString() throws StreamException, FormatterException, IOException {
        StringInStream in = new StringInStream("{ abc }");
        String res = new String("{\n abc \n }");
        StringOutStream out = new StringOutStream();
        CodeFormatter formatter = new CodeFormatter();
        formatter.format(in, out);
        assertTrue(res.equals(out));
    }*/

    /*@Test
    public void isNotEqualBrace() throws IOException, StreamException {
        StringInStream in = new StringInStream("{ abc }}");
        StringOutStream out = new StringOutStream();
        boolean exc = false;
        try {
            CodeFormatter formatter = new CodeFormatter();
            formatter.format(in, out);
        }
        catch (FormatterException e) {
            exc = true;
        }
        assertTrue(exc);
    }*/

    /*@Test
    public void spaceBrace() throws StreamException, FormatterException, IOException {
        StringInStream in = new StringInStream("{a");
        String res = new String("{\na");
        StringOutStream out = new StringOutStream();
        CodeFormatter formatter = new CodeFormatter();
        formatter.format(in, out);
        assertTrue(res.equals(out));
    }*/

    /*@Test
    public void spaceParenthesis() {
        String str = new String("(a)");
        //String res = new String("{\n abc \n}");
        String res = new String("( a )");
        //format(str, res);
        assertTrue(str.equals(res));
    }*/
}
