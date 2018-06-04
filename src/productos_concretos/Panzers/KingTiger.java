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
public class KingTiger implements Tanque {
    
    private final int espera,velocidad;
    private int danio, vida;
    private final static int cosMetal=700,cosMoneda=3000;

    public KingTiger() {
        this.espera=2;
        this.velocidad=3;
        this.danio = 500;
        this.vida = 800;
    }
    
    
    public void atacar() {
        System.out.println("atacando");
    }

    @Override
    public void destruir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
