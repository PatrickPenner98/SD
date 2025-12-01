//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Zahlenausgabe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte eine Zahl eingeben: ");
        int zahl = scanner.nextInt();
        zahlenausgabe(zahl);
    }
    private static void zahlenausgabe(int zahl){
        for(int i = 0; i <= zahl; i++) {
            System.out.print(i + " ");
        }
    }
}