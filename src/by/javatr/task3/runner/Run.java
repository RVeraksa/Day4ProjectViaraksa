package by.javatr.task3.runner;

import by.javatr.task3.util.Ball;
import by.javatr.task3.util.Basket;
import by.javatr.task3.util.Colour;

public class Run {
    public static void main(String[] args) {
        Ball first = new Ball(Colour.blue,2);
        Ball second = new Ball(Colour.red,3);
        Ball third = new Ball(Colour.blue,1);
        Basket basket = new Basket();
        basket.putBall(first);
        basket.putBall(second);
        basket.putBall(third);
        int weight = basket.getWeight();
        int coont_blue = basket.getCount_blue_ball();
        System.out.println("Суммарный вес мячей в корзине: "+weight+
                "\nСиних мячей в корзине: "+coont_blue);

    }

}
