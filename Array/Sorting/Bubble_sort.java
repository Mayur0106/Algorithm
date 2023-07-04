import java.util.Arrays;
public class Bubble_sort {
    public static void main(String []args)
    {
        int arr[] = {64,25,12,22,11};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int []arr)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            boolean swap=true;
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=false;
                }
            }
            if(swap)
            {
                break;
            }
        }
    }
}
