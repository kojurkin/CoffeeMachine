package org.example;

public class Service {
    public static void makeCoffee(int input) throws Exception {
        switch (input) {
            case 1 -> Cappuccino.cook();
            case 2 -> Espresso.cook();
            default -> throw new Exception("Wrong input");
        }
    }

    public static void uploadResources(int input, int countOfResource) throws Exception {
        switch (input) {
            case 1 -> Storage.addMilk(countOfResource);
            case 2 -> Storage.addWater(countOfResource);
            case 3 -> Storage.addCoffee(countOfResource);
            default -> throw new Exception("Wrong input");
        }
    }
    public static void start(int input) throws Exception {
        switch (input) {
            case 1 -> Console.UploadResources();
            case 2 -> Console.CoffeeMake();
            case 3 -> System.out.println("Goodbye!");
            default -> throw new Exception("Wrong input");
        }
    }

}
