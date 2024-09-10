package com.cybernetic;

import java.util.ArrayList;

public class Patient {
    private String name;
    private int age;
    private String medicalHistory;
    private String installedOrgans[] = new String[5];
    private String CyberneticOrgan[]= new String[5];


    public String addOrgan(CyberneticOrgan organ)
    {
        String str = null;
        int checker = 0;
        for(int i =0; i< CyberneticOrgan.length; i++)
        {
            if(CyberneticOrgan[i] == null)
                CyberneticOrgan[i] = organ.getModel();
        }
        for(int i =0; i< CyberneticOrgan.length; i++)
        {
            if(CyberneticOrgan[i].equalsIgnoreCase(organ.getModel()))
                checker =1;
        }
        
        if(checker == 1)
        {
            str = "Organ Added";
            return str;
        }
        else if(checker == 0)
        {
           str ="Can not accept any more organs";
           return str;
        }
    }

    public String getPatientInfo()
    {
        return "1";
    }
}

