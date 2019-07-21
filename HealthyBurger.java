package com.chrisstubbs;

public class HealthyBurger extends Burger {

    private String healthyExtra1;
    private double healthyExtra1Price;

    private String healthyExtra2;
    private double healthyExtra2Price;

    public HealthyBurger(String meatType, double basePrice) {
        super("Healthy Burger", "Rye", meatType, basePrice);

    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1 = name;
        this.healthyExtra1Price = price;
        System.out.println("Added " + healthyExtra1 + " for an extra $" + healthyExtra1Price);
    }

    public void addHealthyExtra2(String name, double price) {
        this.healthyExtra2 = name;
        this.healthyExtra2Price = price;
        System.out.println("Added " + healthyExtra2 + " for an extra $" + healthyExtra2Price);
    }

    @Override
    public double itemizeBurger() {
        double healthyBurgerPrice = super.itemizeBurger();

        if (this.healthyExtra1 != null) {
            healthyBurgerPrice += this.healthyExtra1Price;
        }

        if (this.healthyExtra2 != null) {
            healthyBurgerPrice = healthyBurgerPrice + this.healthyExtra1Price + this.healthyExtra2Price;

        }

        return healthyBurgerPrice;
    }
}
