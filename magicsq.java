
import java.util.Scanner;

class magicsq {

    static boolean isMagicSquare(int mat[][], int r, int c) {

        int sum = 0;
        for (int i = 0; i < r; i++)
            sum = sum + mat[i][i];

        for (int i = 0; i < r; i++) {

            int rowSum = 0;
            for (int j = 0; j < c; j++)
                rowSum += mat[i][j];

            if (rowSum != sum)
                return false;
        }

        for (int i = 0; i < r; i++) {

            int colSum = 0;
            for (int j = 0; j < c; j++)
                colSum += mat[j][i];

            if (sum != colSum)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows :");
        int r = sc.nextInt();
        System.out.println("enter cols :");
        int c = sc.nextInt();
        int[][] mat = new int[r][c];
        System.out.println("enter elements of the matrics:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }

        }
        System.out.println("Matrix:");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        if (isMagicSquare(mat, r, c))
            System.out.println("Magic Square");
        else
            System.out.println("Not a magic Square");
    }
}