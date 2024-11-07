package at.glu.camera.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import at.glu.camera.File;

public class FileTest {
    @Test
    void testGetDate() {
        File file = new File("image.png", "2024-11-07", 6);

        String date = file.getDate();

        Assertions.assertEquals("2024-11-07", date, "Sollte das gleiche Datum sein.");
    }

    @Test
    void testGetFileSize() {

    }

    @Test
    void testGetName() {

    }

    @Test
    void testSetName() {

    }
}
