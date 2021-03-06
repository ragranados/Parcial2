/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos_concretos.Flugzeuge;

import enumeraciones.Edificaciones;
import productos_abstractos.Avion;
import productos_abstractos.Unidad;

/**
 *
 * @author rau3
 */
public class AvionUS implements Avion,Unidad{
    
    private int espera,velocidad;
    private int danio, vida,faseCreacion,faseDeEnvio;
    private final static int cosMetal=500,cosMoneda=1500;
    private Unidad objetivo;

    public AvionUS() {
        velocidad=2;
        espera = 1;
        this.danio = 200 ;
        this.vida = 150;
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

    public int getDanio() {
        return danio;
    }

    public int getVida() {
        return vida;
    }

    public int getVelocidad() {
        return velocidad;
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
    public void atacar() {
        int nuevaVida;
        nuevaVida = this.objetivo.getVida()-this.danio;
        this.objetivo.setVida(nuevaVida);
        System.err.println("\nSe han bajado "+this.danio+"de vida al enemigo\n");
        
        if(this.objetivo.getVida()<=0){
            System.out.println("\nSe ha destruido la unidad de tipo: "+this.objetivo.getNombreUnidad());
            this.objetivo=null;
        }
        
    }
    
    public String getNombreUnidad(){
        return "Avion US";
    }

    
    @Override
    public void despegar() {
        throw new UnsupportedOperationException("Avion USNot supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void destruir() {
        throw new UnsupportedOperationException("Avion USNot supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Edificaciones getTipoEdificacion() {
        throw new UnsupportedOperationException("Avion USNot supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
