package at.glu.camera;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Camera {
    private String color;
    private int pixel;
    private double weight;
    private Objective objective;
    private Producer producer;
    private SDCard sdCard;
    private Resolution resolution;

    public enum Resolution{
        LOW(2), MEDIUM(4), HIGH(6);
        private final int fileSize;
        Resolution(int fileSize){
            this.fileSize = fileSize;
        }

        public int getfileSize(){
            return fileSize;
        }
    };


    public Camera(String color, int pixel, double weight, Producer producer) {
        this.color = color;
        this.pixel = pixel;
        this.weight = weight;
        this.producer = producer;
        this.resolution = Resolution.MEDIUM;
    }

    public void getObjective(Objective objective){
        this.objective = objective;
        System.out.println("Objective produced by: " + objective.getProducer().getName() + " Focallength: " + objective.getFocalLength());
    }

    public void insertSDCard(SDCard sdCard){
        this.sdCard = sdCard;
        System.out.println("SD-Card has " + sdCard.getFreeSpace() + "GB free Space");
    }

    public void getResolution(Resolution resolution){
        this.resolution = resolution;
        System.out.println("Resolution set to " + resolution);
    }

    public void takePicture(){
        int photoSize = resolution.getfileSize();
        String photoName = "Photo_" + (sdCard.getPhotoCount()+ 1);
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd_HH:mm:ss").format(Calendar.getInstance().getTime());

        File file = new File(photoName, timeStamp, photoSize);

        boolean saved = sdCard.saveFile(file);

        if (saved) {
            System.out.println("Name: " + photoName + " File Size: " + photoSize + " Date: " + timeStamp);
        }
    }

    




    
}


