package org.example;

public class Storage {
    private static int coffee = 100;
    private static int milk = 10;
    private static int water = 1000;

    public Storage() {
    }

    public boolean isEnoughMilk(int neededMilk) throws Exception{
        if(neededMilk > milk) {
            throw new Exception("Not enough milk");
        } else {
            return true;
        }
    }
    public boolean isEnoughWater(int neededWater) throws Exception {
        if(neededWater > water) {
            throw new Exception("Not enough water");
        } else {
            return true;
        }
    }
    public boolean isEnoughCoffee(int neededCoffee) throws Exception {
        if(neededCoffee > coffee) {
            throw new Exception("Not enough coffee");
        } else {
            return true;
        }
    }

    public void spendResources(int coffee, int milk, int water) {
        Storage.coffee = Storage.coffee - coffee;
        Storage.milk = Storage.milk - milk;
        Storage.water = Storage.water - water;
    }
    public void addCoffee(int coffee) {
        Storage.coffee = Storage.coffee + coffee;
    }
    public void addMilk(int milk) {
        Storage.milk = Storage.milk + milk;
    }
    public void addWater(int water) {
        Storage.water = Storage.water + water;
    }
}
