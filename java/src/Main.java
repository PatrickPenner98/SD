//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //sout -> System.out.println -> Bildschrimausgabe
        //System.out.print -> ohne Zeilenumbruch am Ende

        System.out.println("Hello World!");

        //Deklaration
        int groesse1, groesse2; //Deklaration von zwei ganzzahligen Variablen
        double preis1, preis2, radiusInMetern1, radiusInMetern2, flaeche1, flaeche2, preisProQm1, preisProQm2;

        //double = Gleitkommazahl (mit doppeltem Speicher gegenueber float)
        Scanner scanner = new Scanner(System.in); //Scanner zum Einlesen erzeugen
        DecimalFormat df = new DecimalFormat( "0.00");// für Ausgabe mit zwei Nachkommastellen

        //Eingabe
        System.out.print("Größe der ersten Pizza: ");
        groesse1 = scanner.nextInt();
        System.out.print("Größe der zweiten Pizza: ");
        groesse2 = scanner.nextInt();
        System.out.print("Preis der ersten Pizza: ");
        preis1 = scanner.nextDouble();
        System.out.print("Preis der zweiten Pizza: ");
        preis2 = scanner.nextDouble();

        //Verarbeitung
        radiusInMetern1 = (double) groesse1 / 200;
        //(double) = cast-Operator groesse1 wird in double umgewandelt,
        // damit eine Gleitkommadivision stattfindet
        radiusInMetern2 = (double) groesse2 / 200;
        flaeche1 = Math.PI * Math.pow(radiusInMetern1,2); //pow = power = potenzieren
        flaeche2 = Math.PI * Math.pow(radiusInMetern2,2);
        preisProQm1 = preis1 / flaeche1;
        preisProQm2 = preis2 / flaeche2;

        //Ausgabe
        System.out.println("Der preis pro m² bei der ersten Pizza beträgt: " +
                df.format(preisProQm1) + "€");
        System.out.println("Der preis pro m² bei der zweiten Pizza beträgt: " +
                df.format(preisProQm2) + "€");
        if (preisProQm1 > preisProQm2)
        {
            System.out.println("Die zweite Pizza ist günstiger.");
        }
        else if (preisProQm1 < preisProQm2)
        {
            System.out.println("Die erste Pizza ist günstiger.");
        }
        else
        {
            System.out.println("Die Pizzen sind gleich teuer.");
        }

    }
}