//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Hanoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wie viele Scheiben? ");
        int anzahl = scanner.nextInt();
        hanoi(anzahl, "A", "B", "C");
    }
    private static void hanoi(int anzahl, String quelle, String ablage, String ziel){
        if(anzahl > 0) { //Rekursionsabbruch bei zahl == 0

            //Bewege anzahl -1 Scheiben von der Quelle über das Ziel zur Ablage.
            hanoi(anzahl - 1, quelle, ziel, ablage);

            //Bewege die größte Scheibe von Quelle nach Ziel.
            System.out.print("Bewege Scheibe" + anzahl + " von " + quelle + " nach " + ziel + ".");

            //Bewege anzahl -1 Scheiben von der Ablage über die Quelle zum Ziel.
            hanoi(anzahl - 1, ablage, quelle, ziel);
        }
    }
}