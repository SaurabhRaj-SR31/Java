class Complex {
    int real;
    int img;

    Complex() {

        real = 0;
        img = 0;
    }

    Complex(int real, int img) {
        this.real = real;
        this.img = img;
    }

    void add(Complex a, Complex b) {
        this.real = a.real + b.real;
        this.img = a.img + b.img;
    }
    void add(int real, Complex b) {
        this.real = real + b.real;
        this.img =   b.img;
    }

    void display() {
        System.out.println(real +"+"+ img + "i");
    }

}

public class complexdriver {
    public static void main(String[] args) {
        Complex a = new Complex(2, 3);
        a.display();
        Complex b = new Complex(3, 4);
        b.display();
        Complex c = new Complex();
        c.add(a,b);
        
        c.display();
        c.add(10,b);
        c.display();

    }
}
