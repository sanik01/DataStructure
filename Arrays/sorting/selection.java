package sorting;

public class selection {
    public static void main(String[] args) {
        int arr[] = {90,43,12,45,13};
        int  n = 5;
        for (int i = 0; i < arr.length ; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
            System.out.print(arr[i] + " ");
        }
      // first set the first  element as minimum and then compare it with other elements
      // and if minIndex  is not equal to i that means we have found a smaller number so swap them  with  first element 
            

            
        
    }
}
