/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bandos;

import enumeraciones.Aviones;
import enumeraciones.Edificaciones;
import enumeraciones.Razas;
import enumeraciones.Tanques;
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
import productos_concretos.Flugzeuge.Stuka;
import productos_concretos.Flugzeuge.Tu95;
import productos_concretos.Panzers.T34;
import productos_concretos.Panzers.TigerI;
import fabricas_abstractas.Fabrica;

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
        AbstractFactory nuevaEdif;
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
                        if (FabricaAviones.getCostMonedas() <= this.moneda && FabricaAviones.getCostHormigon() <= this.hormigon) {
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
    
    public void mostrarRecursos(){
        System.out.println("\nMonedas: "+this.moneda+"|"+"Metal: "+this.metal+"|"+"Hormigon: "+this.hormigon);
    }
    
    public boolean getVehiculo(Edificaciones tip) throws Exception {
        Fabrica edif;

        for (AbstractFactory f : this.fabricas) {
            edif = (Fabrica) f;
            if (edif.getHangerSize() <= 10) {
                if (tip == edif.getTipoEdificacion()) {
                    if (tip == Edificaciones.Tanques) {
                        if (this.nombre == Razas.Alemania) {
                            if (TigerI.getCosMetal() <= this.metal && TigerI.getCosMoneda() <= this.moneda) {
                                f.crearTanque(Tanques.TigerI);
                                this.moneda -= TigerI.getCosMoneda();
                                this.metal -= TigerI.getCosMetal();
                                return true;
                            }
                        } else if (this.nombre == Razas.UnionSovietica) {
                            if (T34.getCosMetal() <= this.metal && T34.getCosMoneda() <= this.moneda) {
                                f.crearTanque(Tanques.T34);
                                this.moneda -= T34.getCosMoneda();
                                this.metal -= T34.getCosMetal();
                                return true;
                            }
                        }
                    }
                    if (tip == Edificaciones.Aviones) {
                        if (this.nombre == Razas.Alemania) {
                            if (Stuka.getCosMetal() <= this.metal && Stuka.getCosMoneda() <= this.moneda) {
                                f.crearAvion(Aviones.Stuka);
                                this.moneda -= Stuka.getCosMoneda();
                                this.metal -= Stuka.getCosMetal();
                                return true;
                            }
                        } else if (this.nombre == Razas.UnionSovietica) {
                            if (Tu95.getCosMetal() <= this.metal && Tu95.getCosMoneda() <= this.moneda) {
                                f.crearAvion(Aviones.Tu95);
                                this.moneda = Tu95.getCosMoneda();
                                this.metal = Tu95.getCosMetal();
                                return true;
                            }
                        }
                    }
                    
                }
            }
        }
        throw new Exception("No hay fabricas disponibles");
    }
    
    public boolean crearVehiculos() {
        boolean eleccion = true;
        int opc;
        Edificaciones tip = null;
        while (eleccion) {
        mostrarRecursos();
            try {
                System.out.println("\n1. Tanques\n2. Aviones\n3. Salir");
                Scanner scanner = new Scanner(System.in);
                opc = scanner.nextInt();
                switch (opc) {
                    case 1:
                        tip = Edificaciones.Tanques;
                        break;
                    case 2:
                        tip = Edificaciones.Aviones;
                        break;
                    case 3:
                        return true;
                }
                getVehiculo(tip);
                System.out.println("Se ha creado un vehiculo");
                
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        }
        return true;
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
