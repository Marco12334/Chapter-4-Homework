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
            System.out.println("Both strings are of equal length");
        }

        int result = str1.compareTo(str2);
        if (result < 0) {
            System.out.println("String \"" + str1 + "\" appears before String \"" + str2 + "\" in lexicographic order");
        } else if (result > 0) {
            System.out.println("String \"" + str1 + "\" appears after String \"" + str2 + "\" in lexicographic order");
        } else {
            System.out.println("Both strings are lexicographically equal");
        }

        System.out.println("New sentence created is \"" + str1 + " " + str2 + "\"");
        scanner.close();
    }
}
