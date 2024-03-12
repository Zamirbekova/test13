package com.site.test;

public class Box extends Shape {


    private double remainingVolume;

    Box(double volume) {
        this.remainingVolume = volume;
    }

    boolean add(Shape shape) {
        double shapeVolume = shape.getVolume();

        if (shapeVolume <= remainingVolume) {
            remainingVolume -= shapeVolume;
            return true;
        } else {
            return false;
        }
    }
}