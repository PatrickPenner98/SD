//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Bereich {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte eine Zahl eingeben: ");
        int zahl = scanner.nextInt();
        System.out.print("Ergebnis für " + zahl + ": " + imBereich(zahl));
    }
    private static boolean imBereich(int zahl) {
        if(0<= zahl && zahl <= 1000) {
            return true;
        }
        else {
            return false;
        }
    }

}