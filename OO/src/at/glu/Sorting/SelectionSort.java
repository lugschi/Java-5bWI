package at.glu.Sorting;

import java.util.Arrays;

public class SelectionSort implements Sorter {

    public String getName() {
        return "SelectionSort";
    }

    public void sort(int[] data) {
        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (data[j] < data[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = data[minIndex];
            data[minIndex] = data[i];
            data[i] = temp;
        }
        System.out.println(Arrays.toString(data));
    }
}
