import java.util.Arrays;
class quicksort
{
    public static void QuickSort(int[] array, int first, int last)
    {
        if(first<last){
        int  pivot=Partition(array,first,last);
        QuickSort(array,first,pivot-1);
        QuickSort(array, pivot+1, last);
    }
}

    public static int Partition(int[] arr, int first, int last)
    {
        int pivot=arr[first];
        int i=first;
        int j=last;
        while(i<=j)
        {
            while(arr[i]<=pivot && i<last)
            {
                i++;
            }
            while(arr[j]>pivot && j>first)
            {
                j--;
            }
            if(i<j)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            
        }
        int temp=arr[first];
            arr[first]=arr[j];
            arr[j]=temp;

            return j;
        
    }
    public static void main(String[] args)
    {
        int[] array1=new int[]{12,23,4,56,43,67,87,32};
        System.out.println("Array before Sorting:");
        System.out.println(Arrays.toString(array1));
        System.out.println("Array after being sorted:");
        QuickSort(array1,0,array1.length-1);
        System.out.println(Arrays.toString(array1)) ;
    }
}