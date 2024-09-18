package com.cybernetic;
import java.util.Random;


public class Lungs {
    private int oxygenLevel = 95;
    private int health = 100;
    Random randomFluctuation = new Random();


    public void oxygenLevelUpdate(Heart heart)
    {

        oxygenLevel = oxygenLevel + (heart.getPumpRate() / 20) - 3 + randomFluctuation.nextInt(3)-2;

        if(oxygenLevel>100)
        oxygenLevel=100;
        if(oxygenLevel<70)
        oxygenLevel=70;
        
    }

    public void healthUpdate(Heart heart)
    {
        health = health + (-1 + (heart.getPumpRate() / 25) - 2);
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

    public int getOxygenLevel()
    {
        return oxygenLevel;
    }

    public int getHealth()
    {
        return health;
    }
}
