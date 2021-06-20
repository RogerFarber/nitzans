import static org.junit.jupiter.api.Assertions.*;

class myClassTest {

    @org.junit.jupiter.api.Test
    void printMe() {
        myClass obj = new myClass();
        assertEquals("Hello worls", obj.printMe());
    }
}