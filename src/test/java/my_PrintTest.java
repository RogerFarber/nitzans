import org.junit.Test;

import static org.junit.Assert.assertEquals;

class my_PrintTest {

    @Test
    public void testPrintme() {
        my_Print obj = new my_Print();
        assertEquals("Hello Word!",obj.Printme());
    }
}