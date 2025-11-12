import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms (N): ");
        int N = scanner.nextInt();

        double sqrt5 = Math.sqrt(5);
        double phi = (1 + sqrt5) / 2;
        double psi = (1 - sqrt5) / 2;

        System.out.println("Fibonacci Series up to " + N + " terms (using formula):");

        for (int i = 0; i < N; i++) {
            // Binet's formula
            long fib = Math.round((Math.pow(phi, i) - Math.pow(psi, i)) / sqrt5);
            System.out.print(fib + " ");
        }

        scanner.close();
    }
}
