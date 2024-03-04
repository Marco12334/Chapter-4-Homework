import java.util.Scanner;

public class LastCharacterOccurrence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        int lastIndex = str.lastIndexOf(ch);

        System.out.println("Last occurrence of character '" + ch + "' in \"" + str + "\" is at index " + lastIndex);
        scanner.close();
    }
}
