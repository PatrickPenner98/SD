import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Bitte die Anzahl der Fibonacci-Zahlen eingeben (0 zum beenden): ");
            int n = scanner.nextInt();
            if (n == 0) {
                System.out.println("Die eingegebene Zahl ist zu klein.");
                break;
            }
            else {
                fibonacci(n);
                System.out.println("");
            }
        }
    }

    private static void fibonacci(int n) {
        int zahl1 = 0, zahl2 = 1;
        for (int i = 0; i <= n; i++) {
            int zahl3 = zahl1 + zahl2;
            zahl1 = zahl2;
            zahl2 = zahl3;
            System.out.print(zahl1 + " ");
        }
    }
}
