import java.util.Scanner;
import java.text.DecimalFormat;
public class Beispielaufgabe2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        int tagegesamt = 0;
        double sonnenstundengesamt = 0;
        double maxsonnenstunden = 0;
        int maxtag = 0;

        while (true){
            System.out.print("Sonnenstunden am" + (tagegesamt +1) + " Tag (-1 für Ende): ");
            double eingabe = scanner.nextDouble();
                if(eingabe == -1){
                    break;
                }
                if(eingabe > maxsonnenstunden){
                    maxsonnenstunden = eingabe;
                    maxtag = tagegesamt;
                }
                tagegesamt++;
                sonnenstundengesamt += eingabe;
        }
        double durchschnitt = Math.round(sonnenstundengesamt / tagegesamt *100.0)/100.0;
        System.out.println("Anzahl Tage:" + df.format(tagegesamt));
        System.out.println("Sonnenstunden gesamt: " + df.format(sonnenstundengesamt));
        System.out.println("Maximale Sonnenstunden: " + maxsonnenstunden + " am " + maxtag + ". Tag");
        System.out.println("Durchschnittliche Sonnenstunden: " + df.format(durchschnitt));
    }
}
