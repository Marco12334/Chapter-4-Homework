import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        long factorial = 1;

        for (int i = 1; i <= num; ++i) {
            factorial *= i;
        }

        System.out.println(num + "! = " + factorial);
        scanner.close();
    }
}
