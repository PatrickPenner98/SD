//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class A1a {
    public static void main(String[] args) {

        //Deklaration
        Scanner scanner = new Scanner(System.in);

        int zahlen;

        //Eingabe
        System.out.print("Bitte eine Zahl eingeben: ");
        zahlen = scanner.nextInt();

        //Verarbeitung
        for(int i = 1; i <= zahlen; i++){
            System.out.print(i +", ");
        }
    }
}