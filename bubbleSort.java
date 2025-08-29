import java.util.Scanner;
import java.util.Arrays;

public class bubbleSort {
    
    public static void InputArray(int[] arr)
    {
        Scanner sc= new Scanner(System.in);
        int n=arr.length;
        System.out.println("Enter the elements for the array");
        for(int i=0; i<n; i++)
        {
            arr[i]= sc.nextInt();        
        }
        System.out.println("The array is ==> \t" + Arrays.toString(arr));
    }

    public static void BubbleSort(int[] arr)
    {
        int N= arr.length;
        for(int i=0; i<N; i++)
        {
            for(int j=0; j<N-i-1; j++)
            {
                if(arr[j+1]<arr[j])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void PrintArray(int[] arr) //when i am trying to reverse the array so i can print it in descending order
    {
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<n &&high>=0)
        {
            System.out.println(arr[high]);
            low++;
            high--;
        }
    }
    public static void main(String[] args)
    {
        int[] array= new int[5];
        InputArray(array);
        System.out.println("Performing the Bubble Sort");
        BubbleSort(array);
        PrintArray(array);        

    }
}
