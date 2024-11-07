package at.glu.camera.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import at.glu.camera.File;

public class FileTest {
    @Test
    void testGetDate() {
        File file = new File("image.png", "2024-11-07", 6);

        String date = file.getDate();

        Assertions.assertEquals("2024-11-07", date);
    }

    @Test
    void testGetFileSize() {
        File file = new File("image.png", "2024-11-07", 6);
        
        int fileSize = file.getFileSize();

        Assertions.assertEquals(6, fileSize);
    }

    @Test
    void testGetName() {
        File file = new File("image.png", "2024-11-07", 6);
        
        String fileName = file.getName();

        Assertions.assertEquals("image.png", fileName);
    }

    @Test
    void testSetName() {
        File file = new File("image.png", "2024-11-07", 6);
        
        file.setName("new_image.png");

        Assertions.assertEquals("new_image.png", file.getName());
    }
}
