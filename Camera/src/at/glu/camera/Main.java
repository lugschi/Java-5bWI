package at.glu.camera;

public class Main {
    public static void main(String[] args) {
        Producer cameraProducer = new Producer("Canon", "Japan");
        Producer lensProducer = new Producer("Sony", "Japan");

        Camera camera = new Camera("black", 200, 500, cameraProducer);

        Objective objective = new Objective(lensProducer, 50);
        camera.getObjective(objective);

        SDCard sdCard = new SDCard(32);
        camera.insertSDCard(sdCard);

        camera.getResolution(Camera.Resolution.HIGH);       

        for (int i = 0; i < 5; i++) {
            camera.takePicture();
        }

        camera.insertSDCard(sdCard);
    }
}
