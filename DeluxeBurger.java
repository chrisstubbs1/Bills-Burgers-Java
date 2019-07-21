package com.chrisstubbs;

public class DeluxeBurger extends Burger {
    public DeluxeBurger() {
        super("Deluxe", "Hawaiian", "Steak", 12.99);
        super.addition1("Drink",1.89);
        super.addition2("Chips", .99);
    }

    @Override
    void addition1(String extraTopping, double price) {

    }

    @Override
    void addition2(String extraTopping, double price) {
        System.out.println("Cannot add additional items to deluxe burger");
    }

    @Override
    void addition3(String extraTopping, double price) {
        System.out.println("Cannot add additional items to deluxe burger");
    }

    @Override
    void addition4(String extraTopping, double price) {
        System.out.println("Cannot add additional items to deluxe burger");
    }
}
