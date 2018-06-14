/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas_concretas;

import enumeraciones.*;;



import productos_concretos.Flugzeuge.*;

import fabricas_abstractas.Fabrica;


import productos_abstractos.Division;import fabricas_abstractas.AbstractFactory;

import java.util.ArrayList;
import java.util.Objects;

import productos_abstractos.Tanque;
import productos_abstractos.Avion;
import productos_abstractos.Unidad;


import productos_concretos.Flugzeuge.*;

import fabricas_abstractas.Fabrica;


import productos_abstractos.Division;import fabricas_abstractas.AbstractFactory;

import java.util.ArrayList;

import productos_abstractos.Tanque;
import productos_abstractos.Avion;
import productos_abstractos.Unidad;


/**
 *
 * @author rau3
 */
public class FabricaAviones implements AbstractFactory ,Fabrica,Unidad{
    
    private int vida,faseCreacion,espera;
    private static int costHormigon=1100,costMonedas=5000;
    private ArrayList<Avion> hangar ;
    private Edificaciones tipoEdificacion ;

    public FabricaAviones() {
        this.espera = 1;
        this.vida=3000;
        this.hangar= new ArrayList();
        this.tipoEdificacion = Edificaciones.Aviones;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
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
    public Avion crearAvion(Aviones tipo) throws Exception {
        Avion nuevo;
        if (this.hangar.size() < 10) {
            switch (tipo) {
                case AvionUS:
                    nuevo = new AvionUS();
                    this.hangar.add(nuevo);
                    System.out.println("\nSe ha creado un avion de US");
                    return nuevo;
                case Stuka:
                    nuevo = new Stuka();
                    this.hangar.add(nuevo);
                    System.out.println("\nSe ha creado un avion aleman");
                    return nuevo;
                case Tu95:
                    nuevo = new Tu95();
                    this.hangar.add(nuevo);
                    System.out.println("\nSe ha creado un avion sovieto");
                    return nuevo;
            }
        }
        throw new Exception("Fabrica llena");
    }

    public ArrayList<Avion> getHangar() {
        return hangar;
    }
    
    @Override
    public int getHangerSize() {
        return this.hangar.size();
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
        hash = 31 * hash + this.faseCreacion;
        hash = 31 * hash + Objects.hashCode(this.tipoEdificacion);
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
        final FabricaAviones other = (FabricaAviones) obj;
        if (this.faseCreacion != other.faseCreacion) {
            return false;
        }
        if (this.tipoEdificacion != other.tipoEdificacion) {
            return false;
        }
        return true;
    }
    

   @Override
    public Tanque crearTanque(Tanques tipo) {
        return null;
    }

    @Override
    public Division entrenarSoldados(Divisiones tipo) {
        return null;
    }

    @Override
    public ArrayList<Tanque> getHangarTanques() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Unidad getObjetivo() {
        return null;
    }

    @Override
    public ArrayList<Division> getCuartel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setFaseDeEnvio(int a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getFaseDeEnvio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getVelocidad() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
