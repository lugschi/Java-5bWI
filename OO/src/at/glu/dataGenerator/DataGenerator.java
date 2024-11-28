package at.glu.dataGenerator;

import java.util.Random;

public class DataGenerator {
    public static int[] generateDataArray(int size) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt();
        }
        return arr;
    }

    public static int[] generateDataArray(int size, int min, int max) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(max - min);
        }
        return arr;
    }


    public static void printArray(int[] data){
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
            
        }
        
    }

}
