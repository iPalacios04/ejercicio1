import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        System.out.println("Enter a list of positive integers (enter a negative number to end):");

        while (true) {
            int number = scanner.nextInt();

            if (number < 0) {
                break;
            }

            if (number < min) {
                min = number;
            }

            if (number > max) {
                max = number;
            }
        }

        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);

        scanner.close();
    }
}
