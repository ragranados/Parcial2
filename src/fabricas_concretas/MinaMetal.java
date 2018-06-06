/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas_concretas;

import enumeraciones.*;
import fabricas_abstractas.AbstractFactory;
import fabricas_abstractas.Recursos;
import java.util.ArrayList;
import productos_abstractos.Avion;
import productos_abstractos.Tanque;
import productos_abstractos.Division;
import fabricas_abstractas.Fabrica;

/**
 *
 * @author rau3
 */
public class MinaMetal implements AbstractFactory,Recursos{
    private int metalRecolectado,produccion;
    private static int costHormigon,costMonedas;
    private Edificaciones tipoEdificacion = Edificaciones.MinaMetal;

    public MinaMetal() {
        this.metalRecolectado=0;
        
    }
    
    @Override
    public void crearRecursos(int a) {
        metalRecolectado += produccion;
    }

    public static int getCostHormigon() {
        return costHormigon;
    }

    public static int getCostMonedas() {
        return costMonedas;
    }

    public Edificaciones getTipoEdificacion() {
        return tipoEdificacion;
    }

    @Override
    public void setProduccion(int produccion) {
        this.produccion = produccion;
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
    public Division entrenarSoldados(Divisiones tipo) {
        return null;
    }

    

    
    
}
