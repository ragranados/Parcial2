/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bandos;

import enumeraciones.Edificaciones;
import fabricas_abstractas.AbstractFactory;
import fabricas_concretas.CreadorEdificaciones;

/*import InterfazBandos.Pais;
import enumeraciones.Edificaciones;
import fabricas_abstractas.AbstractFactory;
import fabricas_concretas.CreadorEdificaciones;
import java.util.ArrayList;*/

/**
 *
 * @author rau3
 */
public class Alemania extends CentroDeMando{

    public Alemania(String comandante) {
        super(comandante);
    }
    
    @Override
    public AbstractFactory crearEdificacion(Edificaciones tipo) throws Exception {
        
        AbstractFactory nuevo = CreadorEdificaciones.getFactory(tipo);
        this.edificaciones.add(nuevo);
        return nuevo;
        
    }
    
    
    /*int metal, moneda,hormigon,vida;
    int maxMetal,maxMoneda,maxHormigon;
    String comandante;
    ArrayList<AbstractFactory> edificaciones = new ArrayList();

    public Alemania(String comandante) {
        this.moneda=1000;
        this.hormigon=500;
        this.metal=300;
        this.maxMetal = 3000;
        this.maxMoneda = 10000;
        this.maxHormigon =5000;
        this.vida=1000;
        this.comandante=comandante;
    }
    
    
    
    @Override
    public AbstractFactory crearEdificacion(Edificaciones tipo) throws Exception {
        AbstractFactory nuevo = CreadorEdificaciones.getFactory(tipo);
        this.edificaciones.add(nuevo);
        return nuevo;

    }

    public int getMetal() {
        return metal;
    }

    public void setMetal(int metal) {
        this.metal = metal;
    }

    public int getMarcoImperial() {
        return moneda;
    }

    public void setMarcoImperial(int marcoImperial) {
        this.moneda = marcoImperial;
    }

    public int getHormigon() {
        return hormigon;
    }

    public void setHormigon(int hormigon) {
        this.hormigon = hormigon;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getMaxMetal() {
        return maxMetal;
    }

    public void setMaxMetal(int maxMetal) {
        this.maxMetal = maxMetal;
    }

    public int getMaxMarcoImperial() {
        return maxMoneda;
    }

    public void setMaxMarcoImperial(int maxMarcoImperial) {
        this.maxMoneda = maxMarcoImperial;
    }

    public int getMaxHormigon() {
        return maxHormigon;
    }

    public void setMaxHormigon(int maxHormigon) {
        this.maxHormigon = maxHormigon;
    }

    public String getComandante() {
        return comandante;
    }

    public void setComandante(String comandante) {
        this.comandante = comandante;
    }

    public ArrayList<AbstractFactory> getEdificaciones() {
        return edificaciones;
    }

    public void setEdificaciones(ArrayList<AbstractFactory> edificaciones) {
        this.edificaciones = edificaciones;
    }*/
    
    
    
    
}
