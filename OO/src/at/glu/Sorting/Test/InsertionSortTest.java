package at.glu.Sorting.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import at.glu.Sorting.InsertionSort;

public class InsertionSortTest {
    @Test
    void testGetName() {

    }

    @Test
    void testSort() {
        int[] data = {15, 1, 5, 2, 9, 3};
        int[] expectedData = {1, 2, 3, 5, 9, 15};
        InsertionSort is = new InsertionSort();
        is.sort(data);
        Assertions.assertArrayEquals(expectedData, data);
    }
}
