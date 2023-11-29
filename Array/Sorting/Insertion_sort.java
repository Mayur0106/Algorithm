// Insertion Sort 

import java.util.*;
public class Insertion_sort {
    public static void main(String[] args) {
        
        int arr[] = { 12, 11, 13, 5, -1, -111, 6, 7 };
        System.out.println("Array before sorting \n "+Arrays.toString(arr));  Ins_sort(arr);
        System.out.println("Arrays after sorting \n"+Arrays.toString(arr));
    }
    public static void Ins_sort(int []arr)
    {
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
}
