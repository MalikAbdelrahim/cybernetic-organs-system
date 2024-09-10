package com.cybernetic;

import java.util.ArrayList;

public class OrganInventory {
    private ArrayList <String> inventory = new ArrayList<String>();
    private ArrayList <CyberneticOrgan> cyberneticOrgan = new ArrayList<CyberneticOrgan>();

    public String addOrgan(CyberneticOrgan organ)
    {
        cyberneticOrgan.add(organ);
        return "Organ Added";
    }
    
    public String getOrgan(String model)
    {
        return "1";
    }

    public String getOrganList()
    {
        String str=null;
        for(int i=0; i<cyberneticOrgan.size(); i++)
        {
            str+= cyberneticOrgan.get(i).getModel()+" ";
        }
        return str;
    }

    public String removeOrgan(String model)
    {
        int checker =0;
        for(int i=0; i< cyberneticOrgan.size(); i++)
        {
           if(cyberneticOrgan.get(i).getModel().equalsIgnoreCase(model))
           {
                cyberneticOrgan.remove(i);
                checker++;
           }
        }
        if(checker==1)
        return "removed cybernetic organ";
        else
        return "organ not found";
    }
}
