package com.cybernetic;

import java.util.ArrayList;

public class Patient {
    private String name;
    private int age;
    private String medicalHistory;
    private String installedOrgans[] = new String[5];
    private String cyberneticOrgan[]= new String[5];

    public String addOrgan(CyberneticOrgan organ)
    {
        String str = null;
        int checker = 0;
        for(int i =0; i< cyberneticOrgan.length; i++)
        {
            if(cyberneticOrgan[i] == null)
                cyberneticOrgan[i] = organ.getModel();
        }
        for(int i =0; i< cyberneticOrgan.length; i++)
        {
            if(cyberneticOrgan[i].equalsIgnoreCase(organ.getModel()))
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

    public ArrayList getOrganList()
    {
        int checker =0;
        ArrayList <String> cyberneticOrganAL = new ArrayList <String>();
        for(int i =0; i<cyberneticOrgan.length;i++)
        {
            if(this.cyberneticOrgan.equals(null))
            {
                checker +=1;
                continue;
            }
            else
            {
                cyberneticOrganAL.add(cyberneticOrgan[i]);
            }
        }
        if(checker == 4)
        System.out.print("No organs installed. Returning empty arraylist");
        return cyberneticOrganAL;
    }
}

