//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class MA2c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Willkommen beim Quersummenrechner!");
        System.out.print("Bitte Zahlen für die Quersumme eingeben (0 für Ende): ");
        int zahl = scanner.nextInt();
        int ergebnis = quersumme(zahl);
        System.out.println("Die Quersummer von " + zahl + " ist " + ergebnis);
    }

    private static int quersumme(int zahl){
        int summe = 0;
        while (zahl != 0) {
            summe += zahl % 10;
            zahl /= 10;
        }
        return summe;
    }
}