package com.comarch.szkolenia.car.rent.test;

import com.comarch.szkolenia.car.rent.model.Car;

public class Test {
    public static void main(String[] args) {
        final int x = 7;

        final Car car = new Car("BMW", "3", 2020, 300.0, "KR11");

        car.setBrand("X");

        System.out.println(car.getBrand());

        final String s = "ABC";

        /*X obiekt = new X();
        obiekt.pole = 23;*/

        X.pole = 55;

        X obiekt1 = new X();
        X obiekt2 = new X();

        obiekt1.cos1 = 55;
        obiekt1.cos2 = 2.2;

        obiekt2.cos1 = 44;
        obiekt2.cos2 = 1.1;

        System.out.println(X.pole);
        System.out.println(obiekt1.pole);
        System.out.println(obiekt2.pole);

        X.pole = 33;

        System.out.println(X.pole);
        System.out.println(obiekt1.pole);
        System.out.println(obiekt2.pole);

        obiekt1.pole = 22;

        System.out.println(X.pole);
        System.out.println(obiekt1.pole);
        System.out.println(obiekt2.pole);

        obiekt2.pole = 11;

        System.out.println(X.pole);
        System.out.println(obiekt1.pole);
        System.out.println(obiekt2.pole);
    }
}
