package com.cybernetic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class OrganCompatibilityAnalyzer {
    private List<Organ> organs;
    private List<Patient> patients;
    private HashMap<String, List<String>> bloodTypeMap;
    

    public OrganCompatibilityAnalyzer() {
        organs = new ArrayList<>();
        patients = new ArrayList<>();
        bloodTypeMap = new HashMap<>();
        
        bloodTypeMap.put("A+", Arrays.asList("A+", "A-", "O+", "O-"));
        bloodTypeMap.put("A-", Arrays.asList("A-", "O-"));
        bloodTypeMap.put("B+", Arrays.asList("B+", "B-", "O+", "O-"));
        bloodTypeMap.put("B-", Arrays.asList("B-", "O-"));
        bloodTypeMap.put("AB+", Arrays.asList("A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"));
        bloodTypeMap.put("AB-", Arrays.asList("A-", "B-", "AB-", "O-"));
        bloodTypeMap.put("O+", Arrays.asList("O+", "O-"));
        bloodTypeMap.put("O-", Arrays.asList("O-"));
    }

    public void addOrgan(Organ organ) {
        organs.add(organ);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public int[][] createCompatibilityMatrix() {
        int[][] matrix = new int[organs.size()][patients.size() * 3]; // 3 factors: blood type, weight, HLA

        for (int i = 0; i < organs.size(); i++) {
        for (int j = 0; j < patients.size(); j++) {
            Organ organ = organs.get(i);
            Patient patient = patients.get(j);

            // Blood type compatibility
            matrix[i][j*3] = calculateBloodTypeCompatibility(organ.getBloodType(), patient.getBloodType());

            // Weight compatibility
            matrix[i][j*3 + 1] = calculateWeightCompatibility(organ.getWeight(), patient.getWeight());

            // HLA compatibility
            matrix[i][j*3 + 2] = calculateHlaCompatibility(organ.getHlaType(), patient.getHlaType());
        }
    }
        return matrix;
    }

    private int calculateBloodTypeCompatibility(String donorType, String recipientType) {
        if(donorType.equals(recipientType))
            return 100;
        
        
        for(int i =0; i < recipientType.length(); i++)
        {
            if(donorType.equals(bloodTypeMap.get(recipientType).get(i)))
            {
                return 80;
            }
        }
        return 0;
    }

    private int calculateWeightCompatibility(int organWeight, int patientWeight) {
        int kgratio= organWeight/(patientWeight*1000);
        if(kgratio>=.8 && kgratio <=1.2)
            return 100;
        else if(kgratio>=.6 && kgratio <=1.4)
        return 50;
        else
        return 0;
    }

    private int calculateHlaCompatibility(String organHla, String patientHla) {
        //I have to break each string in a list of chars
        int total=0;
        char[] organ = organHla.toCharArray();
        char[] patient = patientHla.toCharArray();
        for(int i =0; i <5; i++)
        {
            if(organ[i] == patient[i])
            {
                total++;
            }
        }
        return total*10;
    }

    public double[][] calculateWeightedCompatibility(double[] weights) {
        int[][] compatibilityMatrix = createCompatibilityMatrix();
        double[][] resultMatrix = new double[organs.size()][patients.size()];
        
        return resultMatrix;
    }


    public void displayMatrix(int[][] matrix) {
        System.out.println("Initial Compatibility Matrix:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }
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
       int[][] wMatrix = new int[2][3];
       for (int i = 0; i < wMatrix.length; i++) {
        for (int j = 0; j < wMatrix[i].length; j++) {
            Organ organ = organs.get(i);
            Patient patient = patients.get(j);
            int getBloodType =calculateBloodTypeCompatibility(organ.getBloodType(), patient.getBloodType());
            int getWeight =calculateWeightCompatibility(organ.getWeight(), patient.getWeight());
            int getHLA = calculateHlaCompatibility(organ.getHlaType(), patient.getHlaType());
            wMatrix[i][j]= (getBloodType )
        }
    }
    }

}