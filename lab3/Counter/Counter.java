package lab3.Counter;

public class Counter {

    int value;

    public Counter() {
        value = 0;
    }

    public void hit() {
        value++;
    }

    public int getValue() {
        return value;
    }

    public void reset() {
        value = 0;
    }
}
