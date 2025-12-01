//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) {

        //Deklaration
        double fixKosten, herstellungskosten, erloes, gewinn;
        int anzahl;
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");


        //Eingabe
        System.out.print("Bitte geben sie die fixen Kosten ein: ");
        fixKosten = scanner.nextDouble();
        System.out.print("Bitte geben sie die Herstellungskosten fuer die Produktion ein: ");
        herstellungskosten = scanner.nextDouble();
        System.out.print("Bitte geben sie den Erloes ein: ");
        erloes = scanner.nextDouble();
        System.out.print("Bitte geben sie die Anzahl der Produkte ein: ");
        anzahl = scanner.nextInt();

        //Verarbeitung
        gewinn = (erloes * anzahl) - (fixKosten + (herstellungskosten * anzahl));

        //Asugabe
        System.out.println("Der Gewinn betraegt: " + gewinn + "Euro");

    }
}