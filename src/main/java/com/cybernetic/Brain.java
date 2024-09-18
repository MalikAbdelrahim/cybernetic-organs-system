package com.cybernetic;
import java.util.Random;


public class Brain {
    private int controlEfficiency = 90;
    private int health = 100;
    Random randomFluctuation = new Random();

    public void controlEfficiencyUpadte(Lungs lung)
    {
        controlEfficiency = controlEfficiency + (lung.getOxygenLevel() / 20) - 3 + randomFluctuation.nextInt(3)-2;

        if(controlEfficiency>100)
        controlEfficiency=100;
        if(controlEfficiency<70)
        controlEfficiency=70;
    }

    public void healthUpdate(Lungs lung)
    {
        health = health + (-1 + (lung.getOxygenLevel() / 25) - 2);
        if(health >100)
        health=100;
        if(health<0)
        health=0;
    }

    public void healthBoundsCheck()
    {
        if(health >100)
        health=100;
        if(health<0)
        health=0;
    }

    public void setHealth(int health)
    {
        this.health=health;
    }

    public int getHealth()
    {
        return health;
    }
    
    public int getControlEfficiency()
    {
        return controlEfficiency;
    }
}
