package Vehicle;

public class Truck extends Vehicle {

    public Truck(String lightStatus, String behavior) {
        this.vehicleType = "Truck";
        this.observerStatus = lightStatus;
        this.behavior = behavior;
    }

}
