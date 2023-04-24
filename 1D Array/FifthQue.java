public class FifthQue {
    public static void main(String[] args) {
      
        // int arr[] = {1,4,7,3,2,6,5};
        int arr[] = {1,3,2,6,5};
        
        int n = arr.length;

        for(int i=1; i<n-1 ; i++)
        {
            if((arr[i]> arr[i+1]) &&  (arr[i] > arr[i-1]))
            {
                System.out.println("Peak Element Is : " + arr[i]);
                break;
            }
        }
       
    }
}
