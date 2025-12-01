import java.util.Scanner;
import java.text.DecimalFormat;
public class BeispielaufgabeA3_2 {
    public static void main(String[] args) {

        //Deklaration
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double startkapital = 0;
        double rate = 0;
        double zinssatz = 0;
        int jahre = 0;

        //Eingabe
        System.out.print("Startkapital: ");
        startkapital = scanner.nextDouble();
        System.out.print("Jährliche Rate (am Ende des Jahres): ");
        rate = scanner.nextDouble();
        System.out.print("Zinssatz: ");
        zinssatz = scanner.nextDouble() / 100;
        System.out.print("Jahre: ");
        jahre = scanner.nextInt();

        //Verarbeitung
        double kapital = startkapital;

        System.out.print("\n\t Jahre |\t Zinsen |\t Rate |\t Kapital");
        for(int jahr = 1; jahr <= jahre; jahr++){
            double zinsen = Math.round(zinssatz * kapital *100.0)/100.0;
            kapital += rate + zinsen;

            System.out.print("\n\t" + jahr + "\t|\t" + df.format(zinsen) + "\t|\t" + df.format(rate) + "\t|\t" + df.format(kapital));
        }

    }
}
