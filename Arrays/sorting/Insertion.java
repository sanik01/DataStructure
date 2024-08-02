package sorting;
import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Unsorted Array: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        int size = arr.length;

        for (int step = 1; step < size; step++) {
            int key = arr[step];
            int j = step - 1;

            // Compare key with each element on the left of it until an element smaller than
            // it is found.
            // For descending order, change key<arr[j] to key>arr[j].
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                --j;
            }

            // Place key at after the element just smaller than it.
            arr[j + 1] = key;
        }
    }
}