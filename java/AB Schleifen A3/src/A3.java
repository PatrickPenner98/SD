//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class A3 {
    public static void main(String[] args) {

        //Deklaration
        int zahlen = 10;

        //Verarbeitung
        for(int i = 10; i >= 0; i--){
            for(int j = zahlen; j >= 0; j--){
                System.out.print(j + " ");
            }
        zahlen--;
        System.out.println("");
        }
    }
}