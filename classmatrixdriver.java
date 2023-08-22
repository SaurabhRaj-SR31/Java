import java.util.Scanner;

class matrix {
    int r;
    int c;
    int m[][];

    matrix(int r, int c) {
        this.r = r;
        this.c = c;
        m = new int[r][c];
    }

    void insert() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                m[i][j] = sc.nextInt();

            }
        }
    }

    void display() {
        System.out.println();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(m[i][j] + " ");

            }
            System.out.println();
        }
    }

    matrix add(matrix a, matrix b) {
        if (a.r != b.r || a.c != b.c) {
            System.out.println("invalid matrix!!");
        }

        matrix x = new matrix(r, c);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                x.m[i][j] = a.m[i][j] + b.m[i][j];

            }
        }
        return x;

    }

    matrix mul(matrix b) {
        if (this.c != b.r) {
            System.out.println("invalid matrix!!");
        }

        matrix x = new matrix(this.c, b.r);
        for (int i = 0; i < x.r; i++) {
            for (int j = 0; j < x.c; j++) {
                for (int k = 0; k < this.c; k++)
                    x.m[i][j] = this.m[i][k] * b.m[k][j];

            }
        }
        return x;

    }
    matrix check(matrix b)
    {
        if (this.r != b.r || this.c != b.c) {
            System.out.println("invalid matrix!!");
        }

        matrix x = new matrix(r, c);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if(this.m[i][j]==b.m[i][j]*2){
                x.m[i][j] = this.m[i][j] - b.m[i][j];
                
                }
                else 
                {
                    x=b;
                }
            }
            }
            return x;
        }
        
    }


public class classmatrixdriver {
    public static void main(String[] args) {
        matrix a = new matrix(2, 2);
        matrix b = new matrix(2, 2);
        a.insert();
        b.insert();
        a.display();
        b.display();
        // matrix x = a.add(a, b);
       // x.display();
        matrix x = a.check(b);

        x.display();
    }
}
