import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String originalString = scanner.nextLine();
        String reversedString = new StringBuilder(originalString).reverse().toString();

        System.out.println("Reverse of \"" + originalString + "\" is \"" + reversedString + "\"");

        if (originalString.equals(reversedString)) {
            System.out.println("String value \"" + originalString + "\" and its reverse \"" + reversedString + "\" are equal");
        } else {
            System.out.println("String value \"" + originalString + "\" and its reverse \"" + reversedString + "\" are not equal");
        }
        scanner.close();
    }
}
