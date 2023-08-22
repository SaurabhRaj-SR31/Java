class A {
    static int i = 0;

    A() {
        i++;
    }

    void show() {
        System.out.println("count of objects:" + i);

    }

}

public class counter {
    public static void main(String[] args) {
        A a = new A();
        new A();new A();new A();new A();
        new A();new A();new A();new A();
        a.show();
    }
}