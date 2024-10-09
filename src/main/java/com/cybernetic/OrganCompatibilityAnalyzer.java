package com.cybernetic;

import java.util.ArrayList;
import java.util.List;

public class OrganCompatibilityAnalyzer {
    private List<Organ> organs;
    private List<Patient> patients;

    public OrganCompatibilityAnalyzer() {
        organs = new ArrayList<>();
        patients = new ArrayList<>();
    }

    public void addOrgan(Organ organ) {
        organs.add(organ);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public int[][] createCompatibilityMatrix() {
        int[][] matrix = new int[organs.size()][patients.size() * 3]; // 3 factors: blood type, weight, HLA

        //TODO:  Calculate compatibility for each organ-patient pair

        return matrix;
    }

    private int calculateBloodTypeCompatibility(String donorType, String recipientType) {
        //TODO: Calculate compatibility for each organ-patient pair based on compatibility calculation rules.
        return 0;
    }

    private int calculateWeightCompatibility(int organWeight, int patientWeight) {
       //TODO: Calculate compatibility for each organ-patient pair based on compatibility calculation rules.
        return 0;
    }

    private int calculateHlaCompatibility(String organHla, String patientHla) {
       //TODO: Calculate compatibility for each organ-patient pair based on compatibility calculation rules.
        return 0;
    }

    public double[][] calculateWeightedCompatibility(double[] weights) {
        int[][] compatibilityMatrix = createCompatibilityMatrix();
        double[][] resultMatrix = new double[organs.size()][patients.size()];

        //TODO: calculate the weighted compatibility for each organ-patient pair

        return resultMatrix;
    }


    public void displayMatrix(int[][] matrix) {
        System.out.println("Initial Compatibility Matrix:");

       //TODO: complete the displayMatrix method to display the initial compatibility matrix

    }

    public void displayWeightMatrix(double[] weights) {
        System.out.println("\nWeight Matrix:");
        for (double weight : weights) {
            System.out.printf("%.2f  ", weight);
        }
        System.out.println();
    }

    public void displayWeightedMatrix(double[][] matrix) {
        System.out.println("\nFinal Weighted Compatibility Matrix:");
        System.out.print("     ");
       //TODO: complete the displayWeightedMatrix method to display the final weighted compatibility matrix
    }

}