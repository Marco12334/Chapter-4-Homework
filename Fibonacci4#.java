public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 30, firstTerm = 0, secondTerm = 1;
        System.out.println("First 30 values in the Fibonacci series:");
        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
