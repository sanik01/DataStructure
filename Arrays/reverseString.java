import java.util.Scanner;
public class reverseString
{
    public static void main(String []args)
    {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String reversed = reverse(input);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverse(String str)
    {
        StringBuilder sb = new StringBuilder(str);
        int len = str.length();
        int start = 0;
        int end = len - 1;
        while (start < end) {
            char firstchar = sb.charAt(start);
            char lastchar = sb.charAt(end);
            sb.setCharAt(start, lastchar);
            sb.setCharAt(end, firstchar);
            start++;
            end--;
        }
        return sb.toString();
    }
}