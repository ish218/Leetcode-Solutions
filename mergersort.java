import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class mergersort {

    static void MergeSort(int arr[],int start,int end)
    {
        if(start<end)
        {
         int middle=(start+end)/2;
         MergeSort(arr, start, middle);
         MergeSort(arr, middle+1, end);
         Merge(arr,start,middle,end);
        } 
        return;
    }

    static void Merge(int arr[], int start, int middle, int end)
    {
        ArrayList<Integer> temp= new ArrayList<>();
        int left=start;
        int right=middle+1;
        while( left<=middle && right<=end)
        {
            if(arr[left]<=arr[right])
            {
                temp.add(arr[left]);
                left++;
            }
            else 
            {
                temp.add(arr[right]);
                right++;
            }
        }

            while(left<=middle)
            {
                temp.add(arr[left]);
                left++;
            }

            while(right<=end)
            {
                temp.add(arr[right]);
                right++;
            }

            for(int i=0; i<temp.size(); i++)
            {
                arr[start+i]=temp.get(i);
            }

            System.out.println(Arrays.toString(arr));
        }


    public static void PrintArray(int[] arr)
    {
        Scanner sc= new Scanner(System.in);
        int n=arr.length;
        System.out.println("Enter the elements of your array:");
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));

    }

    public static void main(String args[])
    {
        int array[]= new int[5];
        PrintArray(array);
        System.out.println("the sorted array is:");
        MergeSort(array,0,4);
    }

}
