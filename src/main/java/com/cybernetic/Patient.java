package com.cybernetic;

import java.util.ArrayList;

public class Patient {
    private String name;
    private int age;
    private String medicalHistory;
    private String installedOrgans[] = new String[5];
    private CyberneticOrgan cyberneticOrgans[]= new CyberneticOrgan[5];

    public String addOrgan(CyberneticOrgan organ)
    {
        String str = null;
        int checker = 0;
        for(int i =0; i< cyberneticOrgans.length; i++)
        {
            if(cyberneticOrgans[i] == null)
                cyberneticOrgans[i] = organ;
        }
        //checks to see if oran was added
        for(int i =0; i< cyberneticOrgans.length; i++)
        {
            if(cyberneticOrgans[i].getModel().equalsIgnoreCase(organ.getModel()))
                checker =1;
        }
        if(checker == 1)
        {
            str = "Organ Added";
        }
        else if(checker == 0)
        {
           str ="Can not accept any more organs";
        }
        return str;
    }

    public String getPatientInfo()
    {
        return "1";
    }

    public ArrayList<CyberneticOrgan> getOrganList()
    {
        int checker =0;
        ArrayList <CyberneticOrgan> cyberneticOrganAL = new ArrayList <CyberneticOrgan>();
        for(int i =0; i<cyberneticOrgans.length;i++)
        {
            if(this.cyberneticOrgans.equals(null))
            {
                checker ++;
                continue;
            }
            else
            {
                cyberneticOrganAL.add(cyberneticOrgans[i]);
            }
        }
        if(checker == 5)
        System.out.print("No organs installed. Returning empty arraylist");
        return cyberneticOrganAL;
    }
}

