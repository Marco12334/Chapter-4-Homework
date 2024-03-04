import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        boolean isPrime = true;

        if (num < 2) isPrime = false; // Check if number is less than 2
        else {
            for (int i = 2; i <= num / 2; i++) { // Check divisibility up to half the number
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) System.out.println(num + " is a prime number");
        else System.out.println(num + " is not a prime number");
        scanner.close();
    }
}
