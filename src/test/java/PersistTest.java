import org.junit.Test;
import static org.junit.Assert.*;

public class PersistTest {
    @Test
    public void persistanceTestForNumer20(){
        int result = Persist.persistence(20);
        assertEquals(1, result);
    }

    @Test
    public void persistanceTestForNumer123(){
        int result = Persist.persistence(123);
        assertEquals(1, result);
    }

    @Test
    public void persistanceTestForNumer73(){
        int result = Persist.persistence(73);
        assertEquals(2, result);
    }

    @Test
    public void persistanceTestForNumer39(){
        int result = Persist.persistence(39);
        assertEquals(3, result);
    }

    @Test
    public void persistanceTestForNumer(){
        int result = Persist.persistence(-37);
        assertEquals(0, result);
    }
}
