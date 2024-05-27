/**
 * Das Programm soll ausgeben wie viele umlaute es im Text gibt und wie groß der anteil von satzzeichen ist
 * @author Sebastian Weigl
 * @version 05-27-2024
 */
public class NaturalLanguageProcessing {
    /**
     * ueberprueft, wie viele umlaute und normale buchstaben es gibt
     * @param text uebernimmt den text
     * @return gibt zurueck, wie viele umlaute und wie viele normale buchstaben im text sind
     */
    public static String anzahlUmlaute(String text) {
        if (text.length() == 0) {
            return "Es wurde kein Text übergeben.";
        }
        int umlaute = 0;
        int normalCharacters = 0;
        for (int i = 0; i < text.length(); i++) {
            switch (text.charAt(i)) {
                case 'ä', 'Ä':
                case 'ö', 'Ö':
                case 'ü', 'Ü':
                case 'ß':
                    umlaute++;
                    break;
                default:
                    normalCharacters++;
                    break;
            }
        }
        return "Umlaut-Andere = " + umlaute + "-" + normalCharacters;
    }
    /**
     * ueberprueft, wie viele satzzeichen ca im text sind
     * @param text uebernimmt den text
     * @return gibt zurueck, wie viele satzzeichen zirka im text sind
     */
    public static String satzzeichenAnteil(String text) {
        int satzzeichen = 0;
        int characters = 0;
        for (int i = 0; i < text.length(); i++) {
            if (istSatzzeichen(text.charAt(i))) {
                satzzeichen++;
            } else {
                characters++;
            }
        }
        int percernt = (characters * 100) / satzzeichen;
        if (percernt <= 30) {
            return "Der Text enthält eher wenige Satzzeichen.";
        } else if (percernt <= 60) {
            return "Der Text enthält etwa gleich viele Satzzeichen wie andere Buchstaben";
        } else {
            return "Der Text enthält eher viele Satzzeichen.";
        }
    }
    /**
     * ueberprueft, ob das ausgewaehlte zeichen ein stazzeichen ist oder nicht
     * @param zeichen uebernimmt das Zeichen, dass gerade im text ausgewaehlt ist
     * @return gibt zurueck, ob es ein satzzeichen ist oder nicht
     */
    public static boolean istSatzzeichen(char zeichen) {
        switch (zeichen) {
            case ',', '.':
            case ')', '-':
            case ';', ':':
            case '!', '?':
            case '"', '(':
            case '\'', ' ':
                return true;
            default:
                return false;
        }
    }
}