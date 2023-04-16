package org.example;

import java.util.Scanner;

public class Console {
    public static void Start() throws Exception {
        System.out.println("______________________________");
        System.out.println("Choose which coffee you want");
        System.out.println("1) Cappuccino");
        System.out.println("2) Espresso");
        System.out.println("______________________________");
        Scanner in = new Scanner(System.in);
        int input = 0;
        input = in.nextInt();
        Service.makeCoffee(input);
    }

    public static void UploadResources() throws Exception {
        System.out.println("______________________________");
        System.out.println("What resource do you want to replenish?");
        System.out.println("1) Milk");
        System.out.println("2) Water");
        System.out.println("2) Coffee");
        System.out.println("______________________________");
        Scanner in = new Scanner(System.in);
        int input = 0;
        input = in.nextInt();
        Scanner load = new Scanner(System.in);
        System.out.println("How much resource do you want to add?");
        int resourcesCount = load.nextInt();
        Service.uploadResources(input, resourcesCount);
    }
}
