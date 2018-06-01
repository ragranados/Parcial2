/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

import fabricas_abstractas.AbstractFactory;
import fabricas_concretas.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import productos_abstractos.*;


/**
 *
 * @author Raul Granados 00138816
 */
public class Parcial2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            //FactoryProducer FactoryProducer = new FactoryProducer();
            AbstractFactory factory = CreadorEdificaciones.getFactory("Flugzeug");
            Avion panzer1=factory.CreateFlugzeug("Bf109");
            Avion panzer2=factory.CreateFlugzeug("Bf109");
            Avion panzer3=factory.CreateFlugzeug("Bf109");
            Avion panzer4=factory.CreateFlugzeug("Bf109");
            Avion panzer5=factory.CreateFlugzeug("Bf109");
            Avion panzer6=factory.CreateFlugzeug("Bf109");
            Avion panzer7=factory.CreateFlugzeug("Bf109");
            Avion panzer8=factory.CreateFlugzeug("Bf109");
            Avion panzer9=factory.CreateFlugzeug("Bf109");
            Avion panzer10=factory.CreateFlugzeug("Bf109");
            Avion panzer11=factory.CreateFlugzeug("Bf109");
            Avion panzer12=factory.CreateFlugzeug("Bf109");
            
            
            //panzer1.atacar();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
    
}
