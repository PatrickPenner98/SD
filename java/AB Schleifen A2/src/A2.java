//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class A2 {
    public static void main(String[] args) {

        //Deklaration
        Scanner scanner = new Scanner(System.in);
        int eingabe, anzahl = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        System.out.println("Bitte eine positive Zahl eingeben(0 zum Beenden): ");

        //Eingabe
        for(;;) { // Semikolon für Endlose for-Schleifen
            System.out.print((anzahl + 1) + ". Wert: ");
            eingabe = scanner.nextInt();

            if (eingabe == 0) {
                break;
            }
            if (eingabe < min) {
                min = eingabe;
            }
            if (eingabe > max) {
                max = eingabe;
            }
            anzahl++;
        }
        if(anzahl > 0){
            System.out.println("Es waren " + anzahl + " eingegebene Zahlen.");
            System.out.println("Minimum war: " + min);
            System.out.println("Maximum war: " + max);
        } else {
            System.out.print("\nEs wurden keine Zahlen eingegeben.");
        }
    }
}