import java.util.Scanner;
import java.util.Arrays;

public class linearSearch {


    public static void PrintArray(int[] arr)
    {
        Scanner sc= new Scanner(System.in);
        int n=arr.length;
        System.out.println("Enter the Elements of the Array: ");
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The given array is=>"+ Arrays.toString(arr));
    }

    public static void LinearSearch(int[] arr, int Target)
    {
        int N=arr.length;
        int flag=0;
        for(int i=0; i<N; i++)
        {
            if(arr[i]==Target)
            {
                System.out.println("Element found!\n" + "At the position\t+" + i);
                flag=1;
            }
        }
        if(flag==0)
        {
            System.out.println("Element is not present in the array");
        }
    
    }
    public static void main (String[] args)
    {
        int[] array= new int[6];
        PrintArray(array);
        LinearSearch(array, 45);

    }
    
}
