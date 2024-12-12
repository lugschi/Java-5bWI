package at.glu.Sorting.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import at.glu.Sorting.BubbleSort;

public class BubbleSortTest {
    @Test
    void testGetName() {

    }

    @Test
    void testSort() {
        int[] data = {15, 1, 5, 2, 9, 3};
        int[] expectedData = {1, 2, 3, 5, 9, 15};
        BubbleSort bs = new BubbleSort();
        bs.sort(data);
        Assertions.assertArrayEquals(expectedData, data);
    }
}
