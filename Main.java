package com.chrisstubbs;

public class Main {

    public static void main(String[] args) {

        Burger b1 = new Burger();
        b1.addition1("Cheese", 1);
        b1.addition2("Lettuce", 2);
        b1.itemizeBurger();

        HealthyBurger h1 = new HealthyBurger("Turkey", 8.50);
        h1.addition1("Egg", 1);
        h1.addHealthyAddition1("Lentil", 3);
        System.out.println("Final price is $"+ h1.itemizeBurger());

        DeluxeBurger d1 = new DeluxeBurger();
        System.out.println(d1.itemizeBurger());
    }
}
