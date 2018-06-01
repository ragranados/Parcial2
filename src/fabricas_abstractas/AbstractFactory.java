/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas_abstractas;

import enumeraciones.Edificaciones;
import productos_abstractos.*;

/**
 *
 * @author rau3
 */
public interface AbstractFactory {
    Tanque crearTanque(String tipo) throws Exception;
    Avion crearAvion(String tipo) throws Exception;
    void crearRecursos();
    
    
}
