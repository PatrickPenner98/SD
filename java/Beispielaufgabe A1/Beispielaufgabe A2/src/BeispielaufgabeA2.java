import java.util.Scanner;
import java.text.DecimalFormat;

public class BeispielaufgabeA2 {
    public static void main(String[] args) {
        aufgabe2();
    }

    public static void aufgabe2() {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double summeSonnenstunden = 0;
        double maxSonnenstunden = Double.MIN_VALUE;
        int maxTag = 0;
        int anzahlTage = 0;

        while (true) {
            System.out.print("Sonnenstunden am " + (anzahlTage + 1) + ". Tag (-1 für Ende): ");
            double sonnenstunden = scanner.nextDouble();

            if (sonnenstunden == -1) {
                break;
            }

            anzahlTage++;
            summeSonnenstunden += sonnenstunden;

            if (sonnenstunden > maxSonnenstunden) {
                maxSonnenstunden = sonnenstunden;
                maxTag = anzahlTage;
            }
        }

        if (anzahlTage > 0) {
            double durchschnittSonnenstunden = summeSonnenstunden / anzahlTage;
            System.out.println("Anzahl Tage: " + anzahlTage);
            System.out.println("Sonnenstunden gesamt: " + df.format(summeSonnenstunden));
            System.out.println("Maximale Sonnenstunden: " + df.format(maxSonnenstunden) + " am " + maxTag + ". Tag");
            System.out.println("Durchschnittliche Sonnenstunden: " + df.format(durchschnittSonnenstunden));
        } else {
            System.out.println("Keine Daten eingegeben.");
        }
    }
}
