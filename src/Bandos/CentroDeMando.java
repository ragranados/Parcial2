/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bandos;

import enumeraciones.Edificaciones;
import enumeraciones.Razas;
import fabricas_abstractas.AbstractFactory;
import fabricas_concretas.Academia;
import fabricas_concretas.CasaDeImpuestosA;
import fabricas_concretas.CreadorEdificaciones;
import fabricas_concretas.FabricaAviones;
import fabricas_concretas.FabricaTanques;
import fabricas_concretas.MinaMetal;
import fabricas_concretas.ProcesadoraHormigon;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rau3
 */
public class CentroDeMando {
    int metal, moneda,hormigon,vida;
    int maxMetal,maxMoneda,maxHormigon;
    ArrayList<AbstractFactory> fabricas = new ArrayList();
    String comandante;
    Razas nombre;

    public CentroDeMando(String comandante) {
        this.moneda=10000;
        this.hormigon=5000;
        this.metal=3000;
        this.maxMetal = 6000;
        this.maxMoneda = 20000;
        this.maxHormigon =10000;
        this.vida=7000;
        this.comandante=comandante;
    }
    
    
    public AbstractFactory crearEdificacion() throws Exception {
        Scanner scanner = new Scanner(System.in);
        AbstractFactory nuevaEdif = null;
        boolean eleccion = true;
        int edificacion;
        while (eleccion) {
            nuevaEdif=null;
            try {
                System.out.println("\nIngrese el tipo de edificacion que desea construir: ");
                System.out.println("\n1.Fabrica de tanques\n2. Fabrica de Aviones\n3. Cuartel\n"
                        + "4. Mina de Metal\n5. Casa de impuestos\n6. Procesadora de Hormigon\n7. Salir");
                System.out.println("Tipo de edificacion: ");
                edificacion = scanner.nextInt();
                switch (edificacion) {
                    case 1:
                        if (FabricaTanques.getCostHormigon() <= this.hormigon && FabricaTanques.getCostMonedas() <= this.moneda) {
                            nuevaEdif = CreadorEdificaciones.getFactory(Edificaciones.Tanques);
                            this.hormigon-=FabricaTanques.getCostHormigon();
                            this.moneda-=FabricaTanques.getCostMonedas();
                            System.out.println("Se ha creado una fabrica de tanques");
                        }
                        
                        break;
                    case 2:
                        if (FabricaAviones.getCostMonedas() <= this.maxMoneda && FabricaAviones.getCostHormigon() <= this.hormigon) {
                            nuevaEdif = CreadorEdificaciones.getFactory(Edificaciones.Aviones);
                            this.hormigon-=FabricaAviones.getCostHormigon();
                            this.moneda-=FabricaAviones.getCostMonedas();
                            
                        }
                        break;
                    case 3:
                        if (Academia.getCostHormigon() <= this.hormigon && Academia.getCostMonedas() <= this.moneda) {
                            nuevaEdif = CreadorEdificaciones.getFactory(Edificaciones.Academia);
                            this.hormigon -= Academia.getCostHormigon();
                            this.moneda -= Academia.getCostMonedas();
                        }
                        break;
                    case 4:
                        if (MinaMetal.getCostHormigon() <= this.hormigon && MinaMetal.getCostMonedas() <= this.moneda) {
                            nuevaEdif = CreadorEdificaciones.getFactory(Edificaciones.MinaMetal);
                            MinaMetal imp = (MinaMetal) nuevaEdif;
                            switch (this.nombre) {
                                case Alemania:
                                    imp.setProduccion(500);
                                    break;
                                case EstadosUnidos:
                                    imp.setProduccion(550);
                                    break;
                                case UnionSovietica:
                                    imp.setProduccion(400);
                                    break;
                                default:
                                    break;
                            }
                            this.hormigon -= MinaMetal.getCostHormigon();
                            this.moneda -= MinaMetal.getCostMonedas();
                        }
                        break;
                    case 5:
                        if (CasaDeImpuestosA.getCostHormigon() <= this.hormigon && CasaDeImpuestosA.getCostMonedas() <= this.moneda) {
                            nuevaEdif = CreadorEdificaciones.getFactory(Edificaciones.Impuestos);
                            CasaDeImpuestosA imp = (CasaDeImpuestosA) nuevaEdif;
                            switch (this.nombre) {
                                case Alemania:
                                    imp.setProduccion(600);
                                    break;
                                case EstadosUnidos:
                                    imp.setProduccion(550);
                                    break;
                                case UnionSovietica:
                                    imp.setProduccion(400);
                                    break;
                                default:
                                    break;
                            }

                            this.hormigon -= CasaDeImpuestosA.getCostHormigon();
                            this.moneda -= CasaDeImpuestosA.getCostMonedas();
                        }
                        //nuevaEdif.setProduccion(500);
                        break;
                    case 6:
                        if (ProcesadoraHormigon.getCostHormigon() <= this.hormigon && ProcesadoraHormigon.getCostMonedas() <= this.moneda) {
                            nuevaEdif = CreadorEdificaciones.getFactory(Edificaciones.procesadora);
                            ProcesadoraHormigon imp = (ProcesadoraHormigon) nuevaEdif;
                            switch (this.nombre) {
                                case Alemania:
                                    imp.setProduccion(300);
                                    break;
                                case EstadosUnidos:
                                    imp.setProduccion(300);
                                    break;
                                case UnionSovietica:
                                    imp.setProduccion(300);
                                    break;
                                default:
                                    break;
                            }

                            this.hormigon -= CasaDeImpuestosA.getCostHormigon();
                            this.moneda -= CasaDeImpuestosA.getCostMonedas();
                            
                        }
                        break;
                    case 7:
                        eleccion=false;

                }
                if (nuevaEdif == null) {
                    throw new Exception("No hay suficientes recursos");
                } else {
                    this.fabricas.add(nuevaEdif);
                    System.out.println("Se ha guardado en el hangar");
                }
            } catch (Exception ex) {
                System.err.println("No hay suficientes recursos");
            }
        }
        return null;
    }

    public int getMetal() {
        return metal;
    }

    public void setMetal(int metal) {
        this.metal = metal;
    }

    public int getDolares() {
        return moneda;
    }

    public void setDolares(int dolares) {
        this.moneda = dolares;
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

    public int getMaxDolares() {
        return maxMoneda;
    }

    public void setMaxDolares(int maxDolares) {
        this.maxMoneda = maxDolares;
    }

    public int getMaxHormigon() {
        return maxHormigon;
    }

    public void setMaxHormigon(int maxHormigon) {
        this.maxHormigon = maxHormigon;
    }

    public ArrayList<AbstractFactory> getEdificaciones() {
        return fabricas;
    }

    public void setEdificaciones(ArrayList<AbstractFactory> edificaciones) {
        this.fabricas = edificaciones;
    }

    public String getComandante() {
        return comandante;
    }

    public void setComandante(String comandante) {
        this.comandante = comandante;
    }
    
}
