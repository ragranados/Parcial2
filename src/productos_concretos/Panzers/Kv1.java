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
public class Kv1 implements Tanque{
    
    private final int espera,velocidad;
    private int danio, vida;
    private final static int cosMetal=600,cosMoneda=1500;

    public Kv1() {
        this.espera = 2;
        this.velocidad = 2;
        this.danio = 400;
        this.vida = 800;
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
