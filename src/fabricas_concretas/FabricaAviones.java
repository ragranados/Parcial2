/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas_concretas;

import fabricas_abstractas.AbstractFactory;

import java.util.ArrayList;
import productos_concretos.Flugzeuge.*;
import productos_abstractos.Tanque;
import productos_abstractos.Avion;

/**
 *
 * @author rau3
 */
public class FabricaAviones implements AbstractFactory {

    private ArrayList<Avion> hangar = new ArrayList();

    @Override
    public Tanque CreatePazer(String tipo) {
        return null;
    }

    @Override
    public Avion CreateFlugzeug(String tipo) throws Exception {
        Avion nuevo;
        if (this.hangar.size() < 10) {
            switch (tipo) {
                case "AG":
                    nuevo = new FlugzeugbauAG();
                    this.hangar.add(nuevo);
                    return nuevo;
                case "Stuka":
                    nuevo = new Stuka();
                    this.hangar.add(nuevo);
                    return nuevo;
            }
        }
        throw new Exception("Fabrica llena");
    }

    public ArrayList<Avion> getHangar() {
        return hangar;
    }
    
}
