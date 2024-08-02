public class reverseDigit {
    public static void main(String[] args) {
        int num = 12345;
        int reversed = reverseDigits(num);
        System.out.println("Original number: " + num);
        System.out.println("Reversed number: " + reversed);
    }

    public static int reverseDigits(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}