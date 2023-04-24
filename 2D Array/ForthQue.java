public class ForthQue {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 4, 0 },
                        { 2, 5, 7, -1 },
                        { 4, 2, 6, 9 }};

        int rows = arr.length;
        int cols = arr[0].length;
        int num =0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(arr[i][j]>num)
                {
                    num = arr[i][j];
                }
            }
        }
        System.out.println("Largest Number Is: " + num);
    }
}
