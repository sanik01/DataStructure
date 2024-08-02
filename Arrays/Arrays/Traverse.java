// An array is a collection of items stored at contiguous memory locations.

public class Traverse {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int searchElement = 6;
        int index = -1;
        int currentIndex = 0;

        while (currentIndex < numbers.length) {
            if (numbers[currentIndex] == searchElement) {
                index = currentIndex;
                break;
            }
            currentIndex++;
        }

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
// Time Complexity  = O(n)
// space Complexity = O(1)
