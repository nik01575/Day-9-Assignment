public class FirstQue {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, -3, 4 },
                { 0, 0, -4, 2 },
                { 1, -1, 2, 3 },
                { -4, -5, -7, 0 } };

        int rows = arr.length;
        int cols = arr[0].length;

        int pos = 0;
        int neg = 0;
        int odd = 0;
        int even = 0;
        int zero = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == 0) {
                    zero++;
                } else if (arr[i][j] > 0) {
                    pos++;
                } else if (arr[i][j] < 0) {
                    neg++;
                }
                if (arr[i][j] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }

        }
        System.out.println("number of positive numbers " + pos);
        System.out.println("number of negative numbers " + neg);
        System.out.println("number of odd numbers " + odd);
        System.out.println("number of even numbers " + even);
        System.out.println("number of 0 : " + zero);
    }
}
