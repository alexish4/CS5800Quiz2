package Vehicle;

public class Car extends Vehicle {

    public Car(String lightStatus, String behavior) {
        this.vehicleType = "Car";
        this.observerStatus = lightStatus;
        this.behavior = behavior;
    }
}
