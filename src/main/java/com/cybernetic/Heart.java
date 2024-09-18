package com.cybernetic;

import java.util.Random;


public class Heart {
    private int pumpRate = 70;
    private int health = 100;
    Random randomFluctuation = new Random();

    public void pumpRateUpdate(Brain brain)
    {
        pumpRate = pumpRate + (brain.getControlEfficiency() / 10) - 5 + randomFluctuation.nextInt(7)-4;

        if(pumpRate>100)
        pumpRate=100;
        if(pumpRate<40)
        pumpRate=40;

    }

    public void healthUpdate(Lungs lung)
    {
        health= health+ (-1 + (lung.getOxygenLevel() / 25) - 2);
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

    public int getPumpRate()
    {
        return pumpRate;
    }

    public int getHealth()
    {
        return health;
    }

}
