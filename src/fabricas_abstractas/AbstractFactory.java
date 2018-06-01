/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas_abstractas;

import productos_abstractos.*;

/**
 *
 * @author rau3
 */
public interface AbstractFactory {
    Tanque CreatePazer(String tipo) throws Exception;
    Avion CreateFlugzeug(String tipo) throws Exception;
    
    
}
