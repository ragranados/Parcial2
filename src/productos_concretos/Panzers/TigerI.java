/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos_concretos.Panzers;

import enumeraciones.Edificaciones;
import productos_abstractos.Tanque;
import productos_abstractos.Unidad;

/**
 *
 * @author rau3
 */
public class TigerI implements Tanque,Unidad{
    
    private final int espera,velocidad;
    private int danio, vida,faseCreacion,faseDeEnvio;
    private final static int cosMetal=200,cosMoneda=1000;
    private Unidad objetivo;

    public TigerI() {
        this.espera = 2;
        this.velocidad = 2;
        this.danio = 300;
        this.vida = 600;
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
    

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    

    public static int getCosMetal() {
        return cosMetal;
    }

    public static int getCosMoneda() {
        return cosMoneda;
    }

    public int getFaseDeEnvio() {
        return faseDeEnvio;
    }

    public void setFaseDeEnvio(int faseDeEnvio) {
        this.faseDeEnvio = faseDeEnvio;
    }
    
    public String getNombreUnidad(){
        return "Tanque Tiger I";
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

    @Override
    public void destruir() {
        throw new UnsupportedOperationException("tiger 1 Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Edificaciones getTipoEdificacion() {
        throw new UnsupportedOperationException("edif tiger 1Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
