package by.javatr.task3.util;
import java.util.Objects;

public class Ball {
    private int weight;
    private Colour colour;

    public Ball(Colour colour, int weight){
            this.colour = colour;
        if (weight > 0){
            this.weight = weight;
        }
        else
            this.weight = 1;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (null == obj) return false;
        if (getClass() != obj.getClass())  return false;
        Ball ball = (Ball) obj;
        if (weight != ball.weight)  return false;
        return ((weight == ball.weight) && (colour == ball.colour));
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, colour);
    }

    public int getWeight() {
        return weight;
    }

    public Colour getColour() {
        return colour;
    }
}
