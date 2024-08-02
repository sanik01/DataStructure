package Arrays;

public class Insertion {
    public static void main(String[] args) {
        int [] array = { 1, 2,3,4,5};
        int elementToInsert = 7;
        int indexToInsert= 2;
        array = insertElementInArray(array,elementToInsert,indexToInsert);

        System.out.println("Updated array after inserting " + elementToInsert + " at index " + indexToInsert + ":");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] insertElementInArray(int[] originalArray, int elementToInsert, int indexToInsert) {
        int[] newArray = new int[originalArray.length + 1];

        // Copy elements from original array to new array upto index
        for (int i = 0; i < indexToInsert; i++) {
            newArray[i] = originalArray[i];
        }

        // Add new element at index
        newArray[indexToInsert] = elementToInsert;

        // Copy remaining elements from original array to new array, starting from the next index after the inserted element
        for (int i = indexToInsert; i < originalArray.length; i++) {
            newArray[i + 1] = originalArray[i];
        }

        return newArray;
    }
}