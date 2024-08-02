package Arrays;

 public class UpdateElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int indexToUpdate = 2;
        int newValue = 20;

        updateElement(array, indexToUpdate, newValue);

        System.out.println("Updated array after changing the element at index " + indexToUpdate + " to " + newValue + ":");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void updateElement(int[] array, int indexToUpdate, int newValue) {
        if (indexToUpdate >= 0 && indexToUpdate < array.length) {
            array[indexToUpdate] = newValue;
        } else {
            System.err.println("Index out of bounds. Cannot update the element.");
        }
    }
} 
    

