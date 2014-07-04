package test.java.it.sevenbits.code_formatter;

import main.java.it.sevenbits.code_formatter.FormatterException;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created by anton on 02/07/14.
 */
public class formatTests {

    @Test
    void braceToNewString() {
        String str = new String("{ abc }");
        //String res = new String("{\n abc \n}");
        String res = new String("{ abc }");
        //format(str, res);
        assertTrue(str.equals(res));
    }

    @Test
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
    }

    @Test
    void spaceBrace() {
        String str = new String("{a");
        //String res = new String("{\n abc \n}");
        String res = new String("{    a");
        //format(str, res);
        assertTrue(str.equals(res));
    }

    @Test
    void spaceParenthesis() {
        String str = new String("(a)");
        //String res = new String("{\n abc \n}");
        String res = new String("( a )");
        //format(str, res);
        assertTrue(str.equals(res));
    }
}
