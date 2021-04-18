
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author Administrador
 */
public class Controlador implements ActionListener
{
    private Vista view;
    private Modelo model;
    
    public Controlador(Vista view,Modelo model)
    {
        this.view=view;
        this.model=model;
        this.view.jButton1.addActionListener(this);
        this.view.jButton2.addActionListener(this);
        this.view.jButton3.addActionListener(this);
        this.view.jButton4.addActionListener(this);
        this.view.jButton5.addActionListener(this);
    }
    
    public void iniciar()
    {
        view.setTitle("MVC ESTRELLA");
        view.setLocationRelativeTo(null);
    }
    
    
    public void actionPerformed(ActionEvent e)
    {
        model.getAcumat();
        model.getAcuant();
        model.getAculuis();
        model.getAcupedro();
        model.getCom1();
        model.getCom2();
        model.getCom3();
        model.getDeA();
        model.getDeB();
        model.getLaB();
        model.getLaE();
        
        model.carro();
        model.camioneta();
        
        view.jButton1.setAction((model.carro()));
        view.jButton2.setAction((model.camioneta()));
    }
} 