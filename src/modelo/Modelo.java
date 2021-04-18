/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Modelo 
{
    // los trabajadores son
    //MATEO
    //LUIS
    //ANTONIO
    //PEDRO
    
    private double acumat;
    private double aculuis;
    private double acuant;
    private double acupedro;
    
    private double laB;
    private double laE;
    private double deB;
    private double deA;
    private double com1;
    private double com2;
    private double com3; ;

    
    public void estrella()
    {
        
    }
    public void estrella(double acumat,double aculuis,double acuant,double acupedro,double laB,double laE,double deB,double deA,double com1,double com2,double com3 )
    {
       this.acumat=acumat;
       this.aculuis=aculuis;
       this.acuant=acuant;
       this.acupedro=acupedro;
       this.laB=laB;
       this.laE=laE;
       this.deB=deB;
       this.deA=deA;
       this.com1=com1;
       this.com2=com2;
       this.com3=com3;
       
       
    }

    public double getLaB() {
        return laB;
    }

    public void setLaB(double laB) {
        this.laB = laB;
    }

    public double getLaE() {
        return laE;
    }

    public void setLaE(double laE) {
        this.laE = laE;
    }

    public double getDeB() {
        return deB;
    }

    public void setDeB(double deB) {
        this.deB = deB;
    }

    public double getDeA() {
        return deA;
    }

    public void setDeA(double deA) {
        this.deA = deA;
    }

    public double getCom1() {
        return com1;
    }

    public void setCom1(double com1) {
        this.com1 = com1;
    }

    public double getCom2() {
        return com2;
    }

    public void setCom2(double com2) {
        this.com2 = com2;
    }

    public double getCom3() {
        return com3;
    }

    public void setCom3(double com3) {
        this.com3 = com3;
    }
    
    

    public double getAcupedro() {
        return acupedro;
    }

    public void setAcupedro(double acupedro) {
        this.acupedro = acupedro;
    }
    
    public double getAcumat() 
    {
        return acumat;
    }

    public void setAcumat(double acumat) 
    {
        this.acumat = acumat;
    }

    public double getAculuis() 
    {
        return aculuis;
    }

    public void setAculuis(double aculuis) 
    {
        this.aculuis = aculuis;
    }

    public double getAcuant() 
    {
        return acuant;
    }

    public void setAcuant(double acuant) 
    {
        this.acuant = acuant;
    }
    
    public void carro()
    {
        int lavB= 20000;
        int lavE= 25000;
        int desB= 22000;
        int desA= 30000;
        int comb1= 25000;
        int comb2= 60000;
        int comb3= 130000;
        String [] botones ={"lavado basico","lavado especial","desinfeccion basica","desinfeccion avanzada","combo 1","combo 2","combo 3"};
        int L= JOptionPane.showOptionDialog(null, "ELIJA EL PROCEDIMIENTO QUE DESEA","ELIJA", 0,JOptionPane.QUESTION_MESSAGE,null, botones,botones[0]);
        if(L ==0)
        {
            acumat=acumat + lavB;
            laB= laB + lavB;
            
        }
        
        if(L ==1)
        {
            aculuis=aculuis + lavE;
            laE= laE + lavE;
        }
        if(L ==2)
        {
            acuant=acuant + lavB;
            deB= deB +desB;
        }
        if(L ==3)
        {
            acupedro=acupedro + desA;
            deA= deA +desA;
        }
        if(L ==4)
        {
            acumat=acumat + comb1;
            com1= com1 + comb2;
        }
        if(L ==5)
        {
            aculuis=aculuis + comb2;
            com2= com2 + comb2;
        }
        if(L ==6)
        {
            acuant=acuant + comb3;
            com3= com3 + comb3; 
        }
    }
    
        public void camioneta()
    {
        int lavB= 25000;
        int lavE= 30000;
        int desB= 26000;
        int desA= 40000;
        int comb1= 30000;
        int comb2= 90000;
        int comb3= 190000;
        String [] botones ={"lavado basico","lavado especial","desinfeccion basica","desinfeccion avanzada","combo 1","combo 2","combo 3"};
        int L= JOptionPane.showOptionDialog(null, "ELIJA EL PROCEDIMIENTO QUE DESEA","ELIJA", 0,JOptionPane.QUESTION_MESSAGE,null, botones,botones[0]);
        if(L ==0)
        {
            acumat=acumat + lavB;
            laB= laB + lavB;
            
        }
        
        if(L ==1)
        {
            aculuis=aculuis + lavE;
            laE= laE + lavE;
        }
        if(L ==2)
        {
            acuant=acuant + lavB;
            deB= deB +desB;
        }
        if(L ==3)
        {
            acupedro=acupedro + desA;
            deA= deA +desA;
        }
        if(L ==4)
        {
            acumat=acumat + comb1;
            com1= com1 + comb2;
        }
        if(L ==5)
        {
            aculuis=aculuis + comb2;
            com2= com2 + comb2;
        }
        if(L ==6)
        {
            acuant=acuant + comb3;
            com3= com3 + comb3; 
        }
    }
    
    
}
