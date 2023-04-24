public class FifthQue {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4, 5 },
                        { 3, 4, 5, 6, 7 },
                        { 7, 6, 5, 4, 3 },
                        { 8, 7, 6, 5, 4 },
                        { 1, 2, 37, 8, 0 }};

        int rows = arr.length;
        int cols = arr[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
              if(j== rows/2 )
              {
                System.out.print(arr[i][j] + "  ");
              }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
            if( i ==cols/2 && i!=j)
              {
                System.out.print(arr[i][j] + "  ");
              }
            }
        }
        
    }
}
