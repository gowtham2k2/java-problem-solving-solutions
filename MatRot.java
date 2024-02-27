import java.util.Scanner;

public class MatRot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] mat = new int[r][c];
        System.out.println("Enter the matrix : ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++)
                mat[i][j] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Enter no of movements:  ");
        int noOfMovements = sc.nextInt();
        System.out.println();
        System.out.println();

        matRot(mat, noOfMovements);
        antiMatRot(mat, noOfMovements);
    }

    public static void matRot(int[][] mat, int noOfMovements) {
        int curr, prev;
        int c = 0;

        while (c++ < noOfMovements) {
            int sr = 0;
            int er = mat.length;
            int sc = 0;
            int ec = mat[0].length;
            prev = mat[sr + 1][sc];

            for (int i = sc; i < ec; i++) {
                curr = mat[sr][i];
                mat[sr][i] = prev;
                prev = curr;
            }
            sr++;

            for (int i = sr; i < er; i++) {
                curr = mat[i][ec - 1];
                mat[i][ec - 1] = prev;
                prev = curr;
            }
            ec--;

            for (int i = ec - 1; i >= sc; i--) {
                curr = mat[er - 1][i];
                mat[er - 1][i] = prev;
                prev = curr;
            }
            er--;

            for (int i = er - 1; i >= sr; i--) {
                curr = mat[i][sc];
                mat[i][sc] = prev;
                prev = curr;
            }

        }
        System.out.println("Clockwise rotation :");

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++)
                System.out.print(mat[i][j] + " ");
            System.out.print("\n");
        }
    }

    public static void antiMatRot(int[][] mat, int noOfMovements) {
        int prev, curr;
        int c = 0;
        while (c++ < noOfMovements) {
            int sr = 0;
            int er = mat.length - 1;
            int sc = 0;
            int ec = mat[0].length - 1;

            prev = mat[sr][sc + 1];

            for (int i = sr; i <= er; i++) {
                curr = mat[i][sc];
                mat[i][sc] = prev;
                prev = curr;
            }
            sc++;

            for (int i = sc; i <= ec; i++) {
                curr = mat[er][i];
                mat[er][i] = prev;
                prev = curr;
            }
            er--;

            for (int i = er; i >= sr; i--) {
                curr = mat[i][ec];
                mat[i][ec] = prev;
                prev = curr;
            }
            ec--;

            for (int i = ec; i >= sc; i--) {
                curr = mat[sr][i];
                mat[sr][i] = prev;
                prev = curr;
            }

        }
        System.out.println("AntiClock wise rotation: ");

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++)
                System.out.print(mat[i][j] + " ");
            System.out.print("\n");
        }
    }

}
