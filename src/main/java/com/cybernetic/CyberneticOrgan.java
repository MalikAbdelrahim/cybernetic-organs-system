package com.cybernetic;

public class CyberneticOrgan {
    private int id;
    private String model;
    private String functionality;
    private String compatibility;

    public String getModel()
    {
        return model;
    }
    
    public String getFunctionality()
    {
        return functionality;
    }

    public int getid()
    {
        return id;
    }

    public String getCompatibility()
    {
        return compatibility;
    }

    public String getDetails()
    {
        String ret = "ID:"+this.id+" Model:"+this.model+" Functionality: "+this.functionality;
        return ret;
    }

    public boolean isCompatible(String patientCompatibility)
    {
        if(patientCompatibility.equals("1"))
        return true;
        else
        return false;
    }

}
