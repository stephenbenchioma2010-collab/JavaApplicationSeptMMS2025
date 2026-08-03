
package polymorphism.methodoverriding;

public class TestVehicles {
    public static void main(String[] args){
        Vehicle[] vehicleItems ={
            new Car(),
            new Bike(),
            new Bus()
        };
        
        for(Vehicle vehicle : vehicleItems){
            vehicle.move();
        }
    }
}    

