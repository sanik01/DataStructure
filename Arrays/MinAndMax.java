/**
 * Class to find the minimum and maximum element in an array.
 */
public class MinAndMax {

    /**
     * Method to find the minimum and maximum element in an array.
     *
     * @param array The input array.
     * @param size  The size of the array.
     * @return The sum of the minimum and maximum elements in the array.
     */
    public static int findMinAndMax(int[] array, int size) {
        if (array == null || size <= 0) {
            throw new IllegalArgumentException("Invalid input array.");
        }

        int min = array[0];
        int max = array[0];

        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }

        return min + max;
    }

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 5, 3, 6};
        int arraySize = 5;

        System.out.println("The sum of the minimum and maximum elements is: " + findMinAndMax(inputArray, arraySize));
    }
}