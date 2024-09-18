package com.cybernetic;
import java.util.Random;

public class Main{
    public static void main(String[] args){
        Random rndChance = new Random();
        Heart heart = new Heart();
        Lungs lungs = new Lungs();
        Brain brain = new Brain();
        intialPrint(100, heart, lungs, brain);
        Simulation(100, heart, lungs, brain, rndChance);

    }

    public static void Simulation(int time, Heart heart, Lungs lungs, Brain brain, Random rndChance)
    {
        if(time == 0 || heart.getHealth()<1 || lungs.getHealth()<1 || brain.getHealth()<1)
        {        
        System.out.println("Simulation Ended");
        System.out.println("Time: " + time);
        System.out.println("Heart Health: " + heart.getHealth());
        System.out.println("Lungs Health: " + lungs.getHealth());
        System.out.println("Brain Health: " + brain.getHealth());
        if(heart.getHealth()<1 || lungs.getHealth()<1 || brain.getHealth()<1)
        {
            System.out.println("Simulation Result: Failure");
        }
        else
        {
            System.out.println("Simulation Result: Success");
        }
        return;
        }

       
        heart.healthUpdate(lungs);
        heart.pumpRateUpdate(brain);
        lungs.healthUpdate(heart);
        lungs.oxygenLevelUpdate(heart);
        brain.healthUpdate(lungs);
        brain.controlEfficiencyUpadte(lungs);
            
        
       if(rndChance.nextInt(10)==0)
       {
        int i=rndChance.nextInt(3)+1;
        switch(i){
            case 1:
                {
                    int x = rndChance.nextInt(21)-10;
                    int z = heart.getHealth() + x;
                     heart.setHealth(z);
                     heart.healthBoundsCheck();
                     System.out.println("EVENT at Time "+time+": Random health change for heat by "+x+"%");
                }
                break;
            case 2:
                {
                    int x = rndChance.nextInt(21)-10;
                    int z = lungs.getHealth() + x;
                    lungs.setHealth(z);
                    lungs.healthBoundsCheck();
                    System.out.println("EVENT at Time "+time+": Random health change for lungs by "+x+"%");
                }
                break;
            case 3:
                {
                    int x = rndChance.nextInt(21)-10;
                    int z = brain.getHealth() + x;
                    brain.setHealth(z);
                    brain.healthBoundsCheck();
                    System.out.println("EVENT at Time "+time+": Random health change for brain by "+x+"%");
                }
                break;
        }

       }

       if(heart.getHealth()<26)
       {
       System.out.println("ALERT at Time "+ time + ": Heart Critical! Health at" + heart.getHealth()+"%");
       }
       if(lungs.getHealth()<26)
       {
       System.out.println("ALERT at Time "+ time + ": Lung Critical! Health at" + lungs.getHealth()+"%");
       }
       if(brain.getHealth()<26)
       {
       System.out.println("ALERT at Time "+ time + ": Brain Critical! Health at" + brain.getHealth()+"%");
       }

       perStepOutput(time,heart,lungs,brain);

       Simulation(time-1, heart, lungs, brain, rndChance);
    }

    public static void intialPrint(int time, Heart heart, Lungs lungs, Brain brain)
    {
        System.out.println("Time: " + time);
        System.out.println("Heart Health: " + heart.getHealth());
        System.out.println("Lungs Health: " + lungs.getHealth());
        System.out.println("Brain Health: " + brain.getHealth());

    }
    
    public static void perStepOutput(int time, Heart heart, Lungs lungs, Brain brain)
    {
        System.out.println("Time: " + time);
        System.out.println("Heart Health: " + heart.getHealth()+" | Pump Rate: "+heart.getPumpRate());
        System.out.println("Lungs Health: " + lungs.getHealth()+" | Oxygen Level: "+lungs.getOxygenLevel());
        System.out.println("Brain Health: " + brain.getHealth()+" | Control Efficenecy: "+brain.getControlEfficiency());
        
    }


}
