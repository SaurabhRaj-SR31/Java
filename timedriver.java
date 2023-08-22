
class Time {
    int hr;
    int min;
    int sec;

    Time() {
        hr = 0;
        min = 0;
        sec = 0;
    }

    Time(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }

    void add(Time a, Time b) {
       this. hr = a.hr + b.hr;
       this. min = a.min + b.min;
        if (min > 59) {
            min -= 60;
            hr++;
        }
        this.sec = a.sec + b.sec;
        if (sec > 59) {
            sec -= 60;
            min++;
        }

    }

    void display() {
        System.out.println(hr + ":" + min + ":" + sec);
    }
}

public class timedriver {
    public static void main(String[] args) {
        Time a = new Time(2, 30, 15);
        a.display();
        Time b = new Time(3, 40, 20);
        b.display();

        Time c = new Time();
        c.add(a, b);
        System.out.print("SUM=");
        c.display();
    }
}
