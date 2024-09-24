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
        for(int i =1; i <array.length; i++)
            {
                int temp = list[i];
                int j = i-1;

                while(j>=0 && list[j] >temp)
                {
                    array[j+1]=array[j];
                    j--;
                }
                list[j+1]=temp;
            }
    }

    public void selectionSort()
    {
        for(int i=0; i<list.length -1; i++)
        {
            int min=i;
            for(int j=i+1; i<list.length; i++)
            {
                if(list[min]>list[j])
                {
                    min =j;
                }
            }
            int temp=list[i];
            list[i] = list[min];
            list[min]=temp;
            

        }
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
