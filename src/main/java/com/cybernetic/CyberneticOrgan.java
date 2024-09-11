package com.cybernetic;

public class CyberneticOrgan {
    private String id;
    private String model;
    private String functionality;
    private String compatibility;

    public CyberneticOrgan(String id, String model, String functionality, String compatibility)
    {
        this.id=id;
        this.model=model;
        this.functionality=functionality;
        this.compatibility=compatibility;
    }

    public String getModel()
    {
        return model;
    }
    
    public String getFunctionality()
    {
        return functionality;
    }

    public String getid()
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
