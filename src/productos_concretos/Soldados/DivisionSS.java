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
public class DivisionSS implements Division,Unidad{
    
    private final int espera,velocidad;
    private int danio, vida,faseCreacion,faseDeEnvio;
    private final static int cosMoneda=500;
    private Unidad objetivo;

    public DivisionSS() {
        this.espera = 1;
        this.velocidad = 2;
        this.vida=150;
        this.danio=140;
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

    public static int getCosMoneda() {
        return cosMoneda;
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
        System.err.println("\nSe han bajado "+this.danio+"de vida al enemigo\n");
        
        if(this.objetivo.getVida()<=0){
            System.out.println("\nSe ha destruido la edificacion de tipo: "+this.objetivo.getNombreUnidad());
            this.objetivo=null;
        }
    }
    
    public String getNombreUnidad(){
        return "Division SS";
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
