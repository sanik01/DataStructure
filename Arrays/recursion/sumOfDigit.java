package recursion;

public class sumOfDigit {
    public int sumDigits(int n) {
        if(n==0){
          return n;
        }
        return n%10 + sumDigits(n/10);
      }
}
