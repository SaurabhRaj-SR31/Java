import java.util.Scanner;

class nondiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows :");
        int r = sc.nextInt();
        System.out.println("enter cols :");
        int c = sc.nextInt();
        int[][] a = new int[r][c];
        System.out.println("enter elements of the matrics:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }

        }
        System.out.println("Matrix:");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        int sum1 = 0;
        System.out.println("non diagonal elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i + j == (r - 1)) {
                    System.out.print(a[i][j] + " ");
                    sum1 += a[i][j];
                }
            }

        }
        System.out.println();
        System.out.println("Sum of non diagonal elements=");
        System.out.println(sum1);
        int sum2 = 0;
        System.out.println("principle diagonal elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i == j) {
                    System.out.print(a[i][j] + " ");
                    sum2 += a[i][j];
                }
            }

        }
        System.out.println();
        System.out.println("Sum of principle diagonal elements=");
        System.out.println(sum2);

    }
}
