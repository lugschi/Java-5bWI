package at.glu.Sorting;

import java.util.Arrays;

public class InsertionSort implements Sorter {

    public String getName() {
        return "InsertionSort";
    }

    public void sort(int[] data) {
        int n = data.length;
        for (int i = 0; i < n; i++) {
            int key = data[i];
            int j = i - 1;

            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j = j - 1;
            }
            data[j + 1] = key;
        }

        System.out.println(Arrays.toString(data));
    }
}
