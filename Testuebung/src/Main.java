public class Main {
    public static void main(String[] args) {
        List<TicketData> TicketDataList = ...; // Initialisiere mit Testdaten
        TicketStatistik(TicketDataList);
    }

    public static void TicketStatistik(List<TicketData> TicketDataList) {
        System.out.println("Nutzungssstatistik Monatstickets");
        System.out.println();

        TicketData td0 = TicketDataList.get(0);
        String monat = td0.Monat;
        int monatMin = GetMonatstage(monat);
        int monatMax = 0;
        int monatTicketZaehler = 0;
        int monatNutzungsZaehler = 0;
        int jahrMin = 31;
        int jahrMax = 0;
        int jahrTicketZaehler = 0;
        int jahrNutzungsZaehler = 0;

        for (TicketData td : TicketDataList) {
            if (!monat.equals(td.Monat)) {
                // Monatsauswertung:
                System.out.println("Auswertung für Monat " + monat);
                System.out.println(" Minimale Nutzung: " + monatMin);
                System.out.println(" Maximale Nutzung: " + monatMax);
                System.out.println(" Durchschnitt: " + (monatNutzungsZaehler / monatTicketZaehler));
                System.out.println(" Gesamtanzahl Tickets: " + monatTicketZaehler);
                System.out.println();

                // Monatsdaten für Jahresauswertung übernehmen:
                jahrTicketZaehler += monatTicketZaehler;
                jahrNutzungsZaehler += monatNutzungsZaehler;
                if (jahrMax < monatMax) jahrMax = monatMax;
                if (jahrMin > monatMin) jahrMin = monatMin;

                // Reset Monat:
                monatTicketZaehler = 0;
                monatNutzungsZaehler = 0;
                monatMax = 0;
                monat = td.Monat;
                monatMin = GetMonatstage(monat);
            }

            // Ticketauswertung:
            monatTicketZaehler += 1;
            monatNutzungsZaehler += td.NutzungsZaehler;
            if (monatMax < td.NutzungsZaehler) monatMax = td.NutzungsZaehler;
            if (monatMin > td.NutzungsZaehler) monatMin = td.NutzungsZaehler;
        }

        // Jahresauswertung:
        System.out.println("Auswertung für Jahr " + td0.Jahr);
        System.out.println(" Minimale Nutzung: " + jahrMin);
        System.out.println(" Maximale Nutzung: " + jahrMax);
        System.out.println(" Durchschnitt: " + (jahrNutzungsZaehler / jahrTicketZaehler));
        System.out.println(" Gesamtanzahl Tickets: " + jahrTicketZaehler);
        System.out.println();
    }

    public static int GetMonatstage(String monat) {
        // Dummy-Implementierung, z. B.:
        switch (monat) {
            case "Januar": return 31;
            case "Februar": return 28;
            // weitere Monate...
            default: return 30;
        }
    }

    static class TicketData {
        int Id;
        String Monat;
        String Jahr;
        int NutzungsZaehler;
    }
}
