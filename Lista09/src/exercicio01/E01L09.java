package exercicio01;

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
public class E01L09 implements BaseInterface {

    JFrame jFrame;
    JLabel jLabelNome, jLabelSobrenome;
    JTextField jTextFieldNome, jTextFieldSobrenome;
    JButton jButtonConcantenar;

    public E01L09() {
        instanciarComponentes();
        gerarTela();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
        acaoJButtonConcatenar();
        jFrame.setVisible(true);
    }

    @Override
    public void instanciarComponentes() {
        jLabelNome = new JLabel("Nome");
        jLabelSobrenome = new JLabel("Sobrenome");
        jTextFieldNome = new JTextField();
        jTextFieldSobrenome = new JTextField();
        jButtonConcantenar = new JButton("Concatenar");
    }

    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setSize(500, 500);
        jFrame.setLocationRelativeTo(null);
    }

    @Override
    public void gerarDimensoes() {
        jLabelNome.setSize(80, 20);
        jLabelSobrenome.setSize(80, 20);
        jTextFieldNome.setSize(200, 20);
        jTextFieldSobrenome.setSize(200, 20);
        jButtonConcantenar.setSize(200, 50);
    }

    @Override
    public void gerarLocalizacoes() {
        jLabelNome.setLocation(10, 10);
        jTextFieldNome.setLocation(10, 40);
        jLabelSobrenome.setLocation(240, 10);
        jTextFieldSobrenome.setLocation(240, 40);
        jButtonConcantenar.setLocation(250, 250);
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jLabelNome);
        jFrame.add(jLabelSobrenome);
        jFrame.add(jTextFieldNome);
        jFrame.add(jTextFieldSobrenome);
        jFrame.add(jButtonConcantenar);
    }

    private void acaoJButtonConcatenar() {
        jButtonConcantenar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(jFrame,
                        (jTextFieldNome.getText().trim())
                        + " " + (jTextFieldSobrenome.getText().trim()));

            }
        });
    }
}
