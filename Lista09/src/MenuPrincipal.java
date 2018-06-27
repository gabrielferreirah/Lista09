import exercicio01.BaseInterface;
import exercicio01.E01L09;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * @author Gabriel de Oliveira Ferreira
 */
public class MenuPrincipal implements BaseInterface {

    private JFrame jFrame;
    private JButton jButton01;
    private JButton jButton02;
    private JButton jButton03;
    private JButton jButton04;
    private JButton jButton05;
    private JButton jButton06;
    private JButton jButton07;
    private JButton jButton08;
    private JButton jButton09;

    public MenuPrincipal() {
        gerarTela();
        instanciarComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
        acaoJButton01();
        acaoJButton02();
        acaoJButton03();
        acaoJButton04();
        acaoJButton05();
        acaoJButton06();
        acaoJButton07();
        acaoJButton08();
        acaoJButton09();
        jFrame.setVisible(true);
    }

    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(505, 400);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jButton01);
        jFrame.add(jButton02);
        jFrame.add(jButton03);
        jFrame.add(jButton04);
        jFrame.add(jButton05);
        jFrame.add(jButton06);
        jFrame.add(jButton07);
        jFrame.add(jButton08);
        jFrame.add(jButton09);
    }

    @Override
    public void instanciarComponentes() {
        jButton01 = new JButton("Exercício 01");
        jButton02 = new JButton("Exercício 02");
        jButton03 = new JButton("Exercício 03");
        jButton04 = new JButton("Exercício 04");
        jButton05 = new JButton("Exercício 05");
        jButton06 = new JButton("Exercício 06");
        jButton07 = new JButton("Exercício 07");
        jButton08 = new JButton("Exercício 08");
        jButton09 = new JButton("Exercício 09");
    }

    @Override
    public void gerarLocalizacoes() {
        jButton01.setLocation(10, 10);
        jButton02.setLocation(130, 10);
        jButton03.setLocation(250, 10);
        jButton04.setLocation(370, 10);
        jButton05.setLocation(10, 120);
        jButton06.setLocation(130, 120);
        jButton07.setLocation(250, 120);
        jButton08.setLocation(370, 120);
        jButton09.setLocation(10, 230);
    }

    @Override
    public void gerarDimensoes() {
        jButton01.setSize(110, 100);
        jButton02.setSize(110, 100);
        jButton03.setSize(110, 100);
        jButton04.setSize(110, 100);
        jButton05.setSize(110, 100);
        jButton06.setSize(110, 100);
        jButton07.setSize(110, 100);
        jButton08.setSize(110, 100);
        jButton09.setSize(110, 100);
    }

    public void acaoJButton01() {
        jButton01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new E01L09();
            }
        });
    }

    public void acaoJButton02() {
        jButton02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new E01L09();
            }
        });
    }

    public void acaoJButton03() {
        jButton03.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new E01L09();
            }
        });
    }

    public void acaoJButton04() {
        jButton04.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new E01L09();
            }
        });
    }

    public void acaoJButton05() {
        jButton05.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new E01L09();
            }
        });
    }

    public void acaoJButton06() {
        jButton06.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new E01L09();
            }
        });
    }

    public void acaoJButton07() {
        jButton07.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new E01L09();
            }
        });
    }

    public void acaoJButton08() {
        jButton08.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new E01L09();
            }
        });
    }

    public void acaoJButton09() {
        jButton09.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new E01L09();
            }
        });
    }
}