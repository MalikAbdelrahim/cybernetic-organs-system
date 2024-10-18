package com.cybernetic;

public class OrganCompatibilityAnalyzer {

    public Patient findCompatiblePatient(Organ organ, WaitingList waitingList) {
      //TODO: week - 8 Implement this method
        System.out.println("I am on it");
       throw new UnsupportedOperationException("Not implemented yet");
    }


    private boolean isCompatible(Organ organ, Patient patient) {
        int bloodTypeScore = calculateBloodTypeCompatibility(organ.getBloodType(), patient.getBloodType());
        int weightScore = calculateWeightCompatibility(organ.getWeight(), patient.getWeight());
        int hlaScore = calculateHlaCompatibility(organ.getHlaType(), patient.getHlaType());
        return bloodTypeScore > 0 && weightScore > 0 && hlaScore > 0;
    }



    private int calculateBloodTypeCompatibility(String donorType, String recipientType) {
        //TODO: previous week Calculate compatibility for each organ-patient pair based on compatibility calculation rules.
        return 0;
    }

    private int calculateWeightCompatibility(int organWeight, int patientWeight) {
       //TODO: previous week Calculate compatibility for each organ-patient pair based on compatibility calculation rules.
        return 0;
    }

    private int calculateHlaCompatibility(String organHla, String patientHla) {
       //TODO: previous week Calculate compatibility for each organ-patient pair based on compatibility calculation rules.
        return 0;
    }



}