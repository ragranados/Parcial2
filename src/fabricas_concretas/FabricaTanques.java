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
import productos_concretos.Panzers.*;
import productos_abstractos.Tanque;
import productos_abstractos.Avion;

/**
 *
 * @author rau3
 */
public class FabricaTanques implements AbstractFactory{
    
    private ArrayList<Tanque> hangarTanques ;
    Edificaciones tipo;

    public FabricaTanques() {
        this.hangarTanques=new ArrayList();
        this.tipo = Edificaciones.Tanques;
    }
    

    @Override
    public Tanque crearTanque(Tanques tipo) throws Exception {
        Tanque nuevo;
        if (hangarTanques.size() < 10) {
            switch (tipo) {
                case KingTiger:
                    nuevo = new KingTiger();
                    this.hangarTanques.add(nuevo);
                    return nuevo;
                case TigerI:
                    nuevo = new TigerI();
                    this.hangarTanques.add(nuevo);
                    return nuevo;
                case Kv1:
                    nuevo = new Kv1();
                    this.hangarTanques.add(nuevo);
                    return nuevo;
                case T34:
                    nuevo = new T34();
                    this.hangarTanques.add(nuevo);
                    return nuevo;
            }
        }
        throw new Exception("Fabrica llena");
    }

    @Override
    public Avion crearAvion(Aviones tipo) {
        return null;
    }

    @Override
    public void crearRecursos() {
        
    }
    
}
