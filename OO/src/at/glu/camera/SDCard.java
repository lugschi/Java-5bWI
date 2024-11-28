package at.glu.camera;

import java.util.ArrayList;

public class SDCard {
    private int capacity;
    private int usedCapacity;
    private ArrayList<File> files;

    public SDCard(int capacity) {
        this.capacity = capacity;
        this.usedCapacity = 0;
        this.files = new ArrayList<>();
    }


    public boolean saveFile(File file){
        if(usedCapacity + file.getFileSize() > capacity){
            if(this.capacity - this.usedCapacity > 0){
                System.out.println("Image(s) saved successfully!");
            } else{
                System.out.println("Memory full!");
                return false;
            }
        }
        files.add(file);
        this.usedCapacity += file.getFileSize();
        return true;
    }

    public int getPhotoCount(){
        return files.size();
    }

    public int getFreeSpace(){
        return this.capacity - this.usedCapacity;
    }


    public int getCapacity() {
        return capacity;
    }


    public int getUsedCapacity() {
        return usedCapacity;
    }


    public ArrayList<File> getFiles() {
        return files;
    }    
}
