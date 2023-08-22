import java.util.Scanner;

public class digit {
    public static void main(String[] args) {
        int a, b, c, d;
        System.out.println("enter choice a/b:");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        for (a = 1; a < 5; a++) {
            for (b = 1; b < 5; b++) {
                for (c = 1; c < 5; c++) {
                    for (d = 1; d < 5; d++) {
                        switch (ch) {
                            case 'a':

                                System.out.println(+a + " " + b + " " + c + " " + d);
                                break;
                            case 'b':
                                if (!(a == b || a == c || a == d || b == c || b == d || c == d))
                                    System.out.println(+a + " " + b + " " + c + " " + d);
                                break;

                        }
                    }
                }
            }

        }

    }
}
