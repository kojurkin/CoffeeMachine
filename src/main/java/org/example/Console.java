package org.example;

import java.util.Scanner;

public class Console {
    private CoffeeService service;

    public Console(CoffeeService service) {
        this.service = service;
    }

    public void start() throws Exception {
        int input;
        do {
            System.out.println("______________________________");
            System.out.println("Select one of the menu items");
            System.out.println("1) Replenish the stock of resources");
            System.out.println("2) Make coffee");
            System.out.println("3) Close");
            System.out.println("______________________________");
            Scanner in = new Scanner(System.in);
            input = in.nextInt();
            service.start(input);
        } while (input != 3);
    }

    public void uploadResources() throws Exception {
        System.out.println("______________________________");
        System.out.println("What resource do you want to replenish?");
        System.out.println("1) Milk");
        System.out.println("2) Water");
        System.out.println("3) Coffee");
        System.out.println("______________________________");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        if(input > 3 || input < 0) {
            throw new Exception("Wrong input");
        }
        Scanner load = new Scanner(System.in);
        System.out.println("How much resource do you want to add?");
        int resourcesCount = load.nextInt();
        service.uploadResources(input, resourcesCount);
    }
    public void coffeeMake() throws Exception{
        System.out.println("______________________________");
        System.out.println("Choose which coffee you want");
        System.out.println("1) Cappuccino");
        System.out.println("2) Espresso");
        System.out.println("______________________________");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        service.makeCoffee(input);
    }
}
