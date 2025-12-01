import java.util.Scanner;
import java.text.DecimalFormat;
public class Beispielaufgabe1_2 {
    public static void main(String[] args){

        //Deklaration
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        //Eingabe
        System.out.print("1. Zahl: ");
        double zahl1 = scanner.nextInt();
        System.out.print("2. Zahl: ");
        double zahl2 = scanner.nextInt();
        System.out.print("3. Zahl: ");
        double zahl3 = scanner.nextInt();

        double min = zahl1;
        double max = zahl1;

        if (zahl2 < min){
            min = zahl2;
        }
        if(zahl3 < min){
            min = zahl3;
        }
        if(zahl2 > max){
            max = zahl2;
        }
        if(zahl3 > max){
            max = zahl3;
        }

        double median = zahl1 + zahl2 + zahl3 - min - max;
        double mittelwert = (zahl1 + zahl2 + zahl3) /3;

        System.out.println("Median: " + df.format(median));
        System.out.println("Mittelwert: " + df.format(mittelwert));



    }
}
