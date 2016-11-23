/*
 *  By TruongNguyenAx
 */
package testjenkinantgit;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestAssertions {

    @Test
    public void TestAdd() {
        int expected = 11;
        int ac = Util.Add(5, 6);

        assertEquals(expected, ac);
    }

    @Test
    public void TestAddFail() {
        int expected = 11;
        int ac = Util.AddFail(5, 6);

        assertEquals(expected, ac);
    }   
}
