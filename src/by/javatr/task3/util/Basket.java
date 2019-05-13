package by.javatr.task3.util;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Ball> b = new ArrayList<>();
    private int weight;
    private int count_blue_ball;

    public void putBall(Ball ball){
        if (ball.getWeight()<=0){
            return;  //exception
        }
        this.b.add(ball);
        this.weight += ball.getWeight();
        if (ball.getColour() == Colour.blue){
            count_blue_ball++;
        }
    }

    public int getWeight() {
        return weight;
    }

    public int getCount_blue_ball() {
        return count_blue_ball;
    }
}

