/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RaulWorld;

import enumeraciones.Aviones;
import enumeraciones.Edificaciones;
import fabricas_abstractas.AbstractFactory;
import fabricas_concretas.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import productos_abstractos.*;
import productos_concretos.Flugzeuge.Stuka;


/**
 *
 * @author Raul Granados 00138816
 */
public class RaulWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*try {
            //FactoryProducer FactoryProducer = new FactoryProducer();
            AbstractFactory factory = CreadorEdificaciones.getFactory(Edificaciones.Aviones);
            Avion panzer1=factory.crearAvion(Aviones.Stuka);
            Avion panzer2=factory.crearAvion(Aviones.Stuka);
            Avion panzer3=factory.crearAvion(Aviones.Stuka);
            Avion panzer4=factory.crearAvion(Aviones.Stuka);
            Avion panzer5=factory.crearAvion(Aviones.Stuka);
            Avion panzer6=factory.crearAvion(Aviones.Stuka);
            Avion panzer7=factory.crearAvion(Aviones.Stuka);
            Avion panzer8=factory.crearAvion(Aviones.Stuka);
            Avion panzer9=factory.crearAvion(Aviones.Stuka);
            Avion panzer10=factory.crearAvion(Aviones.Stuka);
            System.out.println("Holaaaaaaa");
            Avion panzer11=factory.crearAvion(Aviones.Stuka);
            Avion panzer12=factory.crearAvion(Aviones.Stuka);
            
            
            
            //panzer1.atacar();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }*/
        
        Menu menu = Menu.getInstance();
            menu.jugar();
        System.out.println("Precio Stuka: "+Stuka.getCosMetal());
        
    }
    
}
