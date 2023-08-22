import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        int a, b, c, large, temp;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        a = sc.nextInt();
        System.out.println("Enter the second number:");
        b = sc.nextInt();
        System.out.println("Enter the third number:");
        c = sc.nextInt();

        temp = a > b ? a : b;

        large = c > temp ? c : temp;

        System.out.println("The largest number is: " + large);
    }
}
