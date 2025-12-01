import java.util.Scanner;
import java.text.DecimalFormat;
public class BeispielaufgabeA3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double kapital = 0;
        double rate = 0;
        double zinssatz = 0;
        int jahre = 0;

        System.out.println("Willkommen zum Endkapitalrechner");
        System.out.print("Startkapital: ");
        kapital = scanner.nextDouble();
        System.out.print("Jährliche Rate: ");
        rate = scanner.nextDouble();
        System.out.print("Zinssatz: ");
        zinssatz = scanner.nextDouble();
        System.out.print("Jahre: ");
        jahre = scanner.nextInt();

        System.out.print("\n Jahre |\t Zinsen |\t Rate |\t Kapital");
            for (int jahr = 1; jahr <= jahre; jahr++){
                double zinsen = Math.round((zinssatz /100) * kapital *100.0)/100.0;
                kapital += zinsen + rate;
            System.out.print("\n" + jahr +  "\t|\t " + df.format(zinsen) + "\t|\t" + df.format(rate) + "\t|\t" + df.format(kapital));
            }
    }
}
