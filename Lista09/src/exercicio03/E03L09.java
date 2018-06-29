package exercicio03;

import exercicio01.BaseInterface;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * @author Gabriel de Oliveira Ferreira
 */
public class E03L09 implements BaseInterface {

    private JFrame jFrame;
    private JLabel jLabelNumero, jLabelTabuada;
    private JTextField jTextFieldNumero;
    private JTextArea jTextAreaTabuada;
    private JScrollPane jScrollPaneTabuada;
    private JButton jButtonTabuada;

    public E03L09() {
        instanciarComponentes();
        gerarTela();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
        //configurarJScrollPane();
        jFrame.setVisible(true);
    }

    @Override
    public void instanciarComponentes() {
        jLabelNumero = new JLabel("Número");
        jLabelTabuada = new JLabel("Tabuada");
        jTextFieldNumero = new JTextField();
        jTextAreaTabuada = new JTextArea();
        jScrollPaneTabuada = new JScrollPane();
    }

    @Override
    public void gerarTela() {
        jFrame = new JFrame("Tabuada");
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setSize(500, 500);
        jFrame.setLocationRelativeTo(null);
    }

    @Override
    public void gerarDimensoes() {
        jLabelNumero.setSize(80, 20);
        jTextFieldNumero.setSize(110, 20);
        jLabelTabuada.setSize(80, 20);
        jScrollPaneTabuada.setSize(360, 440);
    }

    @Override
    public void gerarLocalizacoes() {
        jLabelNumero.setLocation(10, 10);
        jTextFieldNumero.setLocation(10, 40);
        jLabelTabuada.setLocation(10, 70);
        jScrollPaneTabuada.setLocation(130, 40);
        jButtonTabuada.setLocation(10, 100);
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jLabelNumero);
        jFrame.add(jLabelTabuada);
        jFrame.add(jTextFieldNumero);
        jFrame.add(jTextAreaTabuada);
        jFrame.add(jScrollPaneTabuada);
        jFrame.add(jButtonTabuada);
    }

    private void configurarJScrollPane() {
        jScrollPaneTabuada.setViewportView(jTextAreaTabuada);
        jScrollPaneTabuada.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneTabuada.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        jTextAreaTabuada.setLineWrap(true);

    }
}
