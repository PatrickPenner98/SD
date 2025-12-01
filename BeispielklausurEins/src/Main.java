// Bitte tragen Sie hier Ihren Namen ein: Patrick Penner

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        // Die Funktion main sollte nicht verändert werden müssen.
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println("Willkommen zur ersten Klausur im Lernfeld 5!");
        int aufgabe;
        do {
            System.out.print("Welche Aufgabe wollen Sie ausführen (1, 2 oder 3 - 0 für Ende)? ");
            try {
                String eingabe = scanner.next();
                aufgabe = Integer.parseInt(eingabe);
                switch (aufgabe) {
                    case 1:
                        aufgabe1();
                        break;
                    case 2:
                        aufgabe2();
                        break;
                    case 3:
                        aufgabe3();
                        break;
                }
            } catch (Exception exception) {
                aufgabe = -1;
                System.out.println("Bitte geben Sie eine ganze Zahl ein!");
            }

        }
        while (aufgabe != 0);
        System.out.println("Auf Wiedersehen!");
    }


    private static void aufgabe1() {

        System.out.println("Aufgabe 1 wird ausgeführt.");
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        // Bitte hier die Bearbeitung von Java-Aufgabe 1 einfügen:

        System.out.print("1. Zahl: ");
        double zahl1 = scanner.nextDouble();
        System.out.print("2. Zahl: ");
        double zahl2 = scanner.nextDouble();
        System.out.print("3. Zahl: ");
        double zahl3 = scanner.nextDouble();

        double min = zahl1;
        double max = zahl1;

        if(zahl2 < min){
            min = zahl2;
        }
        if(zahl3 < min){
            min = zahl3;
        }
        if(zahl2 > max){
            max = zahl2;
        }
        if(zahl3 > max){
            max = zahl3;
        }

        double mittelwert = (zahl1 + zahl2 + zahl3)/3;
        double median = zahl1 + zahl2 + zahl3 - min - max;

        System.out.println("Mittelwert: " + df.format(mittelwert));
        System.out.println("Median: " + df.format(median));

        System.out.println("Aufgabe 1 ist beendet.");
    }

    private static void aufgabe2() {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println("Aufgabe 2 wird ausgeführt.");

        // Bitte hier die Bearbeitung von Java-Aufgabe 2 einfügen:

        int anzahltage = 0;
        double sonnenstundengesamt = 0;
        double maxsonnenstunden = 0;
        int maxtag = 0;
        while(true) {
            System.out.print("Sonnenstunden am " + (anzahltage + 1) + ". Tag (-1 für Ende): ");
            double eingabe = scanner.nextDouble();
            if (eingabe == -1) {
                break;
            }
            anzahltage++;
            sonnenstundengesamt += eingabe;

            if (eingabe > maxsonnenstunden) {
                maxsonnenstunden = eingabe;
                maxtag = anzahltage;
            }
        }
        double durchschnitt = sonnenstundengesamt / anzahltage;
        System.out.println("Anzahl Tage: " + df.format(anzahltage));
        System.out.println("Sonnenstunden gesamt: " + df.format(sonnenstundengesamt));
        System.out.println("Maximale Sonnenstunden: " + df.format(maxsonnenstunden) + " am " + df.format(maxtag) + ". Tag.");
        System.out.println("Durchschnittliche Sonnenstunden: " + df.format(durchschnitt));

        System.out.println("Aufgabe 2 ist beendet.");
    }

    private static void aufgabe3() {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Aufgabe 3 wird ausgeführt.");

        // Bitte hier die Bearbeitung von Java-Aufgabe 3 einfügen:

        System.out.println("Willkommen zum Endkapitalrechner");
        System.out.print("Startkapital: ");
        double startkapital = scanner.nextDouble();
        System.out.print("Jährliche Rate (am Ende des Jahres): ");
        double rate = scanner.nextDouble();
        System.out.print("Zinssatz: ");
        double zinssatz = scanner.nextDouble() / 100;
        System.out.print("Jahre: ");
        int jahre = scanner.nextInt();

        double kapital = startkapital;
        System.out.print("\n Jahre \t| Zinsen \t| Rate \t| Kapital");

        for(int jahr = 1; jahr <= jahre; jahr++) {
            double zinsen = Math.round(kapital * zinssatz * 100.0) / 100.0;
            kapital += zinsen + rate;

            System.out.print("\n" + jahr + "\t|" + df.format(zinsen) + "\t|" + df.format(rate) + "\t|" + df.format(kapital));

        }
        System.out.println("Aufgabe 3 ist beendet.");
    }


}