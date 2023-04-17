package org.example;

public class CoffeeService {
    private Storage storage;
    private Console console;
    public CoffeeService(Storage storage) {
        this.storage = storage;
    }

    public void makeCoffee(int input) throws Exception {
        switch (input) {
            case 1 -> new Cappuccino(storage).cook();
            case 2 -> new Espresso(storage).cook();
            default -> throw new Exception("Wrong input");
        }
    }

    public void uploadResources(int input, int countOfResource) throws Exception {
        switch (input) {
            case 1 -> storage.addMilk(countOfResource);
            case 2 -> storage.addWater(countOfResource);
            case 3 -> storage.addCoffee(countOfResource);
            default -> throw new Exception("Wrong input");
        }
    }
    public void start(int input) throws Exception {
        switch (input) {
            case 1 -> console.uploadResources();
            case 2 -> console.coffeeMake();
            case 3 -> System.out.println("Goodbye!");
            default -> throw new Exception("Wrong input");
        }
    }
    public void setConsole(Console console) {
        this.console = console;
    }

}
