import java.util.Scanner;

public class SquareBoundary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = 0;
        int end = n * 2 - 1;
        int[][] arr = new int[n * 2 - 1][n * 2 - 1];

        while (n > 0) {
            for (int i = start; i < end; i++) {

                for (int j = start; j < end; j++) {
                    arr[i][j] = n;
                }
            }

            start++;
            end--;
            n--;
        }

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println();
            System.out.println();

        }
    }
}
