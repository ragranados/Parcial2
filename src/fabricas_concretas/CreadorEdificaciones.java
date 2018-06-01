/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas_concretas;

import fabricas_abstractas.AbstractFactory;


/**
 *
 * @author rau3
 */
public class CreadorEdificaciones {
    public static AbstractFactory getFactory(String tipo){
        switch(tipo){
            case "Tanques":
                return new FabricaTanques();
                
            case "Aviones":
                return new FabricaAviones();
                
            case "ImpuestosA":
                return new CasaDeImpuestosA();
            
        }
        
        return null;
    }
    /*public static AbstractFactory getRecolectores(String tipo){
        switch(tipo){
        case "ImpuestosA":
                return new CasaDeImpuestosA();
        }
        return null;
    }*/
    
}
