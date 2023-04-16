package org.example;

import java.util.Scanner;

public class Console {
    private static final int productTypes = 2;
    public static void Start() throws Exception {
        System.out.println("______________________________");
        System.out.println("Choose which coffee you want");
        System.out.println("1) Cappuccino");
        System.out.println("1) Espresso");
        System.out.println("______________________________");
        Scanner in = new Scanner(System.in);
        int input = 0;
        input = in.nextInt();
        switch (input) {
            case 1 -> Cappuccino.cook();
            case 2 -> Espresso.cook();
            default -> throw new Exception("Wrong input");
        }
    }
}
