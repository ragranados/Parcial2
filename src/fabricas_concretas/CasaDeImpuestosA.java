/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas_concretas;

import enumeraciones.*;
import fabricas_abstractas.AbstractFactory;
import fabricas_abstractas.Recursos;
import java.util.ArrayList;

import productos_abstractos.Avion;
import productos_abstractos.Tanque;
import productos_abstractos.Division;
import fabricas_abstractas.Fabrica;
import productos_abstractos.Unidad;

/**
 *
 * @author rau3
 */
public class CasaDeImpuestosA implements AbstractFactory,Recursos,Unidad{
    private int impRecolectados,produccion,faseCreacion, espera;
    private static int costHormigon=1000,costMonedas=5050;
    private int vida;
    private static Edificaciones tipoEdificacion = Edificaciones.Impuestos;

    public CasaDeImpuestosA() {
        this.vida=1500;
        this.impRecolectados=0;
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
    public void crearRecursos(int a) {
        this.impRecolectados+=produccion;
    }

    public int getImpRecolectados() {
        return impRecolectados;
    }

    public void setImpRecolectados(int impRecolectados) {
        this.impRecolectados = impRecolectados;
    }

    public int getProduccion() {
        return produccion;
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
    public Division entrenarSoldados(Divisiones tipo) {
        return null;
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
    public Unidad getObjetivo() {
        return null;
    }
    
    
    
}
