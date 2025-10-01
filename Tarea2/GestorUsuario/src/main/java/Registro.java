import javax.swing.*;

public class Registro {
    private JPanel jpaneltitulo;
    private JLabel titulo;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Registro");
        frame.setContentPane(new Registro().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel panel;
    private JButton INICIARSESIÓNButton;
    private JButton AYUDAButton;
    private JButton AJUSTESButton;
    private JButton REGISTRARSEButton;
    private JButton INFORMACIÓNButton;
    private JLabel Nombre;
    private JTextPane textPane1;
    private JTextArea textArea1;
    private JLabel GMAIL;
    private JTextArea textArea2;
    private JButton haSidoElTriunfadorButton;
    private JButton deJóvenesValoresQueButton;
    private JButton enLaMaestranzaSevillanaButton;
    private JButton nocturnaQueTambiénContóButton;
    private JButton deManuelQuintanaDavidButton;
    private JButton elNovilleroSevillanoJavierButton;
    private JButton guardarButton;
    private JButton cancelarButton;


}
