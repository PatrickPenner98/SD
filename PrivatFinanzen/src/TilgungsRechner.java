import java.util.Scanner;
import java.text.DecimalFormat;
public class TilgungsRechner {
    public static void main(String[] args) {

        jahrestilgung();
    }

    private static void monatstilgung(){
        System.out.println("Dies ist die monatliche Berechnung der Tilgung.");
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        //Deklaration

        int monate = 12;
        double mtlzahlung = 0;
        double zinssatz = 0;
        double zins = 0;
        double restschuld = 0;

        // Eingabe

        System.out.print("Tilgungsrate monatlich: ");
        mtlzahlung = scanner.nextDouble();
        System.out.print("Zinssatz: ");
        zinssatz = scanner.nextDouble()/100;
        System.out.print("Bitte die Höhe des Kredits angeben: ");
        restschuld = scanner.nextDouble();

        // Verarbeitung

        zins = Math.round(restschuld * zinssatz / 12 /100.0)*100.0;
        double tilgung = mtlzahlung - zins;
        restschuld -= tilgung;
        System.out.print("\n Monat \t| Tilgung \t| Zins \t| Restschuld");

        for(int monat = 1; monat <= monate; monat++){
            if(monate == 0){
                break;
            }
            zins = (restschuld * zinssatz / 12);
            tilgung = mtlzahlung - zins;
            restschuld -= tilgung;

            //Ausgabe
            System.out.print("\n\t" + monat + "\t|" + df.format(tilgung) + "\t|" + df.format(zins) + "\t|" + df.format(restschuld));

        }
    }
    public static void jahrestilgung(){
        System.out.println("Dies ist die Jährliche Berechnung der Tilgung.");
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        //Deklaration

        int jahre = 40;
        double mtlzahlung = 0;
        double zinssatz = 0;
        double zins = 0;
        double restschuld = 0;
        int monate = 60;

        // Eingabe

        System.out.print("Tilgungsrate monatlich: ");
        mtlzahlung = scanner.nextDouble() *12;
        System.out.print("Zinssatz: ");
        zinssatz = scanner.nextDouble()/100;
        System.out.print("Bitte die Höhe des Kredits angeben: ");
        restschuld = scanner.nextDouble();

        // Verarbeitung

        zins = Math.round(restschuld * zinssatz /100.0)*100.0;
        double tilgung = mtlzahlung - zins;
        restschuld -= tilgung;
        System.out.print("\n Jahr \t| Tilgung \t| Zins \t| Restschuld");

        for(int jahr = 1; jahr <= jahre; jahr++) {
            if (jahre == 0) {
                break;
            }
            if(restschuld <= tilgung){
                break;
            }
            zins = (restschuld * zinssatz);
            tilgung = mtlzahlung - zins;
            restschuld -= tilgung;

            if (restschuld <= tilgung) {
                restschuld += tilgung;
                break;
            }
            //Ausgabe
            System.out.print("\n\t" + jahr + "\t|" + df.format(tilgung) + "\t|" + df.format(zins) + "\t|" + df.format(restschuld));
        }
        System.out.println("");
        System.out.print("\n Monat \t| Tilgung \t| Zins \t| Restschuld");
        for(int monat = 1; monat <= monate; monat++) {
            zins = (restschuld * zinssatz / 12);
            tilgung = (mtlzahlung /12) - zins;
            restschuld -= tilgung;

            if (restschuld < 0) {
                break;
            }

            //Ausgabe
            System.out.print("\n\t" + monat + "\t|" + df.format(tilgung) + "\t|" + df.format(zins) + "\t|" + df.format(restschuld));
        }
    }
}