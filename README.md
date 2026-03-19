Aufgabe Notenrechner ohne OOP

Ziel
Sie entwickeln ein Java-Konsolenprogramm, in dem Benutzer Punktzahlen (0–100) eingeben können.
Diese Punktzahlen werden gespeichert (max. 10 Stück) und anschließend ausgewertet
(Umrechnung in Note, Anzeige, Durchschnitt, beste/schlechteste…).
Das Programm soll ein konsolenbasiertes Menü anzeigen, in dem der Benutzer

1. neue Punktzahlen eingeben,
2. alle gespeicherten Punkte mit Note anzeigen lassen,
3. den Durchschnitt berechnen,
4. die beste und schlechteste Punktzahl ausgeben,
5. eine Punktzahl löschen,
6. eine Punktzahl ändern
7. und das Programm mit 0 beenden kann.

Anforderungen:
1) Punktzahlen eingeben
• Der Benutzer gibt Ganzzahlen ein (z. B. 0, 57, 100).
• Nur Werte von 0 bis 100 sind erlaubt.
• Falls der Benutzer z. B. -3 oder 120 eingibt, muss das Programm:
o eine Fehlermeldung anzeigen (z. B. „Ungültig, bitte 0–100“)
o und erneut nach einer Punktzahl fragen (Schleife).

Wichtig: Es dürfen maximal 10 Punktzahlen gespeichert werden.
Wenn bereits 10 Werte gespeichert sind und der Benutzer noch einen hinzufügen will:
• Ausgabe z. B.: „Maximal 10 Werte erreicht.“
• Kein weiterer Wert wird gespeichert.

Speicherung: maximal 10 Werte
Die Punktzahlen werden in einer Datenstruktur gespeichert:
• entweder int[] punkte
• oder ArrayList<Integer> punkte

Nur gültige Punktzahlen (0–100) werden gespeichert.

2) Alle Punktzahlen anzeigen (inkl. Note)
Beispielausgabe:
1) Punkte: 78 -> Note: 3
2) Punkte: 95 -> Note: 1
3) Punkte: 40 -> Note: 5

Wenn noch keine Werte gespeichert sind:
Ausgabe: Noch keine Punkte vorhanden.
Umrechnung: Punkte → Note (1–6)
Jede Punktzahl wird in eine Note umgerechnet. Diese Umrechnung soll in einer Methode
passieren, z. B.:
static int punkteZuNote(int p)
Punkte Note
92–100 1
81–91 2
67–80 3
50–66 4
30–49 5
0–29 6

Grenzwerte sind inklusive.
• 92 → Note 1
• 91 → Note 2
• 80 → Note 3
• 50 → Note 4
• 29 → Note 6

3) Durchschnitt berechnen
Der Durchschnitt bezieht sich auf die Punkte, nicht auf die Note. Diese Umrechnung soll in
einer Methode passieren.
Beispiel:
Punkte: 78, 95, 40
Summe = 78 + 95 + 40 = 213
Anzahl = 3
Durchschnitt = 213 / 3 = 71.0
Beispielausgabe:
Durchschnitt: 71.0 Punkte

Wenn keine Werte vorhanden sind:

Ausgabe: Noch keine Punkte vorhanden.

4) Beste und schlechteste Punktzahl anzeigen
Diese Umrechnung soll in einer Methode passieren.
Beispielausgabe:
Beste Punktzahl: 95
Schlechteste Punktzahl: 40
Wenn keine Werte vorhanden sind:

Ausgabe: Noch keine Punkte vorhanden.

5) Punktzahl löschen
Das Programm soll dem Benutzer ermöglichen, eine bereits gespeicherte Punktzahl zu löschen.
Diese Funktionalität soll in einer Methode programmiert werden.
• Zunächst werden alle gespeicherten Punktzahlen nummeriert angezeigt (1 bis n).
• Der Benutzer gibt die Nummer der Punktzahl ein, die gelöscht werden soll.
• Nur gültige Nummern sind erlaubt.
• Bei einer ungültigen Eingabe (z. B. 0, negative Zahl, zu große Zahl) muss:
o eine Fehlermeldung ausgegeben werden
o und erneut nach einer gültigen Nummer gefragt werden (Schleife).

Wenn keine Punktzahlen gespeichert sind:

Ausgabe: „Noch keine Punkte vorhanden.“

6) Punktzahl ändern
Das Programm soll dem Benutzer ermöglichen, eine gespeicherte Punktzahl zu ändern. Diese
Funktionalität soll in einer Methode programmiert werden.
• Zunächst werden alle gespeicherten Punktzahlen nummeriert angezeigt (1 bis n).
• Der Benutzer wählt die Nummer der Punktzahl, die geändert werden soll.
• Anschließend gibt der Benutzer eine neue Punktzahl ein.
• Es gelten die gleichen Regeln wie bei der Eingabe neuer Punktzahlen:
o nur Ganzzahlen von 0 bis 100 sind erlaubt
o ungültige Eingaben führen zu einer Fehlermeldung und erneuter Abfrage

Wenn keine Punktzahlen gespeichert sind:

Ausgabe: „Noch keine Punkte vorhanden.“

Beispielaufbau - Menü
1 – Punktzahl eingeben
2 – Alle anzeigen (Inkl. Note)
3 – Durchschnitt
4 – Beste/Schlechteste
5 – Punktzahl löschen
6 – Punktzahl ändern
0 – Ende
