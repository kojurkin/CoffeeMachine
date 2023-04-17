package org.example;

public class Espresso  implements Coffee{

    private int coffee = 12;
    private int water = 100;
    private Storage storage;

    public Espresso(Storage storage) {
        this.storage = storage;
    }
    public Espresso cook() throws Exception {
        if(storage.isEnoughCoffee(coffee) && storage.isEnoughWater(water)) {
            storage.spendResources(coffee, 0, water);
            print();
            return this;
        } else {
            return null;
        }
    }
    public void print() {
        System.out.println("Here is your delicious coffee");
    }
    @Override
    public int getCoffee() {
        return coffee;
    }

    @Override
    public int getMilk() {
        return 0;
    }
    @Override
    public int getWater() {
        return water;
    }
}

