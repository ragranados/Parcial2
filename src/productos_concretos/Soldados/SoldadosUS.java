/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos_concretos.Soldados;

import productos_abstractos.Division;
import productos_abstractos.Unidad;

/**
 *
 * @author rau3
 */
public class SoldadosUS implements Division,Unidad{
    
    private final int espera,velocidad;
    private int danio, vida,faseCreacion;
    private final static int cosMoneda=300;
    private Unidad objetivo;

    public SoldadosUS() {
        
        this.espera = 1;
        this.velocidad = 1;
        this.vida=100;
        this.danio=80;
        
    }

    public Unidad getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(Unidad objetivo) {
        this.objetivo = objetivo;
    }
    

    public int getDanio() {
        return danio;
    }

    public void setDanio(int danio) {
        this.danio = danio;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getFaseCreacion() {
        return faseCreacion;
    }

    public void setFaseCreacion(int faseCreacion) {
        this.faseCreacion = faseCreacion;
    }

    public int getEspera() {
        return espera;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public static int getCosMoneda() {
        return cosMoneda;
    }
    

    @Override
    public void atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void morir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
