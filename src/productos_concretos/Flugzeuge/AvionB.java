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
public class AvionB implements Avion{
    private int espera,velocidad;
    private int danio, vida;
    private String nombre;
    private final static int cosMetal=500,cosMoneda=1500;

    public AvionB(int espera, int velocidad,int danio,int vida, String nombre) {
        this.espera = espera;
        this.velocidad = danio;
        this.danio = danio;
        this.vida = vida;
        this.nombre = nombre;
    }

    public int getEspera() {
        return espera;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getDanio() {
        return danio;
    }

    public int getVida() {
        return vida;
    }

    public String getNombre() {
        return nombre;
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
