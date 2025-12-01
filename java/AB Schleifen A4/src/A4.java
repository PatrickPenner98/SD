public class A4 {
    public static void main(String[] args) {
        for (int a = 0; a <= 9; a++) {
            for (int b = 0; b <= 9; b++) {
                if (a == b) continue;
                for (int c = 0; c <= 9; c++) {
                    if (a == c || b == c) continue;
                    for (int d = 0; d <= 9; d++) {
                        if (a == d || b == d || c == d) continue;
                        for (int e = 0; e <= 9; e++) {
                            if (a == e || b == e || c == e || d == e) continue;
                            for (int f = 0; f <= 9; f++) {
                                if (a == f || b == f || c == f || d == f || e == f) continue;
                                for (int g = 0; g <= 9; g++) {
                                    if (a == g || b == g || c == g || d == g || e == g || f == g) continue;

                                    int abcd = a * 1000 + b * 100 + c * 10 + d;
                                    int efbd = e * 1000 + f * 100 + b * 10 + d;
                                    int gfcg = g * 1000 + f * 100 + c * 10 + g;
                                    int gfdc = g * 1000 + f * 100 + d * 10 + c;

                                    if (abcd + efbd == gfcg && gfcg - gfdc == abcd) {
                                        System.out.println("Lösung gefunden:");
                                        System.out.println("a = " + a);
                                        System.out.println("b = " + b);
                                        System.out.println("c = " + c);
                                        System.out.println("d = " + d);
                                        System.out.println("e = " + e);
                                        System.out.println("f = " + f);
                                        System.out.println("g = " + g);
                                    } else {
                                        System.out.println("Keine Lösung für:");
                                        System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d + ", e = " + e + ", f = " + f + ", g = " + g);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
