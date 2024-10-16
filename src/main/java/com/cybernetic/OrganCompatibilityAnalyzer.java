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
        if(donorType.equals(recipientType))
            return 100;
        //if(donorType.equals(""))
        //for this I have to make a list of compatible organs and their types
        return 0;
    }

    private int calculateWeightCompatibility(int organWeight, int patientWeight) {
        if(organWeight/(patientWeight*1000)>=.8 && || organWeight/(patientWeight*1000)<=1.2)
            return 100;
        elseif(organWeight/(patientWeight*1000)>=.6 && || organWeight/(patientWeight*1000)<=1.4)
        return 50;
        else
        return 0;
    }

    private int calculateHlaCompatibility(String organHla, String patientHla) {
        //I have to break each string in a list of chars
        for(int i =0; i <6; i++)
        {

        }
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