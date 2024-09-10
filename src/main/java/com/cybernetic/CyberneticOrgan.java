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
