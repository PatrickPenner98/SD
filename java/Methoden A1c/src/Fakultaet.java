//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Fakultaet {
    public static void main(String[] args) {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Bitte eine Zahl eingeben (0 zum beenden): ");
            int zahl = scanner.nextInt() ;
            {
                if(zahl == 0) {
                    System.out.println("Die eingegebene Zahl ist zu klein.");
                    break;
                }
                else {
                    System.out.println(zahl + "! = " + fakultaet(zahl));
                }
            }
        }
    }

    private static int fakultaet(int zahl) {
        int ergebnis = 1;
        for(int i = 1; i <= zahl; i++){
            ergebnis *= i;
        }
    return ergebnis;
    }
}