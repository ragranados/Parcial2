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
public class TigerI implements Tanque{
    
    private final int espera,velocidad;
    private int danio, vida;
    private final static int cosMetal=200,cosMoneda=1000;

    public TigerI() {
        this.espera = 2;
        this.velocidad = 2;
        this.danio = 300;
        this.vida = 600;
    }

    public static int getCosMetal() {
        return cosMetal;
    }

    public static int getCosMoneda() {
        return cosMoneda;
    }
    
    

    @Override
    public void atacar() {
        System.out.println("atacando");
    }

    @Override
    public void destruir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
