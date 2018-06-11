/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos_concretos.Soldados;

import enumeraciones.Edificaciones;
import productos_abstractos.Division;
import productos_abstractos.Unidad;

/**
 *
 * @author rau3
 */
public class ComandantesRojo implements Division,Unidad{
    private final int espera,velocidad;
    private int danio, vida,faseCreacion,faseDeEnvio;
    private final static int cosMoneda=500;
    private Unidad objetivo;

    public ComandantesRojo() {
        this.espera = 1;
        this.velocidad = 2;
        this.vida=150;
        this.danio=140;
        
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

    public int getDanio() {
        return danio;
    }

    public static int getCosMoneda() {
        return cosMoneda;
    }
    

    public Unidad getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(Unidad objetivo) {
        this.objetivo = objetivo;
    }
    

    public int getVida() {
        return vida;
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
    public void morir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Edificaciones getTipoEdificacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
