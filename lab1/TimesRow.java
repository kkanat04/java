public class TimesRow {
    public static void main(String[] args) {

        int factor = 7;

        // for loop
        for (int i = 1; i <= 10; i++) {
            System.out.print(factor * i + " ");
        }

        System.out.println();

        // while loop
        int i = 1;

        while (i <= 10) {
            System.out.print(factor * i + " ");
            i++;
        }
    }
}
