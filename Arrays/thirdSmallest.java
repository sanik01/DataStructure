public class thirdSmallest {
    public static void main(String[] args) {
        int arr[] = {2, 3, 1, 7, 6};
        int n = 5;
        int firstSm = arr[0];
        int secondSm = Integer.MAX_VALUE;
        int thirdSm = Integer.MAX_VALUE;
        for (int idx = 1; idx < arr.length; idx++) {
            if (arr[idx] < firstSm) { // 3 <  2 , 1 < 2
                thirdSm = secondSm;// third =  second
                secondSm = firstSm;// second = 2
                firstSm = arr[idx];// first = 1
            } else if (arr[idx] < secondSm && arr[idx] > firstSm) { // 3< 2 && 3>1
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