/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas_concretas;

import Bandos.CentroDeMando;
import enumeraciones.*;
import fabricas_abstractas.AbstractFactory;
import fabricas_abstractas.Recursos;
import java.util.ArrayList;
import productos_abstractos.Avion;
import productos_abstractos.Tanque;
import productos_abstractos.Division;
import fabricas_abstractas.Fabrica;
import java.util.Objects;
import productos_abstractos.Unidad;

/**
 *
 * @author rau3
 */
public class MinaMetal implements AbstractFactory,Recursos,Unidad{
    
    private int metalRecolectado,produccion,vida,espera,faseCreacion;
    private static int costHormigon=1500,costMonedas=5000;
    private Edificaciones tipoEdificacion = Edificaciones.MinaMetal;

    public MinaMetal() {
        this.espera =1;
        this.vida=2000;
        this.metalRecolectado=0;
        
    }

    public int getRecursoRecolectado() {
        return metalRecolectado;
    }

    public void setRecursoRecolectado(int metalRecolectado) {
        this.metalRecolectado = metalRecolectado;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    
    @Override
    public void crearRecursos(CentroDeMando c) {
        this.metalRecolectado += this.produccion;
        System.out.println("\nSe han producido "+this.produccion+" Kg de metal");
    }

    public static int getCostHormigon() {
        return costHormigon;
    }

    public static int getCostMonedas() {
        return costMonedas;
    }

    public Edificaciones getTipoEdificacion() {
        return tipoEdificacion;
    }

    @Override
    public void setProduccion(int produccion) {
        this.produccion = produccion;
    }
    
    @Override
    public int getFaseCreacion() {
        return faseCreacion;
    }

    @Override
    public int getEspera() {
        return espera;
    }
    
    @Override
    public void setFaseCreacion(int a){
        this.faseCreacion=a;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + this.faseCreacion;
        hash = 43 * hash + Objects.hashCode(this.tipoEdificacion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MinaMetal other = (MinaMetal) obj;
        if (this.faseCreacion != other.faseCreacion) {
            return false;
        }
        if (this.tipoEdificacion != other.tipoEdificacion) {
            return false;
        }
        return true;
    }
    
    public String getNombreUnidad(){
        return this.tipoEdificacion.toString();
    }
    
    
    @Override
    public Tanque crearTanque(Tanques tipo) throws Exception {
        return null;
    }

    @Override
    public Avion crearAvion(Aviones tipo) throws Exception {
        return null;
    }
    
    @Override
    public Division entrenarSoldados(Divisiones tipo) {
        return null;
    }

    @Override
    public Unidad getObjetivo() {
       return null;
    }

    @Override
    public void atacar() {
        throw new UnsupportedOperationException("metal Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setFaseDeEnvio(int a) {
        throw new UnsupportedOperationException("metalNot supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getFaseDeEnvio() {
        throw new UnsupportedOperationException("metalNot supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getVelocidad() {
        throw new UnsupportedOperationException("metalNot supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
    
}
