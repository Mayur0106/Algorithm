import java.util.Arrays;

public class Selection {
    public static void main(String []args)
    {
        int arr[] = {64,25,12,22,11};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int []arr)
    {
        int n=arr.length-1;
        for(int i=0;i<=n;i++)
        {
            int min_idx=i;
            for(int j=i+1;j<=n;j++)
            {
                if(arr[min_idx]>arr[j])
                {
                    min_idx=j;
                }
            }

            int temp=arr[i];
            arr[i]=arr[min_idx];
            arr[min_idx]=temp;
        }
    }
}
