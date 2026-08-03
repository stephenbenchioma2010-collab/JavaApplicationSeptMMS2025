
package classwork1;

public class Engine {
    private String type;
    private int horsepower;

    public Engine(String type, int horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }
    public String getDetails(){
        return "Engine type: " + type + " | Horsepower: " + horsepower + "hp" ;
    }
}
