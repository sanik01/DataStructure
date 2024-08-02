public class factorial {
    public long calculate(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculate(n - 1);
    }
}
