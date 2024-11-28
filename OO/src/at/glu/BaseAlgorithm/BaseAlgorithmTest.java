package at.glu.BaseAlgorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BaseAlgorithmTest {
    @Test
    void testRevert() {
        int[] expectedArray = { 5, 4, 3, 2, 1 };
        int[] array = { 1, 2, 3, 4, 5 };

        BaseAlgorithm.revert(array);
        Assertions.assertArrayEquals(expectedArray, array);
    }

    @Test
    void testMax() {
        int[] arr = { 1, 6, 9, 4, 11 };
        Assertions.assertEquals(BaseAlgorithm.max(arr), 11);
    }

    @Test
    void testMin() {
        int[] arr = { 4, 6, 9, 1, 11 };
        Assertions.assertEquals(BaseAlgorithm.min(arr), 1);
    }
}
