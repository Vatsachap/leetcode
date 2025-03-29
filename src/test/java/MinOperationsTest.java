import org.example.MinOperations;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinOperationsTest {

        @Test
        void test() {
            MinOperations MioperationTest = new MinOperations();
            int[] nums = {0, 1, 1, 1, 0, 0};
            assertEquals(3, MioperationTest.minOperations(nums));
        }
    }

