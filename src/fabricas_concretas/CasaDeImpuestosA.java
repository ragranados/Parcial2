/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas_concretas;

import fabricas_abstractas.AbstractFactory;

import productos_abstractos.Avion;
import productos_abstractos.Tanque;

/**
 *
 * @author rau3
 */
public class CasaDeImpuestosA implements AbstractFactory{

    @Override
    public Tanque crearTanque(String tipo) throws Exception {
        return null;
    }

    @Override
    public Avion crearAvion(String tipo) throws Exception {
        return null;
    }

    @Override
    public void crearRecursos() {
        //Aqui se hara la forma de producir recursos por fase
    }
    
}
