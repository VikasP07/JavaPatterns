
import java.util.Scanner;

public class Pattern2 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter the number: ");

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }

            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }

            System.out.println();
        }
    }
}
