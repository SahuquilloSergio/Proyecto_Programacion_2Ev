package pro_proyecto_2ev;

import com.sergioadrian.juego.*;
import javax.swing.JOptionPane;
/**
 *
 * @author abrandarizdominguez & ssahuquilloembade
 */
public class PRO_Proyecto_2ev {

    public static void main(String[] args) {
        MetodosPregunta obj1 = new MetodosPregunta();
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "****** Menu *****\n"
                + "1) Añadir pregunta\n"
                + "2) Leer Pregunta\n"
                + "3) Salir"));
        do {
            switch(opcion) {
                case 1: obj1.menuAñadir();
                    break;
                case 2:
                case 3: System.exit(0);
                    
            }
        } while (opcion > 3);
    }
    
}
