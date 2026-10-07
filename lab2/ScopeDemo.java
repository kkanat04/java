package lab2;

public class ScopeDemo {

    public static int bump(int n) {
        n = n + 10;
        return n;
    }

    public static void main(String[] args) {

        int x = 5;
        int y = bump(x);

        System.out.println("x = " + x); // 5
        System.out.println("y = " + y); // 15
    }

    /*
     * Метод bump получает копию переменной x, а не саму исходную переменную.
     */
}
