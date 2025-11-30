import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt();
        scanner.close();

        int firstTerm = 0, secondTerm = 1, nextTerm = 0;
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.print(firstTerm + " ");
                continue;
            }
            if (i == 2) {
                System.out.print(secondTerm + " ");
                continue;
            }
            nextTerm = firstTerm + secondTerm;
            System.out.print(nextTerm + " ");
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}