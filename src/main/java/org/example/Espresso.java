package org.example;

public class Espresso  implements Coffee{

    private static int coffee = 12;
    private static int water = 100;

    private Espresso() {
        Storage.spendResources(coffee, 0, water);
    }
    public static void cook() throws Exception {
        if(Storage.isEnoughCoffee(coffee) && Storage.isEnoughWater(water)) {
            print();
            new Espresso();
        }
    }
    public static void print() {
        System.out.println("Here is your delicious coffee");
    }
    public static int getCoffee() {
        return coffee;
    }

    public static int getWater() {
        return water;
    }
}
