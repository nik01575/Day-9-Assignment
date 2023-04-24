import java.util.Arrays;

public class ForthQue
{
    public static void main(String[] args) {
        int arr[] = {34,21,54,65,43};
        // int arr[] = {4,3,6,7,1};
        Arrays.sort(arr);
        int n = arr.length;
        int secMax = 0;

        for(int i=0; i<n-1 ; i++)
        {
            if(arr[i]>secMax)
            {
                secMax = arr[i];
            }
        }
        System.out.println("Second Largest Element Is : " + secMax);
    }
}