
package taller8;

import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author Administrador
 */
public class Taller8 
{

    public static void main(String[] args) 
    {
        Modelo mod = new Modelo();
        Vista view = new Vista();
        
        Controlador ctrl= new Controlador(view, mod);
        ctrl.iniciar();
        view.setVisible(true);
    }
    
}
