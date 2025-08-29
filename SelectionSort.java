import java.util.Scanner;
import java.util.Arrays;
public class SelectionSort {

    public static void InputArray(int[] arr)
    {
       Scanner sc= new Scanner(System.in);
       int n= arr.length;
       System.out.println("Enter the elements for an array:");
       for(int i=0; i<n; i++)
       {
        arr[i]= sc.nextInt();
       }

       System.out.println("The given array is =>\t" + Arrays.toString(arr));
    }

    /*public static void Swap(int[] arr,int a, int b)
    {
        int temp;
        temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }*/

    public static void SelectionSort(int[] arr)
    {
        int N=arr.length;
        for(int i=0; i<N; i++)
        {
            int min=i;
            for(int j=i; j<N; j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
           int temp=arr[i];
           arr[i]=arr[min];
           arr[min]=temp;
        }
    }

    public static int[] PrintArray(int[] arr)
    {
        System.out.println("Sorted Array=>" + Arrays.toString(arr));
        return arr;
    }
    public static void main(String[] args)
    {
        int[] array= new int[6];
        InputArray(array);
        System.out.println("Performing Selection Sorting-->");
        SelectionSort(array);
        System.out.println("Array After Sorting:");
        PrintArray(array);

    }  
}
