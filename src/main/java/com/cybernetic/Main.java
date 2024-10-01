package com.cybernetic;

public class Main{
    public static void main(String[] args){
        AlgorithmsandSorts tester = new AlgorithmsandSorts();

        long start = System.nanoTime();
        int[] array = new int[100000];

        for(int i=0; i<array.length; i++)
        {
            array[i]=i;
        }

        tester.insertionSort(array);
        //System.out.println(tester.binarySearch(bigboy, 5345));
        long duration= (System.nanoTime()-start);
        System.out.println(duration);

         
    }
}
