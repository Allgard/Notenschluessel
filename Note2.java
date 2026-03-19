package de.vanaheimS2.pt_pog.NotenUndMenue;
import java.util.ArrayList;
import java.util.Scanner;
public class Note2 {
    // Maximale Anzahl an Punktzahlen
    static final int MAX_WERTE = 10;
    // Liste zum Speichern der Punktzahlen
    static ArrayList<Integer> punkte = new ArrayList<>();
    // Scanner für Benutzereingaben
    static Scanner sc = new Scanner(System.in);
    static void main(String[] args) {menue();}
    // --------------- Menü ---------------
    static void menue() {
        int auswahl;
        //Ausgabe Menüpunkte
        System.out.println("\n--- Menü ---\n1. Punktzahl eingeben\n2. Punktzahlen anzeigen\n3. Durchschnitt berechnen\n4. Beste und schlechteste Punktzahl\n5. Punktzahl löschen\n6. Punktzahl ändern\n0. Beenden");
        System.out.print("Auswahl: ");
        auswahl = sc.nextInt();
        // Menue läuft so lange, bis der Benutzer 0 eingibt
        if (auswahl == 1) {punktzahlEingeben(); menue();}
        else if (auswahl == 2) {anzeigen(); menue();}
        else if (auswahl == 3) {durchschnitt(); menue();}
        else if (auswahl == 4) {besteSchlechteste(); menue();}
        else if (auswahl == 5) {loeschen(); menue();}
        else if (auswahl == 6) {aendern(); menue();}
        else if (auswahl == 0) {System.out.println("Programm beendet.");}
        else {System.out.println("Ungültige Eingabe!"); menue();}
    }
    static int punktzahlPruefen() {
        // Prüfen, ob schon 10 Werte gespeichert sind
        if (punkte.size() == MAX_WERTE) {System.out.println("Maximal 10 Punktzahlen erlaubt."); menue();}
        int wert;
        // Wiederholen, bis eine gültige Punktzahl eingegeben wurde
        do {System.out.print("Punktzahl (0 - 100): ");
            wert = sc.nextInt();
            if (wert < 0 || wert > 100) {System.out.println("Ungültig! Bitte einen Wert von 0 bis 100 eingeben.");}
        } while (wert < 0 || wert > 100);
        return wert;
    }
    static int ungueltigeNummer() {
        int nr;
        // Gültige Nummer abfragen (Schleife)
        do {System.out.print("Nummer der zu ändernden Punktzahl: ");
            nr = sc.nextInt();
            if (nr < 1 || nr > punkte.size()) {System.out.println("Ungültige Nummer, bitte erneut eingeben.");}
        } while (nr < 1 || nr > punkte.size());
        return nr;
    }
    // --------------- Punktzahl eingeben ---------------
    static void punktzahlEingeben() {
        // Gültige Punktzahl speichern
        punkte.add(punktzahlPruefen());
        System.out.println("Punktzahl gespeichert.");
    }
    // --------------- Anzeigen ---------------
    static void anzeigen() {
        if (punkte.isEmpty()) {System.out.println("Keine Punktzahlen vorhanden."); return;}
        // Formatierte Anzeige
        System.out.println("\nNr \t| Punkte \t| Note");
        for (int i = 0; i < punkte.size(); i++) {
            int p = punkte.get(i);
            int note = note(p);
            System.out.println((i + 1) + " \t| " + p + " \t\t| " + note);
        }
    }
    // --------------- Notenberechnung ---------------
    static int note(int p) {
        if (p >= 92) {return 1;}
        else if (p >= 81) {return 2;}
        else if (p >= 67) {return 3;}
        else if (p >= 50) {return 4;}
        else if (p >= 30) {return 5;}
        else {return 6;}
    }
    // --------------- Durchschnitt ---------------
    static void durchschnitt() {
        // Prüfen ob Punktzahlen vorhanden sind
        if (punkte.isEmpty()) {System.out.println("Keine Punktzahlen vorhanden."); return;}
        int summe = 0;
        // alle Punkte aufsummieren
        for (int p : punkte) {summe += p;}
        // Durchschnitt berechnen (als double!)
        double durchschnitt = (double) summe / punkte.size();
        System.out.println("Durchschnitt: " + durchschnitt + " Punkte");
    }
    // --------------- Beste & schlechteste ---------------
    static void besteSchlechteste() {
        // Prüfen ob Punktzahlen vorhanden sind
        if (punkte.isEmpty()) {System.out.println("Keine Punktzahlen vorhanden."); return;}
        // Anfangswerte setzen
        int min = punkte.getFirst();
        int max = punkte.getFirst();
        // Durch alle Punktzahlen gehen
        for (int p : punkte) {
            if (p < min) {min = p;}
            if (p > max) {max = p;}
        }
        System.out.println("Beste Punktzahl: " + max + "\nSchlechteste Punktzahl: " + min);
    }
    // --------------- Löschen ---------------
    static void loeschen() {
        // Prüfen ob Punktzahlen vorhanden sind
        if (punkte.isEmpty()) {System.out.println("Keine Punktzahlen vorhanden."); return;}
        anzeigen();
        // Punktzahl löschen (Index = Nummer - 1)
        punkte.remove(ungueltigeNummer() - 1);
        System.out.println("Punktzahl wurde gelöscht.");
    }
    // --------------- Ändern ---------------
    static void aendern() {
        // Prüfen ob Punktzahlen vorhanden sind
        if (punkte.isEmpty()) {System.out.println("Keine Punktzahlen vorhanden."); return;}
        anzeigen();
        // Punktzahl ändern (Index = Nummer - 1)
        punkte.set(ungueltigeNummer() - 1, punktzahlPruefen());
        System.out.println("Punktzahl geändert.");
    }
}