package at.glu.camera;

public class Producer {
    private String name;
    private String country;


    public Producer(String name, String country) {
        this.name = name;
        this.country = country;
    }
    
    public String getName() {
        return name;
    }
    public String getCountry() {
        return country;
    }
    public void setName(String name) {
        this.name = name;
    }


    
}
