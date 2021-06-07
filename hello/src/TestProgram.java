import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class TestProgram {
    @Test
    public void testProgram() {
        System.out.println("TEST START");
        assertEquals(1+1, 2);
        assertEquals("test 1", HelloWorld.test1());
        assertEquals("test 2", HelloWorld.test2());
        assertEquals("test 3", HelloWorld.test3());
        assertEquals(1+1, 2);
        System.out.println("TEST END");
    }
}