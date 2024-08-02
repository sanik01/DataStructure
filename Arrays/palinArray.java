public class palinArray {
    public static void main(String[] args) {
        int[] arr = {121, 222, 232, 101};
        boolean isPalindromeArray = true;

        for (int i = 0; i < arr.length; i++) {
            int number = arr[i];
            int reverse = 0;

            while (number != 0) {
                int remaining = number % 10;
                reverse = reverse * 10 + remaining;
                number /= 10;
            }

            if (number != reverse) {
                isPalindromeArray = false;
                break;
            }
        }

        if (isPalindromeArray) {
            System.out.println("The array contains only palindromic numbers.");
        } else {
            System.out.println("The array contains at least one non-palindromic number.");
        }
    }
}
