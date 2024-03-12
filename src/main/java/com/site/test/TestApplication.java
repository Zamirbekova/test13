package com.site.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
//
//        int n = 5;
//        if (n >= 2) {
//            second(n);
//        } else {
//            System.out.println("n cannot be less than 2");
//        }
//    }
//
//    static void second(int n) {
//        for (int i = 0; i < n; i++) {
//
//            for (int j = 0; j < n - i - 1; j++) {
//                System.out.print(" ");
//            }
//
//            for (int j = 0; j < i * 2 + 1; j++) {
//                System.out.print("#");
//            }
//
//            System.out.println();
//        }
//    }
//
//
//    public void firstTask() {
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz" + i);
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz" + i);
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz" + i);
//
//            }
//        }
//    }


    Box box = new Box(1000);

    Pyramid pyramid = new Pyramid(10, 5);
    Cylinder cylinder = new Cylinder(3);
    SolidOfRevolution solid = new SolidOfRevolution(4);

        if (box.add(pyramid)) {
        System.out.println("Пирамида добавлена в коробку");
    } else {
        System.out.println("Недостаточно места для пирамиды в коробке");
    }

        if (box.add(cylinder)) {
        System.out.println("Цилиндр добавлен в коробку");
    } else {
        System.out.println("Недостаточно места для цилиндра в коробке");
    }

        if (box.add(solid)) {
        System.out.println("Тело вращения добавлено в коробку");
    } else {
        System.out.println("Недостаточно места для тела вращения в коробке");
    }
}
}








