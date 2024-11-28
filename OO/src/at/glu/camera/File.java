package at.glu.camera;

public class File {
    private String name;
    private String date;
    private int fileSize;

    public File(String name, String date, int fileSize) {
        this.name = name;
        this.date = date;
        this.fileSize = fileSize;
    }

    public String getName() {
        return name;
    }
    

    public String getDate() {
        return date;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setName(String name) {
        this.name = name;
    }  
    
}
