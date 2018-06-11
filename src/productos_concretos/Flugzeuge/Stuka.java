/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos_concretos.Flugzeuge;

import enumeraciones.Aviones;
import enumeraciones.Edificaciones;
import productos_abstractos.Avion;
import productos_abstractos.Unidad;

/**
 *
 * @author rau3
 */
public class Stuka implements Avion,Unidad{
    
    private int espera,velocidad;
    private int danio, vida,faseCreacion,faseDeEnvio;
    private final static int cosMetal=750,cosMoneda=1800;
    private Aviones tipo = Aviones.Stuka;
    private Unidad objetivo;

    public Stuka() {
        this.velocidad=2;
        this.espera = 2;
        this.danio=350;
        vida=300;
    }

    public int getFaseCreacion() {
        return faseCreacion;
    }

    public void setFaseCreacion(int faseCreacion) {
        this.faseCreacion = faseCreacion;
    }
    

    public Unidad getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(Unidad objetivo) {
        this.objetivo = objetivo;
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

    public static int getCosMetal() {
        return cosMetal;
    }

    public static int getCosMoneda() {
        return cosMoneda;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getFaseDeEnvio() {
        return faseDeEnvio;
    }

    public void setFaseDeEnvio(int faseDeEnvio) {
        this.faseDeEnvio = faseDeEnvio;
    }
    
        
    @Override
    public void despegar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacar() {
        int nuevaVida;
        nuevaVida = this.objetivo.getVida()-this.danio;
        this.objetivo.setVida(nuevaVida);
        
        if(this.objetivo.getVida()<=0){
            this.objetivo=null;
        }
        System.err.println("\nSe han bajado "+this.danio+"de vida al enemigo\n");
    }

    @Override
    public void destruir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Edificaciones getTipoEdificacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
