/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas_concretas;

import Bandos.CentroDeMando;
import enumeraciones.Aviones;
import enumeraciones.Divisiones;
import enumeraciones.Edificaciones;
import enumeraciones.Tanques;
import fabricas_abstractas.AbstractFactory;
import fabricas_abstractas.Recursos;
import java.util.ArrayList;
import productos_abstractos.Avion;
import productos_abstractos.Division;
import productos_abstractos.Tanque;
import fabricas_abstractas.Fabrica;
import productos_abstractos.Unidad;

/**
 *
 * @author rau3
 */
public class ProcesadoraHormigon implements AbstractFactory,Recursos,Unidad{
    private int hormigonFabricado,produccion,vida,espera,faseCreacion;
    private static int costHormigon = 1600,costMonedas=5000;
    private static Edificaciones tipoEdificacion = Edificaciones.Procesadora;

    public ProcesadoraHormigon() {
        this.vida = 2000;
        this.espera = 1;
    }
    
    
    @Override
    public void crearRecursos(CentroDeMando c) {
        this.hormigonFabricado+=this.produccion;
        System.out.println("\nSe han producido "+this.produccion+" Kg de hormigon");
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    

    public int getRecursoRecolectado() {
        return hormigonFabricado;
    }

    public void setRecursoRecolectado(int hormigonFabricado) {
        this.hormigonFabricado = hormigonFabricado;
    }
    
    

    public int getProduccion() {
        return produccion;
    }
    
    @Override
    public void setProduccion(int p) {
        this.produccion = p;
    }

    public static int getCostHormigon() {
        return costHormigon;
    }

    public static int getCostMonedas() {
        return costMonedas;
    }

    @Override
    public Edificaciones getTipoEdificacion() {
        return tipoEdificacion;
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
    public Tanque crearTanque(Tanques tipo) throws Exception {
        return null;
    }

    @Override
    public Avion crearAvion(Aviones tipo) throws Exception {
        return null;
    }

    @Override
    public Division entrenarSoldados(Divisiones tipo) throws Exception {
        return null;
    }

    @Override
    public Unidad getObjetivo() {
        return null;
    }

    @Override
    public void atacar() {
        
    }

    @Override
    public void setFaseDeEnvio(int a) {
        
    }

    @Override
    public int getFaseDeEnvio() {
        return 0;
    }

    @Override
    public int getVelocidad() {
        return 0;
    }

}
