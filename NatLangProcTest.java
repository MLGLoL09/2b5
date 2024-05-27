import javax.swing.JOptionPane;

public class NatLangProcTest {
    public static void main(String[] args) {
        String text = JOptionPane.showInputDialog(null, "Was ist Ihr Text?");
        String anzahlUmlauteString = NaturalLanguageProcessing.anzahlUmlaute(text);
        String satzzeichenAnteilString = NaturalLanguageProcessing.satzzeichenAnteil(text);
        JOptionPane.showMessageDialog(null, anzahlUmlauteString + "\n" + satzzeichenAnteilString);
    }
}
