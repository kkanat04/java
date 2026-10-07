package lab2;

public class Calc {

    public static int add(int a, int b) {
        return a + b;
    }


    public static double add(double a, double b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double multiply(double a, double b) {
       return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("division by zero");
            return 0.0;
        }

        return (double) a / b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("division by zero");
            return 0.0;
        }

        return a / b;
    }

    public static void main(String[] args) {

        System.out.println("add(3,5) = " + add(3, 5));
        System.out.println("add(10,20) = " + add(10, 20));


        System.out.println("multiply(4,6) = " + multiply(4, 6));
        System.out.println("multiply(5,7) = " + multiply(5, 7));

        System.out.println("divide(7,2) = " + divide(7, 2));
        System.out.println("divide(10,4) = " + divide(10, 4));

        System.out.println("divide(7,0) = " + divide(7, 0));
    }
}
