public class FirstQue {
    public static void main(String[] args) {

        // int arr[] = { 3, 20, 4, 6, 9 };
        int arr[] = {4,3,6,7,1};
        int num = arr.length;
        int sum = 0;

        for (int i = 0; i < num; i++) {
            if (i % 2 == 0) {
                // System.out.println(arr[i]);
                sum += arr[i];
            }
        }
        System.out.println("Sum of elements present on even indices : " + sum);

    }
}