//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class A1b {
    public static void main(String[] args) {

        //Deklaration
        int anzahl;
        Scanner scanner = new Scanner(System.in);


        //Eingabe
        System.out.print("Bitte eine Zahl eingeben: ");
        anzahl = scanner.nextInt();

        //Verarbeitung
        for (int i = anzahl; i > 1; i--) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}
