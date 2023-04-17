package org.example;

import java.util.Scanner;

public class Console {

    public static void start() throws Exception {
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
            Service.start(input);
        } while (input != 3);
    }

    public static void uploadResources() throws Exception {
        System.out.println("______________________________");
        System.out.println("What resource do you want to replenish?");
        System.out.println("1) Milk");
        System.out.println("2) Water");
        System.out.println("2) Coffee");
        System.out.println("______________________________");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        Scanner load = new Scanner(System.in);
        System.out.println("How much resource do you want to add?");
        int resourcesCount = load.nextInt();
        Service.uploadResources(input, resourcesCount);
    }
    public static void coffeeMake() throws Exception{
        System.out.println("______________________________");
        System.out.println("Choose which coffee you want");
        System.out.println("1) Cappuccino");
        System.out.println("2) Espresso");
        System.out.println("______________________________");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        Service.makeCoffee(input);
    }
}
