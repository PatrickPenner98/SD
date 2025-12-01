package com.example.pokememory;
import java.util.Random;

public class Model {
    public static final int ANZAHLZEILEN = 4;
    public static final int ANZAHLSPALTEN = 4;
    public static final int ANZAHLBILDER = ANZAHLZEILEN * ANZAHLSPALTEN / 2;

    private final int [][] zahlen = new int [ANZAHLZEILEN][ANZAHLSPALTEN];
    private final boolean [][] aufgedeckt = new boolean [ANZAHLZEILEN][ANZAHLSPALTEN];
    private int anzahl_vorlaeufig_aufgedeckt;
    private final int [][] vorlaeufig_aufgedeckt = new int [2][2];

    public Model(){
        Random random = new Random();
        int zufallszahl;
        int [] bild = new int[ANZAHLBILDER+1];
        for (int i = 0; i < ANZAHLZEILEN; i++) {
            for (int j = 0; j < ANZAHLSPALTEN; j++) {
                do{
                    zufallszahl = random.nextInt(1, ANZAHLBILDER+1);

                } while (bild[zufallszahl] == 2);
                zahlen[i][j] = zufallszahl;
                bild[zufallszahl]++;
            }
        }
        anzahl_vorlaeufig_aufgedeckt = 0;
    }

    public int getZahl(int i, int j){

        return zahlen[i][j];
    }

    public boolean istAufgedeckt(int i, int j){

        return aufgedeckt[i][j];
    }

    public void aufdecken(int i, int j){
        if(!aufgedeckt[i][j] && anzahl_vorlaeufig_aufgedeckt < 2){
            aufgedeckt[i][j] = true;
            vorlaeufig_aufgedeckt[anzahl_vorlaeufig_aufgedeckt][0] = i;
            vorlaeufig_aufgedeckt[anzahl_vorlaeufig_aufgedeckt][1] = j;
            anzahl_vorlaeufig_aufgedeckt++;
        }
    }

    public int getAnzahlVorlaeufigAufgedeckt(){

        return anzahl_vorlaeufig_aufgedeckt;
    }

    public boolean aktuellesPaarPruefen() {
        if (anzahl_vorlaeufig_aufgedeckt != 2) return false;

        int i1 = vorlaeufig_aufgedeckt[0][0];
        int j1 = vorlaeufig_aufgedeckt[0][1];
        int i2 = vorlaeufig_aufgedeckt[1][0];
        int j2 = vorlaeufig_aufgedeckt[1][1];

        if (zahlen[i1][j1] == zahlen[i2][j2]) {
            anzahl_vorlaeufig_aufgedeckt = 0;
            return true;
        } else {
            aufgedeckt[i1][j1] = false;
            aufgedeckt[i2][j2] = false;
            anzahl_vorlaeufig_aufgedeckt = 0;
            return false;
        }
    }

}
