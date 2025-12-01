//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) {

        //Deklaration
        double startKapital, zinssatz, jahr1, jahr2,jahr3, endKapital;
        DecimalFormat df = new DecimalFormat("0.00");
        startKapital = 1000;
        zinssatz = 0.05;

        //Berechnungen
        jahr1 = startKapital * (1 + zinssatz);
        jahr2 = jahr1 * (1 + zinssatz);
        jahr3 = jahr2 * (1 + zinssatz);
        endKapital = jahr3;

        endKapital = Math.round(endKapital * 100) / 100.0;

        //Ausgabe
        System.out.println("Das Endkapital beträgt: " + df.format(endKapital));
    }
}