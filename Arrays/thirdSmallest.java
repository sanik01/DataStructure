public class thirdSmallest {
    public static void main(String[] args) {
        int arr[] = {2, 3, 1, 7, 6};
        int n = 5;
        int firstSm = arr[0];
        int secondSm = Integer.MAX_VALUE;
        int thirdSm = Integer.MAX_VALUE;
        for (int idx = 1; idx < arr.length; idx++) {
            if (arr[idx] < firstSm) {
                thirdSm = secondSm;
                secondSm = firstSm;
                firstSm = arr[idx];
            } else if (arr[idx] < secondSm && arr[idx] > firstSm) {
                thirdSm = secondSm;
                secondSm = arr[idx];
            } else if (arr[idx] < thirdSm && arr[idx] > secondSm) {
                thirdSm = arr[idx];
            }
        }
        if (thirdSm == Integer.MAX_VALUE) {
            System.out.println("No third smallest element");
        } else {
            System.out.println("Third smallest element is: " + thirdSm);
        }
    }
}