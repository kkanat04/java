package lab3.Counter;

public class CounterDemo {
    public static void main(String[] args) {

        Counter c1 = new Counter();
        Counter c2 = new Counter();

        c1.hit();
        c1.hit();

        c2.hit();

        System.out.println("c1: " + c1.getValue());
        System.out.println("c2: " + c2.getValue());

        c1.reset();

        System.out.println("c1 after reset: " + c1.getValue());
    }
}
