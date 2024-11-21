import Vehicle.Car;
import Vehicle.Motorcycle;
import Vehicle.TrafficLight;
import Vehicle.Truck;

public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.randomColor();
        System.out.println("Traffic Light is " + trafficLight.getColor());

        Car car = new Car(trafficLight.getColor(), "Normal");
        Motorcycle motorcycle = new Motorcycle(trafficLight.getColor(), "Aggressive");
        Truck truck = new Truck(trafficLight.getColor(), "Passive");

        car.behaviorBasedOffOfLight();
        motorcycle.behaviorBasedOffOfLight();
        truck.behaviorBasedOffOfLight();
    }
}