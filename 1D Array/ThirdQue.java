public class ThirdQue {
    public static void main(String[] args) {
        //  int arr[] = {34,21,54,65,43};
         int arr[] = {4,3,6,7,1};
         int n = arr.length;
         int max = 0;

         for(int i=0 ; i<n ; i++)
         {
            if(arr[i]>max)
            {
                max = arr[i];
            }
         }
         System.out.println("Maximum Number Is: " + max);
    }
}
