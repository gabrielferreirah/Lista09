
import java.awt.EventQueue;


/**
 * @author Gabriel de Oliveira Ferreira
 */
public class Lista09 {

    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
              new MenuPrincipal();
            }
        });
    }
    
}
