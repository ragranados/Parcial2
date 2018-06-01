/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazBandos;

import fabricas_abstractas.AbstractFactory;

/**
 *
 * @author rau3
 */
public interface Pais {
    AbstractFactory crearEdificacion(String tipo) throws Exception;
    
}
