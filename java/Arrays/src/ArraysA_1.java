
import java.util.Scanner;
public class ArraysA_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wie viele zahlen wollen sie verarbeiten?");
        int anzahl = scanner.nextInt();
        int[] zahlen = new int[anzahl];
        einlesen(zahlen);
        System.out.println("Ihre Eingabe: ");
        ausgeben(zahlen);
        System.out.println("Die Summer beträgt: " + summe(zahlen));

    }
    private static void einlesen(int[] zahlen){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < zahlen.length; i++){
            System.out.print((i+1) + ". Zahl: ");
            zahlen[i] = scanner.nextInt();
        }
    }
    private static void ausgeben(int[] zahlen){
        for (int i = 0; i < zahlen.length; i++){
            System.out.print(zahlen[i] + " ");
        }
        System.out.println();
    }
    private static int summe(int[]zahlen){
        int sum = 0;
        for(int i = 0; i < zahlen.length; i++){
            sum += zahlen[i];
        }
        return sum;
    }
}