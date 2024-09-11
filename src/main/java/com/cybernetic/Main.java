package com.cybernetic;
 
public class Main {
    public static void main(String[] args) {
        Patient patient =  new Patient("john", 34, "na");
        OrganInventory inventory = new OrganInventory();
        CyberneticOrgan organ1 = new CyberneticOrgan("ORG001", "CyberHeartX1", "Pumps blood", "Type O");
        CyberneticOrgan organ2 = new CyberneticOrgan("ORG002", "CyberEyeV2", "Enhanced vision", "Type A");
        System.out.println("Adding organs to inventory...");

        inventory.addOrgan(organ1);
        inventory.addOrgan(organ2);
        }
    }
