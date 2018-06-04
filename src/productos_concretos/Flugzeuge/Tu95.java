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
public class Tu95 implements Avion{
    
    private int espera,velocidad;
    private int danio, vida;
    private static int cosMetal=350,cosMoneda=1000;

    public Tu95() {
        this.velocidad=1;
        this.espera=1;
        this.danio = 150;
        this.vida = 280;
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
