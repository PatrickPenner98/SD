import java.util.Scanner;
import java.text.DecimalFormat;
public class Beispielaufgabe2_2 {
    public static void main(String[] args) {

        //Deklarieren
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        int anzahl = 0;
        double sonnenstundengesamt = 0;
        double maxsonnenstunden = 0;
        int maxTag = 0;

        while(true) {
            System.out.print("Sonnenstunden am " + (anzahl + 1) + ". Tag (-1 für Ende): ");
            double eingabe = scanner.nextDouble();
            if(eingabe == -1){
                break;
            }
            anzahl++;
            sonnenstundengesamt += eingabe;

            if(eingabe > maxsonnenstunden){
                maxsonnenstunden = eingabe;
                maxTag = anzahl;
            }
        }

        //Ausgabe

        double durchschnitt = Math.round(sonnenstundengesamt / anzahl * 100.0)/100.0;

        System.out.println("Anzahl Tage: " + anzahl);
        System.out.println("Sonnenstunden gesamt: " + sonnenstundengesamt);
        System.out.println("Maximale Sonnenstunden: " + maxsonnenstunden + " am " + maxTag + ". Tag.");
        System.out.print("Durchschnittliche Sonnenstunden: " + df.format(durchschnitt));

    }
}
