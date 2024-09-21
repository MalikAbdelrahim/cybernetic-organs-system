public class AlgorithmsandSorts {

    array[] list = new array[0];

    public AlgorithmsandSorts(array[] Array)
    {
        list = array;
    }

    public void bubblesort()
    {
        for(int i=0; i<list.length -1; i++)
            {
                for(int j=0; i<list.length -i - 1; i++)
                {
                    if(array[j]>array[j+1])
                    {
                        int temp=array[j];
                        array[j]=array[j+1];
                        array[j+1]=temp;

                    }
                }
            }
    }

    public void insertionSort()
    {
        
    }

    public void selectionSort()
    {
        
    }

    public void mergeSort()
    {

    }

    public void linearSearch()
    {

    }

    public void binarySearch()
    {

    }
}
