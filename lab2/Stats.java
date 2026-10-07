package lab2;

public class Stats {

    public static int sum(int[] values) {
        int result = 0;

        for (int value : values) {
            result += value;
        }

        return result;
    }

    public static double average(int[] values) {
        return (double) sum(values) / values.length;
    }

    public static int max(int[] values) {
        int maximum = values[0];

        for (int value : values) {
            if (value > maximum) {
                maximum = value;
            }
        }

        return maximum;
    }

    public static void main(String[] args) {

        int[] values = {80, 90, 70, 100};

        System.out.println("sum = " + sum(values));
        System.out.println("average = " + average(values));
        System.out.println("max = " + max(values));
    }
}
