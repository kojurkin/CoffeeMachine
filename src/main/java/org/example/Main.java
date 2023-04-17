package org.example;

public class Main {
    public static void main(String[] args) throws Exception {
        Storage storage = new Storage();
        CoffeeService service = new CoffeeService(storage);
        Console console = new Console(service);
        service.setConsole(console);
        console.start();
    }
}