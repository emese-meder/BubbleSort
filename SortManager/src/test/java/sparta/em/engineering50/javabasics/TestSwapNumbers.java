package sparta.em.engineering50.javabasics;

import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertTrue;

public class TestSwapNumbers {

    @Test
    public void testSwapNumbersSwapsFirstElementToSecond(){
        SwapNumbers swapNumbers = new SwapNumbers();
        int[] array = new int[]{1,2};
        swapNumbers.swap(array, 0);
        assertTrue(Arrays.equals(array, new int[]{2,1}));

    }

}
