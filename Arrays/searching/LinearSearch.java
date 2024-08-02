package searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 45, 67, 89};
        int key = 7;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index " + i);
                break;
            }
           
        }
        if(key != -1) {
            System.out.println("Element not found in the array");
        }

        
    }
}