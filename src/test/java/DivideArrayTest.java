import org.example.DivideArray;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class DivideArrayTest {
    public DivideArray solution;

    @BeforeEach
    void setUp() {
        solution = new DivideArray();
    }

    @Test
    void test1() {
        int[] input = new int[]{3,2,3,2,2,2};
        boolean value = solution.run(input);
        assertTrue(value);
    }

    @Test
    void test2() {
        int[] input = new int[]{1,2,3,4};
        boolean value = solution.run(input);
        assertFalse(value);
    }
}
