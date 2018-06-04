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
public class Tu22M implements Avion{
    
    private final int espera,velocidad;
    private int danio, vida;
    private static final int cosMetal=300,cosMoneda=850;

    public Tu22M() {
        this.velocidad=1;
        this.espera=1;
        this.danio = 60;
        this.vida = 130;
    }

    public int getEspera() {
        return espera;
    }

    public int getDanio() {
        return danio;
    }

    public int getVida() {
        return vida;
    }

    public static int getCosMetal() {
        return cosMetal;
    }

    public static int getCosMoneda() {
        return cosMoneda;
    }

    public void setVida(int vida) {
        this.vida = vida;
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
