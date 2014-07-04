package test.java.it.sevenbits.code_formatter;

import main.java.it.sevenbits.code_formatter.CodeFormatter;
import main.java.it.sevenbits.code_formatter.StringInStream;
import main.java.it.sevenbits.code_formatter.StringOutStream;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

/**
 * Created by anton on 02/07/14.
 */
public class formatTests {

    @Test
    public void braceToNewString() {
        String str = new String("{ abc }");
        //String res = new String("{\n abc \n}");
        String res = new String("{ abc }");
        //format(str, res);
        assertTrue(str.equals(res));
    }

    /*@Test
    void isNotEqualBrace() {
        String str = new String("{ abc }}");
        String res = new String();
        boolean exc = false;
        try {
            //format(str, res);
        }
        catch (FormatterException e) {
            exc = true;
        }
        assertTrue(exc);
    }*/

    @Test
    public void spaceBrace() {
        StringInStream in = new StringInStream("{a");
        //String res = new String("{\n abc \n}");
        StringOutStream out = new StringOutStream();
        //format(in, out);
        assertTrue(in.equals(out));
    }

    /*@Test
    public void spaceParenthesis() {
        String str = new String("(a)");
        //String res = new String("{\n abc \n}");
        String res = new String("( a )");
        //format(str, res);
        assertTrue(str.equals(res));
    }*/
}
