import java.util.Scanner;

public class AverageGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, count = 0;
        while (true) {
            System.out.print("Enter a grade (or any non-numeric character to finish): ");
            if (!scanner.hasNextInt()) break;
            sum += scanner.nextInt();
            count++;
        }

        double average = (count > 0) ? (double)sum / count : 0;
        System.out.println("Average student grade is " + average);
        scanner.close();
    }
}
