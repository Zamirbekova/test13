package com.site.test;

public class Pyramid extends Shape {

    double s;
    double h;

    Pyramid(double s, double h) {
        this.s = s;
        this.h = h;
        this.volume = (1.0 / 3.0) * s * h;
    }
}
