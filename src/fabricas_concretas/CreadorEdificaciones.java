/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas_concretas;

import enumeraciones.Edificaciones;
import fabricas_abstractas.AbstractFactory;
import java.util.Scanner;


/**
 *
 * @author rau3
 */
public class CreadorEdificaciones {
    Scanner scanner = new Scanner(System.in);
    public static AbstractFactory getFactory(Edificaciones tipo) throws Exception{
        switch(tipo){
            case Tanques:
                
                return new FabricaTanques();
                
            case Aviones:
                return new FabricaAviones();
            case Academia:
                return new Academia();
            case Impuestos:
                return new CasaDeImpuestosA();
                
            default:
                return null;
        }
        
        //return null;
    }
    /*public static AbstractFactory getRecolectores(String tipo){
        switch(tipo){
        case "ImpuestosA":
                return new CasaDeImpuestosA();
        }
        return null;
    }*/
    
}
