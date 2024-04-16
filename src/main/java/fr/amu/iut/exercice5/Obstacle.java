package fr.amu.iut.exercice5;

import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

public class Obstacle extends Rectangle {

    public Obstacle(double x, double y, double width, double height, String color) {
        super(x, y, width, height);
        super.setFill(Paint.valueOf(color));
    }

}
