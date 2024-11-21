package Vehicle;

public abstract class Vehicle {
    protected String observerStatus;
    protected String vehicleType;
    protected String behavior;

    public void setObserverStatus(String observerStatus) {
        this.observerStatus = observerStatus;
    }

    public void behaviorBasedOffOfLight() {
        System.out.println("Vehicle Type is: " + vehicleType);
        if(behavior.equals("Aggressive")) {
            if(observerStatus.equals("red")) {
                System.out.println("Slam Brakes");
            }
            else if(observerStatus.equals("yellow")) {
                System.out.println("Faster");
            }
            else if(observerStatus.equals("green")) {
                System.out.println("Need4Speed");
            }
        }
        if(behavior.equals("Normal")) {
            if(observerStatus.equals("red")) {
                System.out.println("Stop");
            }
            else if(observerStatus.equals("yellow")) {
                System.out.println("Slow");
            }
            else if(observerStatus.equals("green")) {
                System.out.println("Go");
            }
        }
        if(behavior.equals("Passive")) {
            if(observerStatus.equals("red")) {
                System.out.println("Stop");
            }
            else if(observerStatus.equals("yellow")) {
                System.out.println("Slower");
            }
            else if(observerStatus.equals("green")) {
                System.out.println("Go Slow");
            }
        }
    }
}
