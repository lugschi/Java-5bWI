package at.glu.Sorting;

import java.util.Arrays;

public class BubbleSort implements Sorter {
    public String getName() {
        return "BubbleSort";
    }

    public void sort(int[] data) {
        int n = data.length;
        int temp = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = 1; j < (n-i); j++) {
                if (data[j-1] > data[j]) {
                    temp = data[j-1];
                    data[j-1] = data[j];
                    data[j] = temp;                    
                }
            }
        }
        System.out.println(Arrays.toString(data));
    }
}   
