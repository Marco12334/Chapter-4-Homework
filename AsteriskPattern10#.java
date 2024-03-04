public class AsteriskPattern {
    public static void main(String[] args) {
        for (int i = 6; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after printing each row of stars
        }
    }
}
