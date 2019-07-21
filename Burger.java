package com.chrisstubbs;

@SuppressWarnings("duplicates")

public class Burger {

    private String breadType;
    private String meatType;
    private double basePrice;
    private double finalPrice;
    private String name;

    private String addition1;
    private double addition1Price;

    private String addition2;
    private double addition2Price;

    private String addition3;
    private double addition3Price;

    private String addition4;
    private double addition4Price;


    public Burger() {
        this("Regular Burger", "White bread", "ham", 9.99);

    }

    public Burger(String name, String breadType, String meatType, double basePrice) {
        this.name = name;
        this.breadType = breadType;
        this.meatType = meatType;
        this.basePrice = basePrice;
    }

    public String getBreadType() {
        return breadType;
    }

    public String getMeatType() {
        return meatType;
    }


    public double getBasePrice() {
        return basePrice;
    }

    void addition1(String extraTopping, double price) {
        this.addition1 = extraTopping;
        this.addition1Price = price;
        System.out.println("Added " + addition1 + " for an extra $" + addition1Price);
    }

    void addition2(String extraTopping, double price) {
        this.addition2 = extraTopping;
        this.addition2Price = price;
        System.out.println("Added " + addition2 + " for an extra $" + addition2Price);
    }

    void addition3(String extraTopping, double price) {
        this.addition3 = extraTopping;
        this.addition3Price = price;
        System.out.println("Added " + addition3 + " for an extra $" + addition3Price);
    }

    void addition4(String extraTopping, double price) {
        this.addition4 = extraTopping;
        this.addition4Price = price;
        System.out.println("Added " + addition4 + " for an extra $ " + addition4Price);
    }

    public double itemizeBurger() {

        System.out.println(this.name + " on a " + this.breadType + " with " +
                this.meatType + " for $" + basePrice);

        if (addition1 != null) {
            finalPrice = basePrice + addition1Price;

        }

        if (addition2 != null) {
            finalPrice = basePrice + addition1Price + addition2Price;

        }

        if (addition3 != null) {
            finalPrice = basePrice + addition1Price + addition2Price + addition3Price;

        }

        if (addition4 != null) {
            finalPrice = basePrice + addition1Price + addition2Price + addition3Price + addition4Price;

        }

        return finalPrice;
    }
}
