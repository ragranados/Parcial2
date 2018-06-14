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
import java.util.Objects;


/**
 *
 * @author rau3
 */
public class Academia implements AbstractFactory,Fabrica,Unidad {

    private ArrayList<Division> cuartel;
    private Edificaciones tipoEdificacion = Edificaciones.Academia;
    private int vida,faseCreacion,espera;
    private static int costHormigon = 1400, costMonedas = 4000;

    public Academia() {
        this.espera = 1;
        this.vida=2000;
        this.cuartel = new ArrayList();
    }
    
    @Override
    public Division entrenarSoldados(Divisiones tipo) throws Exception {
        Division nuevo = null;
        if (this.cuartel.size() < 10) {
            switch (tipo) {
                case Infanteria:
                    nuevo = new DivisionInfanteria();
                    System.out.println("Se ha creado una division de infanteria alemana");
                case SS:
                    nuevo = new DivisionSS();
                    System.out.println("Se ha creado una division SS");
                case USMarines:
                    nuevo = new MarinesUS();
                    System.out.println("Se ha creado una division de Marines");
                case SoldadosUS:
                    nuevo = new SoldadosUS();
                    System.out.println("Se ha creado una division de soldados");
                case ComandantesR:
                    nuevo = new ComandantesRojo();
                    System.out.println("Se ha creacion una division de comandantes");
                case SoldadosR:
                    nuevo = new SoldadosUS();
                    System.out.println("Se ha creado una division de soldados rojos");
            }
            this.cuartel.add(nuevo);
            System.out.println("Se ha entrenado nueva milicia ");
            return nuevo;
        }else{
            
        throw new Exception("Academia llena");
        }
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
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
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.tipoEdificacion);
        hash = 89 * hash + this.faseCreacion;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Academia other = (Academia) obj;
        if (this.faseCreacion != other.faseCreacion) {
            return false;
        }
        if (this.tipoEdificacion != other.tipoEdificacion) {
            return false;
        }
        return true;
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

    
    
    @Override
    public Unidad getObjetivo() {
        return null;
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
