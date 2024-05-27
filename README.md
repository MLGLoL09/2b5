# NaturalLanguageProcessing
## anzahlUmlaute
Schreibe hierfür eine Klassen-Methode anzahlUmlaute in der Klasse NaturalLanguageProcessing, welche einen Text als Parameter übernimmt, und einen Text mit den Anzahlen (in der Form: "Umlaut-Andere = 2-5") zurückliefert. Falls ein leerer Text übergeben wurde, sollte "Es wurde kein Text übergeben." zurückgegeben werden.

Zum Überprüfen, ob ein Zeichen ein Umlaut (ä, ö, ü in Groß- und Kleinschreibung sowie inklusive ß) oder ein anderes Zeichen ist, muss ein switch-case-statement verwendet werden. Versuche, wenn möglich, Fälle zusammenzufassen.

## satzzeichenAnteil
Schreibe eine weitere Klassen-Methode satzzeichenAnteil in der Klasse NaturalLanguageProcessing, welche einen Text als Parameter übernimmt, und einen Text zurückgibt, der ungefähr angibt, wie häufig Satzzeichen im Text vorkommen. Dabei muss zuerst der prozentuelle Anteil von Satzzeichen im Gesamttext ermittelt werden.

Ist der Anteil kleiner als 30% sollte zurückgegeben werden: "Der Text enthält eher wenige Satzzeichen."

Ist der Anteil zwischen 30% und 60% sollte zurückgegeben werden: "Der Text enthält etwa gleich viele Satzzeichen wie andere Buchstaben"

Ist der Anteil größer als 60% sollte zurückgegeben werden: "Der Text enthält eher viele Satzzeichen."

Als Satzzeichen gelten: . , ; : ! ? " ' - ) ( und Leerzeichen

## istSatzzeichen
Die Überprüfung, ob ein Buchstabe ein Satzzeichen ist oder nicht, soll in eine Klassen-Methode istSatzzeichen ausgelagert sein, welche ein einzelnes Zeichen als Parameter übernimmt und einen Wahrheitswert zurückgibt. Zum Überprüfen, ob ein Zeichen ein Satzzeichen oder ein anderes Zeichen ist, muss ein switch-case-statement verwendet werden. Versuche, wenn möglich, Fälle zusammenzufassen. Nutze dafür keine Variable, sondern gibt den Wahrheitswert gleich innerhalb des case bzw. default zurück (d.h., außerhalb des switch darf es kein return geben).

# NatLangProcTest
Schreibe eine weitere Klasse NatLangProcTest mit main-Methode, in der über ein JOptionPane ein Text eingegeben werden kann, und die beiden Methoden (anzahlUmlaute und satzzeichenAnteil) aufgerufen werden. Der Rückgabewert von anzahlUmlaute und satzzeichenAnteil soll jeweils in einem MessageDialog ausgegeben werden.

Achte besonders auf:

Es sind 2 Klassen zu schreiben
Dokumentationskommentar für jede Klasse und Methode
Verwende switch-case für die Überprüfung der Zeichen
Einrückungen
Abgabe:

Die Quellcode-Dateien der beiden Klassen
