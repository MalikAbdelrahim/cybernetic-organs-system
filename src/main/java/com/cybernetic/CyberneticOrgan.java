package com.cybernetic;

public class CyberneticOrgan {
    private int id;
    private String model;
    private String functionality;
    private boolean compatibility;

    public String getDetails()
    {
        String ret = "ID:"+this.id+" Model:"+this.model+" Functionality: "+this.functionality;
        return ret;
    }

    public boolean isCompatible(String patientCompatibility)
    {
        if(patientCompatibility.equals("yes"))
        return true;
        else
        return false;
    }

}
