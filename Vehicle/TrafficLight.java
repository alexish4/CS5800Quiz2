package Vehicle;

public class TrafficLight {
    String color;

    public String getColor() {
        return color;
    }

    public void randomColor() {
        int RED_INDEX = 0;
        int GREEN_INDEX = 1;
        int YELLOW_INDEX = 2;

        double randomDouble = Math.random();
        int colorIndex = (int) ((Math.random() * ((YELLOW_INDEX + 1) - RED_INDEX)) + RED_INDEX);

        if (colorIndex == RED_INDEX) {
            color = "green";
        }
        else if (colorIndex == GREEN_INDEX) {
            color = "yellow";
        }
        else if (colorIndex == YELLOW_INDEX) {
            color = "red";
        }
    }
}
