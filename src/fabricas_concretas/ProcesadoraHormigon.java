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
import fabricas_abstractas.Recursos;
import java.util.ArrayList;
import productos_abstractos.Avion;
import productos_abstractos.Division;
import productos_abstractos.Tanque;
import fabricas_abstractas.Fabrica;
import productos_abstractos.Unidad;

/**
 *
 * @author rau3
 */
public class ProcesadoraHormigon implements AbstractFactory,Recursos,Unidad{
    private int hormigonFabricado,produccion,vida;
    private static int costHormigon,costMonedas;
    private static Edificaciones tipoEdificacion = Edificaciones.MinaMetal;
    
    @Override
    public void crearRecursos(int a) {
        this.hormigonFabricado+=produccion;
        
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
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

    @Override
    public Edificaciones getTipoEdificacion() {
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

    @Override
    public int getFaseCreacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getEspera() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Unidad getObjetivo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
