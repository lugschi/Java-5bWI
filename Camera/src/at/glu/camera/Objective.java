package at.glu.camera;

public class Objective {
    private Producer producer;
    private int focalLength;

    public Objective(Producer producer,int focalLength) {
        this.producer = producer;
        this.focalLength = focalLength;
    }

    public int getFocalLength() {
        return focalLength;
    }

    public Producer getProducer() {
        return producer;
    }    
}
