/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bandos;

import enumeraciones.Edificaciones;
import enumeraciones.Razas;
import fabricas_abstractas.*;
import fabricas_concretas.CreadorEdificaciones;
import fabricas_concretas.*;
import java.util.Scanner;

/*import InterfazBandos.Pais;
import enumeraciones.Edificaciones;
import fabricas_abstractas.AbstractFactory;
import fabricas_concretas.CreadorEdificaciones;
import java.util.ArrayList;*/

/**
 *
 * @author rau3
 */
public class Alemania extends CentroDeMando {

    public Alemania(String comandante) {
        super(comandante);
        this.nombre=Razas.Alemania;
        
    }

    /*@Override
    public AbstractFactory crearEdificacion() throws Exception {
        Scanner scanner = new Scanner(System.in);
        AbstractFactory nuevaEdif = null;
        boolean eleccion = true;
        int edificacion;
        while (eleccion) {
            try {
                System.out.println("Ingrese el tipo de edificacion que desea construir");
                System.out.println("1.Fabrica de tanques\n2. Fabrica de Aviones\n3. Cuartel\n"
                        + "4. Mina de Metal\n5. Casa de impuestos\n6. Procesadora de Hormigon");
                System.out.println("Tipo de edificacion: ");
                edificacion = scanner.nextInt();
                switch (edificacion) {
                    case 1:
                        if (FabricaTanques.getCostHormigon() <= this.hormigon && FabricaTanques.getCostMonedas() <= this.moneda) {
                            nuevaEdif = CreadorEdificaciones.getFactory(Edificaciones.Tanques);
                        }
                        break;
                    case 2:
                        if (FabricaAviones.getCosMonedas() <= this.maxMoneda && FabricaAviones.getCostHormigon() <= this.hormigon) {
                            nuevaEdif = CreadorEdificaciones.getFactory(Edificaciones.Aviones);
                            
                        }
                        break;
                    case 3:
                        
                        nuevaEdif = CreadorEdificaciones.getFactory(Edificaciones.Academia);
                        break;
                    case 4:
                        nuevaEdif = CreadorEdificaciones.getFactory(Edificaciones.MinaMetal);
                        break;
                    case 5:
                        if (CasaDeImpuestosA.getCostHormigon() <= this.hormigon && CasaDeImpuestosA.getCostMonedas() <= this.moneda) {
                            nuevaEdif = CreadorEdificaciones.getFactory(Edificaciones.Impuestos);
                            CasaDeImpuestosA imp = (CasaDeImpuestosA) nuevaEdif;
                            imp.setProduccion(500);
                        }
                        //nuevaEdif.setProduccion(500);
                        break;
                    case 6:
                        nuevaEdif = CreadorEdificaciones.getFactory(Edificaciones.procesadora);

                }
                if (nuevaEdif == null) {
                    throw new Exception("No hay suficientes recursos");
                } else {
                    this.fabricas.add(nuevaEdif);
                    return nuevaEdif;
                }
            } catch (Exception ex) {
                System.err.println("No hay suficientes recursos");
            }
        }
        return null;
    }
    
    
    /*int metal, moneda,hormigon,vida;
    int maxMetal,maxMoneda,maxHormigon;
    String comandante;
    ArrayList<AbstractFactory> edificaciones = new ArrayList();

    public Alemania(String comandante) {
        this.moneda=1000;
        this.hormigon=500;
        this.metal=300;
        this.maxMetal = 3000;
        this.maxMoneda = 10000;
        this.maxHormigon =5000;
        this.vida=1000;
        this.comandante=comandante;
    }
    
    
    
    @Override
    public AbstractFactory crearEdificacion(Edificaciones tipo) throws Exception {
        AbstractFactory nuevo = CreadorEdificaciones.getFactory(tipo);
        this.edificaciones.add(nuevo);
        return nuevo;

    }

    public int getMetal() {
        return metal;
    }

    public void setMetal(int metal) {
        this.metal = metal;
    }

    public int getMarcoImperial() {
        return moneda;
    }

    public void setMarcoImperial(int marcoImperial) {
        this.moneda = marcoImperial;
    }

    public int getHormigon() {
        return hormigon;
    }

    public void setHormigon(int hormigon) {
        this.hormigon = hormigon;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getMaxMetal() {
        return maxMetal;
    }

    public void setMaxMetal(int maxMetal) {
        this.maxMetal = maxMetal;
    }

    public int getMaxMarcoImperial() {
        return maxMoneda;
    }

    public void setMaxMarcoImperial(int maxMarcoImperial) {
        this.maxMoneda = maxMarcoImperial;
    }

    public int getMaxHormigon() {
        return maxHormigon;
    }

    public void setMaxHormigon(int maxHormigon) {
        this.maxHormigon = maxHormigon;
    }

    public String getComandante() {
        return comandante;
    }

    public void setComandante(String comandante) {
        this.comandante = comandante;
    }

    public ArrayList<AbstractFactory> getEdificaciones() {
        return edificaciones;
    }

    public void setEdificaciones(ArrayList<AbstractFactory> edificaciones) {
        this.edificaciones = edificaciones;
    }*/
    
    
    
    
}
