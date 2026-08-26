
package hospital.models;

public class Ward {
    private int id;
    private String name;
    private String wardType;
    private int capacity;
    
    public Ward(){
        
    }
    
    public int getId() {
        return id;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWardType() {
        return wardType;
    }

    public void setWardType(String wardType) {
        this.wardType = wardType;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
}
