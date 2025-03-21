import org.example.MaximumCount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumCountTest {
    private final MaximumCount maximumCount = new MaximumCount();
    @Test
    void test1(){
        int[] a = new int[]{1,2,1,-1,-2,-3};
        assertEquals(3, maximumCount.maximumCount(a));
    }
}
