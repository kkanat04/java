public class DigitCount {
    public static void main(String[] args) {

        int number = 50280;

        int count = 0;

        if (number == 0) {
            count = 1;
        } else {
            while (number > 0) {
                number = number / 10;
                count++;
            }
        }

        System.out.println("Digits: " + count);
    }
}
