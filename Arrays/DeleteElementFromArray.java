public class DeleteElementFromArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int elementToDelete = 3;
        array = deleteElement(array, elementToDelete);

        System.out.println("Updated array after deleting " + elementToDelete + ":");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] deleteElement(int[] array, int elementToDelete) {
        int[] newArray = new int[array.length - 1];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != elementToDelete) {
                newArray[index] = array[i];
                index++;
            }
        }
        return newArray;
    }
}
