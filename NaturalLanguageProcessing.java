public class NaturalLanguageProcessing {
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