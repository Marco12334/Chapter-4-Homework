import java.util.Scanner;

public class GradeExtremes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int highest = Integer.MIN_VALUE, lowest = Integer.MAX_VALUE;

        while (true) {
            System.out.print("Enter a grade (or any non-numeric character to finish): ");
            if (!scanner.hasNextInt()) break;
            int grade = scanner.nextInt();
            if (grade > highest) highest = grade;
            if (grade < lowest) lowest = grade;
        }

        System.out.println("Highest student grade is " + highest);
        System.out.println("Lowest student grade is " + lowest);
        scanner.close();
    }
}
