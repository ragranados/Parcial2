/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos_concretos.Panzers;

import productos_abstractos.Tanque;

/**
 *
 * @author rau3
 */
public class T34 implements Tanque{
    
    private final int espera,velocidad;
    private int danio, vida;
    private final static int cosMetal=300,cosMoneda=700;

    public T34() {
        this.espera = 1;
        this.velocidad = 2;
        this.danio = 300;
        this.vida = 600;
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
