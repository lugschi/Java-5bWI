package at.glu.Sorting.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import at.glu.Sorting.SelectionSort;

public class SelectionSortTest {
    @Test
    void testGetName() {

    }

    @Test
    void testSort() {
        int[] data = {15, 1, 5, 2, 9, 3};
        int[] expectedData = {1, 2, 3, 5, 9, 15};
        SelectionSort ss = new SelectionSort();
        ss.sort(data);
        Assertions.assertArrayEquals(expectedData, data);
    }
}
