enum TrafficLight {
    RED(30), GREEN(45), YELLOW(5);

    private final int duration;
    TrafficLight(int d) { duration = d; }
    public int getDuration() { return duration; }
}

public class TestTraffic {
    public static void main(String[] args) {
        for (TrafficLight light : TrafficLight.values())
            System.out.printf("%s: %d seconds%n", light, light.getDuration());
    }
}