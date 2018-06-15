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
public class Tu95 implements Avion,Unidad{
    
    private int espera,velocidad;
    private int danio, vida,faseCreacion,faseDeEnvio;
    private static int cosMetal=350,cosMoneda=1000;
    private Unidad objetivo;

    public Tu95() {
        this.velocidad=2;
        this.espera=1;
        this.danio = 150;
        this.vida = 280;
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
    

    public Unidad getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(Unidad objetivo) {
        this.objetivo = objetivo;
    }

    public int getFaseCreacion() {
        return faseCreacion;
    }

    public void setFaseCreacion(int faseCreacion) {
        this.faseCreacion = faseCreacion;
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
       

    @Override
    public void despegar() {
        throw new UnsupportedOperationException("tu95Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        return "Avion Tu95";
    }

    @Override
    public void destruir() {
        throw new UnsupportedOperationException("tu95Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Edificaciones getTipoEdificacion() {
        throw new UnsupportedOperationException("tu95Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
