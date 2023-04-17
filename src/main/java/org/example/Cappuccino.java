package org.example;

public class Cappuccino implements Coffee{

    private static int coffee = 12;
    private static int milk = 60;
    private static int water = 120;

    private Cappuccino() {
        Storage.spendResources(coffee, milk, water);
    }
    public static Cappuccino cook() throws Exception {
        if(Storage.isEnoughCoffee(coffee) && Storage.isEnoughMilk(milk) && Storage.isEnoughWater(water)) {
            print();
            return new Cappuccino();
        } else {
            return null;
        }
    }
    public static void print() {
        System.out.println("Here is your delicious coffee");
    }
    public static int getCoffee() {
        return coffee;
    }

    public static int getMilk() {
        return milk;
    }

    public static int getWater() {
        return water;
    }
}
