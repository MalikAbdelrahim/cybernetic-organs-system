package com.cybernetic;

import java.util.UUID;

public class Organ {
    private final String id;
    private final String model;
    private final String name;
    private final String functionality;
    private final String compatibility;
    private int health;


    // Update health ensuring it stays between 0 and 100
    public void updateHealth(int change) {
        health = Math.max(0, Math.min(100, health + change));
    }

    public Organ(String model, String name, String functionality, String compatibility) {
        this.id = UUID.randomUUID().toString();
        this.model = model;
        this.name = name;
        this.functionality = functionality;
        this.compatibility = compatibility;
        this.health = 100; // Initial health is 100%
    }
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public String getModel() {
        return model;
    }

    public String getFunctionality() {
        return functionality;
    }
    public String getCompatibility() {
        return compatibility;
    }


    public String getDetails() {
        return "Model: " + model + ", Organ Name: " + name + ", Functionality: " + functionality + ", Compatibility: " + compatibility + ", Health: " + health + "%";
    }


}