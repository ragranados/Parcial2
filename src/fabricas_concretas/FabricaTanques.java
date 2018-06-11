/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas_concretas;

import enumeraciones.*;
import fabricas_abstractas.AbstractFactory;
import java.util.ArrayList;
import productos_concretos.Panzers.*;
import productos_abstractos.Tanque;
import productos_abstractos.Avion;
import productos_abstractos.Division;
import fabricas_abstractas.Fabrica;
import productos_abstractos.Unidad;

/**
 *
 * @author rau3
 */
public class FabricaTanques implements AbstractFactory,Fabrica,Unidad{
    
    private ArrayList<Tanque> hangar ;
    private Edificaciones tipoEdificacion;
    private int vida,faseCreacion, espera;
    private static int costHormigon=1400,costMonedas=4000;

    public FabricaTanques() {
        this.espera=1;
        this.vida=3000;
        this.hangar=new ArrayList();
        this.tipoEdificacion = Edificaciones.Tanques;
    }
    
    
    @Override
    public Tanque crearTanque(Tanques tipo) throws Exception {
        Tanque nuevo;
        if (hangar.size() < 10) {
            switch (tipo) {
                case Sherman:
                    nuevo = new Sherman();
                    this.hangar.add(nuevo);
                    System.out.println("\nSe ha creado un tanque de US");
                    return nuevo;
                case TigerI:
                    nuevo = new TigerI();
                    this.hangar.add(nuevo);
                    System.out.println("\nSe ha creado un tanque Aleman");
                    return nuevo;
                case T34:
                    nuevo = new T34();
                    this.hangar.add(nuevo);
                    System.out.println("\nSe ha creado un tanque sovietico");
                    return nuevo;
            }
        }
        else{
            throw new Exception("Fabrica llena");
        }
        return null;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    

    public ArrayList<Tanque> getHangarTanques() {
        return hangar;
    }

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
    public int getHangerSize() {
        return this.hangar.size();
    }
    
    @Override
    public int getFaseCreacion() {
        return faseCreacion;
    }

    @Override
    public int getEspera() {
        return espera;
    }
    
    @Override
    public void setFaseCreacion(int a){
        this.faseCreacion=a;
    }
    

    @Override
    public Avion crearAvion(Aviones tipo) {
        return null;
    }

    @Override
    public Division entrenarSoldados(Divisiones tipo) {
        return null;
    }

    @Override
    public ArrayList<Avion> getHangar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Unidad getObjetivo() {
        return null;
    }

    @Override
    public ArrayList<Division> getCuartel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setFaseDeEnvio(int a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getFaseDeEnvio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getVelocidad() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
