package barbershop.Model;

public class Service {

    private int id;
    private String name;
    private float value;

    public Service(int id, String description, float value) {
        this.id = id;
        this.name = description;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return name;
    }

    public void setDescription(String description) {
        this.name = description;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
   

}