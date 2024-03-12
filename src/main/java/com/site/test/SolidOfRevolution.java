package com.site.test;

public class SolidOfRevolution extends Shape {

    double radius;

    SolidOfRevolution(double radius) {
        this.radius = radius;
        this.volume = calculateVolume();
    }

    private double calculateVolume() {
        // Реализуйте расчет объема для фигуры SolidOfRevolution по необходимым формулам
        return 0.0;
    }
}
