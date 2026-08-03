
package classwork1;

public class Car2 {
    private String brand;
    private String model;
    private Engine engine;

    public Car2(String brand, String model, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
    }
    public void showCarDetails(){
        System.out.println("Car: " + brand + " " + model);
        
        System.out.println(engine.getDetails());
    }
}
