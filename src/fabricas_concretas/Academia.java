/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas_concretas;

import enumeraciones.*;
import enumeraciones.Tanques;
import fabricas_abstractas.AbstractFactory;
import java.util.ArrayList;
import productos_abstractos.*;
import productos_concretos.Soldados.*;
import fabricas_abstractas.Fabrica;


/**
 *
 * @author rau3
 */
public class Academia implements AbstractFactory,Fabrica {

    private ArrayList<Division> cuartel;
    private Edificaciones tipoEdificacion = Edificaciones.Academia;
    private static int costHormigon = 1400, costMonedas = 4000;

    public Academia() {
        this.cuartel = new ArrayList();
    }
    
    @Override
    public Division entrenarSoldados(Divisiones tipo) throws Exception {
        Division nuevo = null;
        if (this.cuartel.size() < 10) {
            switch (tipo) {
                case Infanteria:
                    nuevo = new DivisionInfanteria();
                    return nuevo;
                case SS:
                    nuevo = new DivisionSS();
                    return nuevo;
                case USMarines:
                    nuevo = new MarinesUS();
                    return nuevo;
                case SoldadosUS:
                    nuevo = new SoldadosUS();
                    return nuevo;
                case ComandantesR:
                    nuevo = new ComandantesRojo();
                    return nuevo;
                case SoldadosR:
                    nuevo = new SoldadosUS();
            }
            this.cuartel.add(nuevo);
        }
        throw new Exception("Academia llena");
    }
    
    @Override
    public int getHangerSize() {
        return this.cuartel.size();
    }

    public ArrayList<Division> getCuartel() {
        return cuartel;
    }

    @Override
    public Edificaciones getTipoEdificacion() {
        return tipoEdificacion;
    }

    public static int getCostHormigon() {
        return costHormigon;
    }

    public static int getCostMonedas() {
        return costMonedas;
    }
    
    @Override
    public Tanque crearTanque(Tanques tipo) throws Exception {
        return null;
    }

    @Override
    public Avion crearAvion(Aviones tipo) throws Exception {
        return null;
    }

    @Override
    public ArrayList<Avion> getHangar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Tanque> getHangarTanques() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
