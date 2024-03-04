import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        if (str1.length() > str2.length()) {
            System.out.println("String \"" + str1 + "\" is longer than String \"" + str2 + "\"");
        } else if (str1.length() < str2.length()) {
            System.out.println("String \"" + str2 + "\" is longer than String \"" + str1 + "\"");
        } else {
            System.out.println("Both
