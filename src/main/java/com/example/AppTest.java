import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testFibonacci() {
        App app = new App();
        assertEquals(5, app.getFibonacci(5)); 
    }
}
