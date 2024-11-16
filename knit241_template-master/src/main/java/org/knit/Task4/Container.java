package org.knit.Task4;

import java.util.ArrayList;

public class Container {
    public double containerVolume = 1000;
    public ArrayList<Shape> figure = new ArrayList<>();

    public void add(Shape shape){
        if (shape.getVolume() <= containerVolume) {
            containerVolume -= shape.getVolume();
            figure.add(shape);
        }
        else {
            System.out.println("Фигуру невозможно добавить");
        }
    }

    public double getContainerVolume() {
        return containerVolume;
    }
}
