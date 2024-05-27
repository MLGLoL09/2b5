import javax.swing.JOptionPane;
/**
 * Das Programm soll ausgeben wie viele umlaute es im Text gibt und wie groß der anteil von satzzeichen ist
 * @author Sebastian Weigl
 * @version 05-27-2024
 */
public class NatLangProcTest {
    /**
     * gibt die ergebnisse der anderen methoden aus
     */
    public static void main(String[] args) {
        String text = JOptionPane.showInputDialog(null, "Was ist Ihr Text?");
        String anzahlUmlauteString = NaturalLanguageProcessing.anzahlUmlaute(text);
        String satzzeichenAnteilString = NaturalLanguageProcessing.satzzeichenAnteil(text);
        JOptionPane.showMessageDialog(null, anzahlUmlauteString + "\n" + satzzeichenAnteilString);
    }
}
