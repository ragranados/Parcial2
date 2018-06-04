/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos_concretos.Flugzeuge;

import productos_abstractos.Avion;

/**
 *
 * @author rau3
 */
public class Stuka implements Avion{
    
    private int espera,velocidad;
    private int danio, vida;
    private final static int cosMetal=750,cosMoneda=1800;

    public Stuka() {
        this.velocidad=1;
        this.espera = 2;
        this.danio=350;
        vida=300;
    }
    
    

    @Override
    public void despegar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void destruir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
