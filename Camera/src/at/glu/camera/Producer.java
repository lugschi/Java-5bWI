package at.glu.camera;

public class Producer {
    private String name;
    private String land;


    public Producer(String name, String land) {
        this.name = name;
        this.land = land;
    }
    
    public String getName() {
        return name;
    }
    public String getLand() {
        return land;
    }
    public void setName(String name) {
        this.name = name;
    }


    
}
