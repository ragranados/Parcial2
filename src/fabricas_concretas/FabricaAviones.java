/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas_concretas;

import enumeraciones.Aviones;
import enumeraciones.Edificaciones;
import enumeraciones.Tanques;
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
    

    private ArrayList<Avion> hangar ;
    Edificaciones tipo ;

    public FabricaAviones() {
        this.hangar= new ArrayList();
        this.tipo = Edificaciones.Aviones;
    }
    

    @Override
    public Tanque crearTanque(Tanques tipo) {
        return null;
    }

    @Override
    public Avion crearAvion(Aviones tipo) throws Exception {
        Avion nuevo;
        if (this.hangar.size() < 10) {
            switch (tipo) {
                case FlugzeugbauAG:
                    nuevo = new FlugzeugbauAG();
                    this.hangar.add(nuevo);
                    return nuevo;
                case Stuka:
                    nuevo = new Stuka();
                    this.hangar.add(nuevo);
                    return nuevo;
                case Tu22M:
                    nuevo = new Tu22M();
                    this.hangar.add(nuevo);
                    return nuevo;
                case Tu95:
                    nuevo = new Tu95();
                    this.hangar.add(nuevo);
                    return nuevo;
            }
        }
        throw new Exception("Fabrica llena");
    }

    public ArrayList<Avion> getHangar() {
        return hangar;
    }

    @Override
    public void crearRecursos() {
        
    }

   
    
}
