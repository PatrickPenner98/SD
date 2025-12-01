//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Deklaration
        double spannung, widerstand, stromstaerke;


        spannung = 220;
        widerstand = 100;

        //Berechnung
        stromstaerke = spannung / widerstand;

        //Ausgabe
        System.out.println("Die Stromstaerke beträgt: "+ stromstaerke + " Ampere");

    }
}