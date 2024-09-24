package com.cybernetic;

public class AlgorithmsandSorts {

    public AlgorithmsandSorts()
    {

    }

    public void bubblesort(int[] list)
    {
        for(int i=0; i<list.length -1; i++)
            {
                for(int j=0; i<list.length -i - 1; i++)
                {
                    if(list[j]>list[j+1])
                    {
                        int temp=list[j];
                        list[j]=list[j+1];
                        list[j+1]=temp;

                    }
                }
            }
    }

    public void insertionSort(int[] list)
    {
        for(int i =1; i <list.length; i++)
            {
                int temp = list[i];
                int j = i-1;

                while(j>=0 && list[j] > temp)
                {
                    list[j+1]=list[j];
                    j--;
                }
                list[j+1]=temp;
            }
    }

    public void selectionSort(int[] list)
    {
        for(int i=0; i<list.length -1; i++)
        {
            int min=i;
            for(int j=i+1; j<list.length; j++)
            {
                if(list[min] > list[j])
                {
                    min =j;
                }
            }
            int temp=list[i];
            list[i] = list[min];
            list[min]=temp;
            

        }
    }

    public void mergeSort(int[] list)
    {
        int length=list.length;
        if(length<=1) return;

        int middle = length/2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];
        int i =0;
        int j =0;
        for(; i<length; i++)
        {
            if(i<middle)
            {
                leftArray[i]=list[i];
            }
            else{
                rightArray[j]=list[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, list);
    }

    public void merge(int[] leftArray, int[]rightArray, int[] orgArray)
    {
        int leftSize= orgArray.length/2;
        int rightSize= orgArray.length-leftSize;
        int i=0, l=0, r=0;
        
        while(l < leftSize && r < rightSize)
        {
            if(leftArray[l] < rightArray[r])
            {
                orgArray[i]=leftArray[l];
                i++;
                l++;
            }
            else 
            {
                orgArray[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while(l<leftSize)
        {
            orgArray[i]=leftArray[l];
            i++;
            l++;
        }
        while(r<rightSize)
        {
            orgArray[i]=rightArray[r];
            i++;
            r++;
        }
    }

    public int linearSearch(int[] list, int value)
    {
        for(int i =0; i<list.length; i++)
        {
            if(list[i] == value) 
            return i;
        }
        return -1;
    }

    public void binarySearch()
    {

    }
}
