interface CarbonFootprint {
    double getCarbonFootprint(); // kg CO2 per year
}

class Building implements CarbonFootprint {
    private double sqMeters;
    private double electricityPerSqm;
    public Building(double sm, double ep) {sqMeters=sm; electricityPerSqm=ep;}
    public double getCarbonFootprint() {
        // example: 0.5 kg CO2 per kWh
        return sqMeters*electricityPerSqm*12*0.5;
    }
}
class Car implements CarbonFootprint {
    private double kmPerYear;
    private double litersPer100km;
    public Car(double km,double lpk) {kmPerYear=km; litersPer100km=lpk;}
    public double getCarbonFootprint() {
        // ~2.3 kg CO2 per liter petrol
        return (kmPerYear/100)*litersPer100km*2.3;
    }
}
class Bicycle implements CarbonFootprint {
    private double kmPerYear;
    public Bicycle(double km) {kmPerYear=km;}
    public double getCarbonFootprint() {
        // very low — ~0.01 kg CO2/km (food energy)
        return kmPerYear*0.01;
    }
}

// Test
import java.util.ArrayList;
public class CarbonTest {
    public static void main(String[] args) {
        ArrayList<CarbonFootprint> list = new ArrayList<>();
        list.add(new Building(200,150));
        list.add(new Car(15000,7.0));
        list.add(new Bicycle(2000));
        for (CarbonFootprint c : list) {
            System.out.printf("Type: %s | Footprint: %.2f kg CO2/year%n",
                c.getClass().getSimpleName(), c.getCarbonFootprint());
        }
    }
}