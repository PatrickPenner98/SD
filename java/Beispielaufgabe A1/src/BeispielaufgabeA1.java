import java.util.Scanner;
import java.text.DecimalFormat;

public class BeispielaufgabeA1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Zahl1: ");
        double zahl1 = scanner.nextDouble();
        System.out.print("Zahl2: ");
        double zahl2 = scanner.nextDouble();
        System.out.print("Zahl3: ");
        double zahl3 = scanner.nextDouble();

        double min = zahl1;
        double max = zahl1;

        if (zahl2 < min) {
            min = zahl2;
        }
        if (zahl3 < min) {
            min = zahl3;
        }

        if (zahl2 > max) {
            max = zahl2;
        }
        if (zahl3 > max) {
            max = zahl3;
        }

        double median = zahl1 + zahl2 + zahl3 - min - max;
        double mittelwert = (zahl1 + zahl2 + zahl3) / 3;

        System.out.println("Mittelwert: " + df.format(mittelwert));
        System.out.println("Median: " + df.format(median));
    }
}
