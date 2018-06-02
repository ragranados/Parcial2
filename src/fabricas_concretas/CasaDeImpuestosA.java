/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas_concretas;

import enumeraciones.Aviones;
import enumeraciones.Tanques;
import fabricas_abstractas.AbstractFactory;

import productos_abstractos.Avion;
import productos_abstractos.Tanque;

/**
 *
 * @author rau3
 */
public class CasaDeImpuestosA implements AbstractFactory{
    int impRecolectados=0,produccion;

    @Override
    public Tanque crearTanque(Tanques tipo) throws Exception {
        return null;
    }

    @Override
    public Avion crearAvion(Aviones tipo) throws Exception {
        return null;
    }

    @Override
    public void crearRecursos() {
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

    public void setProduccion(int produccion) {
        this.produccion = produccion;
    }
    
    
    
    
}
