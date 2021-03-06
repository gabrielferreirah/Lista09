package exercicio02;

import exercicio01.BaseInterface;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * @author Gabriel de Oliveira Ferreira
 */
public class E02L09 implements BaseInterface {

    private JFrame jFrame;
    private JLabel jLabelNumero;
    private JTextField jTextFieldNumero;
    private JButton jButtonTabuada;

    public E02L09() {
        instanciarComponentes();
        gerarTela();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
        acaoJButtonCalcular();
        jFrame.setVisible(true);
    }

    @Override
    public void instanciarComponentes() {
        jLabelNumero = new JLabel("Número");
        jTextFieldNumero = new JTextField();
        jButtonTabuada = new JButton("Calcular");
    }

    @Override
    public void gerarTela() {
        jFrame = new JFrame("Tabuada");
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setSize(400, 300);
        jFrame.setLocationRelativeTo(null);
    }

    @Override
    public void gerarDimensoes() {
        jLabelNumero.setSize(80, 20);
        jTextFieldNumero.setSize(200, 20);
        jButtonTabuada.setSize(100, 50);
    }

    @Override
    public void gerarLocalizacoes() {
        jLabelNumero.setLocation(10, 10);
        jTextFieldNumero.setLocation(10, 40);
        jButtonTabuada.setLocation(50, 80);
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jLabelNumero);
        jFrame.add(jTextFieldNumero);
        jFrame.add(jButtonTabuada);
    }

    public void acaoJButtonCalcular() {
        jButtonTabuada.addActionListener(new ActionListener() {

            
         public void actionPerformed(ActionEvent e) {
                int numBase = Integer.parseInt(jTextFieldNumero.getText().trim());
                int sum = numBase * 50;
                JOptionPane.showMessageDialog(null, "Resultado: " + sum, "Tabuada", JOptionPane.PLAIN_MESSAGE);
            }
        });
    }

}
