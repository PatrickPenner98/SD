//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Deklaration
        double zahl1, zahl2, zahl3;
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner scanner = new Scanner(System.in);

        //Eingabe
        System.out.print("Bitte eine Zahl eingeben: ");
        zahl1 = scanner.nextDouble();
        System.out.print("Bitte eine Zahl eingeben: ");
        zahl2 = scanner.nextDouble();
        System.out.print("Bitte eine Zhal eingeben: ");
        zahl3 = scanner.nextDouble();

        //Verarbeitung
        if (zahl1 >= zahl2 && zahl1 >= zahl3) {
            System.out.print("Dein Maximum ist: " + zahl1);
        }
        else if (zahl2 >= zahl1 && zahl2 >= zahl3) {
            System.out.print("Dein Maximum ist: " + zahl2);
        }
        else if (zahl3 >= zahl1 && zahl3 >= zahl2) {
            System.out.print("Dein Maximum ist: " + zahl3);
        }
        else if (zahl1 <= zahl2 && zahl1 <= zahl3) {
            System.out.print("Dein Minimum ist: " + zahl1);
        }
        else if (zahl2 <= zahl1 && zahl2 <= zahl3) {
            System.out.print("Dein Minimum ist: " + zahl2);
        }
        else if (zahl3 <= zahl1 && zahl3 <= zahl2) {
            System.out.print("Dein Minimum ist: " + zahl3);
        }

    }
}