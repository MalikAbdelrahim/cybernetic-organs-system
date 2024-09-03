package com.cybernetic;

import java.util.ArrayList;

public class Patient {
    private String name;
    private int age;
    private String medicalHistory;
    private ArrayList installedOrgans = new ArrayList();

    public String addOrgan(CyberneticOrgan organ)
    {
            return "1";
    }

    public String getPatientInfo()
    {
        return "1";
    }
}

