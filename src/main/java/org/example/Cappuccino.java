package org.example;

public class Cappuccino implements Coffee{

    private int coffee = 12;
    private int milk = 60;
    private int water = 120;
    private Storage storage;

    public Cappuccino(Storage storage) {
        this.storage = storage;
    }

    public Cappuccino cook() throws Exception {
        if(storage.isEnoughCoffee(coffee) && storage.isEnoughMilk(milk) && storage.isEnoughWater(water)) {
            storage.spendResources(coffee, milk, water);
            print();
            return this;
        } else {
            return null;
        }
    }
    public static void print() {
        System.out.println("Here is your delicious coffee");
    }
    @Override
    public int getCoffee() {
        return coffee;
    }
    @Override
    public int getMilk() {
        return milk;
    }
    @Override
    public int getWater() {
        return water;
    }
}
