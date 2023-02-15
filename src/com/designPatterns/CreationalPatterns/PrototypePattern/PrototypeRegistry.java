package com.designPatterns.CreationalPatterns.PrototypePattern;

import java.util.HashMap;

public class PrototypeRegistry {
    private HashMap<String, BasicCar> carsList;

    PrototypeRegistry() {
        carsList = new HashMap<>();
    }

    public void add(String name, BasicCar p) {
        carsList.put(name, p);
    }

    public BasicCar get(String name) {
        return carsList.get(name).clone();
    }
}
