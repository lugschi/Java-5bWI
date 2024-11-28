package at.glu.dataGenerator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DataGeneratorTest {
    @Test
    void testGenerateDataArray() {
        int[] data = DataGenerator.generateDataArray(10);
        Assertions.assertEquals(10, data.length);
    }

    @Test
    void testGenerateDataArray2() {
        int[] data = DataGenerator.generateDataArray(100, 0, 100);
        for (int i = 0; i < data.length; i++) {
            Assertions.assertTrue(data[i]>=0);
            Assertions.assertTrue(data[i]<=100);
        }
    }

    @Test
    void testPrintArray() {
        int[] data = DataGenerator.generateDataArray(10, 0, 10);
        DataGenerator.printArray(data);
        Assertions.assertEquals(10, data.length);


    }
}
