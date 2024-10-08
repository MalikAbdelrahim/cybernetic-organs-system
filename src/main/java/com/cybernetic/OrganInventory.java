package com.cybernetic;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

public class OrganInventory {
    private ArrayList <CyberneticOrgan> inventory = new ArrayList<CyberneticOrgan>();
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
        for(int i=0; i<inventory.size(); i++)
        {
            str+= inventory.get(i).getModel()+" ";
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

    public ArrayList<CyberneticOrgan> searchOrganByFunctionality(String functionality)
    {
        ArrayList<CyberneticOrgan> listRet= new ArrayList<CyberneticOrgan>();
        for(int i =0; i<inventory.size();i++)
        {
            if(inventory.get(i).getFunctionality().equalsIgnoreCase(functionality))
            {
                listRet.add(inventory.get(i));
            }
        }
        return listRet;
    }
    
    public ArrayList<CyberneticOrgan> sortOrganByModel(ArrayList<CyberneticOrgan> listRet)
    {
        Comparator<CyberneticOrgan> com = new Comparator<CyberneticOrgan>() {
            public int compare(CyberneticOrgan i, CyberneticOrgan j)
            {
                if(i.getModel().compareTo(j.getModel())< 0)
                {
                    return 1;
                }
                else 
                return 2;
            }
        };
        Collections.sort(listRet, com);
        return listRet;
    }
}
