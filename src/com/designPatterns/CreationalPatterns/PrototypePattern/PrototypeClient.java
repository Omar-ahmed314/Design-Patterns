package com.designPatterns.CreationalPatterns.PrototypePattern;

public class PrototypeClient {
    public static void main(String[] args) {
        // some code will be written here

        // instantiate the cars registry
        PrototypeRegistry reg = new PrototypeRegistry();

        // Cars
        Ford fordCar = new Ford();
        Nano nanoCar = new Nano();

        // add the cars to the registry
        reg.add("Ford", fordCar);
        reg.add("Nano", nanoCar);

        // get the cars clones
        Ford cloneFord = (Ford) reg.get("Ford");
        Nano cloneNano = (Nano) reg.get("Nano");

        // Print the cars
        cloneFord.show();
        cloneNano.show();
    }
}
