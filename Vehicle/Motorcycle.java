package Vehicle;

public class Motorcycle extends Vehicle {

    public Motorcycle(String lightStatus, String behavior) {
        this.vehicleType = "Motorcycle";
        this.observerStatus = lightStatus;
        this.behavior = behavior;
    }

}
