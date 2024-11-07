package at.glu.camera.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import at.glu.camera.File;
import at.glu.camera.SDCard;

public class SDCardTest {
    private SDCard sdCard;
    private File file;

    @BeforeEach
    void setUp(){
        sdCard = new SDCard(32);
        file = new File("image.png", "2024-11-07", 6);
    }


    @Test
    void testGetCapacity() {
        int capacity = sdCard.getCapacity();

        Assertions.assertEquals(32, capacity);
    }

    @Test
    void testGetFiles() {
        Assertions.assertTrue(sdCard.getFiles().isEmpty());
    }

    @Test
    void testGetFreeSpace() {
        int freeSpace = sdCard.getFreeSpace();
        Assertions.assertEquals(32, freeSpace);
    }

    @Test
    void testGetPhotoCount() {
        int photoCount = sdCard.getPhotoCount();
        Assertions.assertEquals(0, photoCount);
    }

    @Test
    void testGetUsedCapacity() {
        int usedCapacity = sdCard.getUsedCapacity();
        Assertions.assertEquals(0, usedCapacity);
    }

    @Test
    void testSaveFile() {
        sdCard.saveFile(file);

        Assertions.assertEquals(1, sdCard.getFiles().size());
        Assertions.assertEquals(6, sdCard.getUsedCapacity());
        Assertions.assertEquals(26, sdCard.getFreeSpace());
    }
}
