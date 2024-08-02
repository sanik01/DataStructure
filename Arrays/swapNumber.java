public class swapNumber {
    public static void main(String[] args) {
     int num1 = 5, num2 = 10, temp;
        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
    }
}

