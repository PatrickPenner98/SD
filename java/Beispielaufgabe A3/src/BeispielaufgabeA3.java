import java.util.Scanner;
import java.text.DecimalFormat;

public class BeispielaufgabeA3 {
    public static void main(String[] args) {
        aufgabe3();
    }

    public static void aufgabe3() {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Willkommen zum Endkapitalrechner");
        System.out.print("Startkapital: ");
        double startkapital = scanner.nextDouble();
        System.out.print("Jährliche Rate (am Ende des Jahres): ");
        double rate = scanner.nextDouble();
        System.out.print("Zinssatz (%): ");
        double zinssatz = scanner.nextDouble() / 100;
        System.out.print("Anzahl Jahre: ");
        int jahre = scanner.nextInt();

        double kapital = startkapital;

        System.out.println("\n Jahr |\tZinsen |\tRate |\tKapital");
        for (int jahr = 1; jahr <= jahre; jahr++) {
            double zinsen = Math.round(kapital * zinssatz * 100.0) / 100.0;
            kapital += zinsen + rate;
            System.out.println(jahr + "\t|\t" + df.format(zinsen) + "\t|\t" + df.format(rate) + "\t|\t" + df.format(kapital));
        }
    }
}
