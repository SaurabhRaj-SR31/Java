import java.util.Scanner;

class player {
    String name;
    String id;
    int prize;

    player() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name:");
        this.name = sc.nextLine();
        System.out.println("enter id:");

        this.id = sc.nextLine();

        this.prize = 100;

    }

    void display(player p[], int n) {
        System.out.println("name:" + name);

        System.out.println("id:" + id);

        System.out.println("prize:" + calculateprize(p, n));
    }

    int calculateprize(player p[], int n) {
        int total = 0;
        for (int i = 0; i < n; i++) {
            total = (i + 1) * prize;
        }
        return total;
    }
}

class playerdriver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of players:");
        int n = sc.nextInt();
        player p[] = new player[n];
        for (int i = 0; i < n; i++) {
            p[i] = new player();
            p[i].calculateprize(p, n);
        }
        System.out.println("enter player no. you want to win:");
        int i = sc.nextInt();
        p[i].display(p, n);
    }
}