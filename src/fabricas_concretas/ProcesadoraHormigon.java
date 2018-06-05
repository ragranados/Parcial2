/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas_concretas;

import enumeraciones.Aviones;
import enumeraciones.Divisiones;
import enumeraciones.Edificaciones;
import enumeraciones.Tanques;
import fabricas_abstractas.AbstractFactory;
import productos_abstractos.Avion;
import productos_abstractos.Division;
import productos_abstractos.Tanque;

/**
 *
 * @author rau3
 */
public class ProcesadoraHormigon implements AbstractFactory{
    private int hormigonFabricado,produccion;
    private static int costHormigon,costMonedas;
    private static Edificaciones tipoEdificacion = Edificaciones.MinaMetal;
    
    @Override
    public void crearRecursos(int a) {
        this.hormigonFabricado+=produccion;
        
    }

    public int getHormigonFabricado() {
        return hormigonFabricado;
    }

    public int getProduccion() {
        return produccion;
    }
    
    @Override
    public void setProduccion(int p) {
        
    }

    public static int getCostHormigon() {
        return costHormigon;
    }

    public static int getCostMonedas() {
        return costMonedas;
    }

    public static Edificaciones getTipoEdificacion() {
        return tipoEdificacion;
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
    public Division entrenarSoldados(Divisiones tipo) throws Exception {
        return null;
    }
}
