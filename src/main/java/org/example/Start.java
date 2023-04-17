package org.example;

public class Start {
    public static void start() throws Exception {
        Storage storage = new Storage();
        CoffeeService service = new CoffeeService(storage);
        Console console = new Console(service);
        service.setConsole(console);
        console.start();
    }
}
