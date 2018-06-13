/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bandos;

import RaulWorld.Menu;
import enumeraciones.Aviones;
import enumeraciones.Divisiones;
import enumeraciones.Edificaciones;
import enumeraciones.Razas;
import enumeraciones.Tanques;
import fabricas_abstractas.AbstractFactory;
import fabricas_concretas.*;
import fabricas_concretas.ProcesadoraHormigon;
import java.util.ArrayList;
import java.util.Scanner;
import productos_concretos.Flugzeuge.Stuka;
import productos_concretos.Flugzeuge.Tu95;
import productos_concretos.Panzers.T34;
import productos_concretos.Panzers.TigerI;
import fabricas_abstractas.Fabrica;
import fabricas_abstractas.Recursos;
import productos_abstractos.Avion;
import productos_abstractos.Division;
import productos_abstractos.Tanque;
import productos_abstractos.Unidad;
import productos_concretos.Flugzeuge.AvionUS;
import productos_concretos.Panzers.Sherman;
import productos_concretos.Soldados.ComandantesRojo;
import productos_concretos.Soldados.DivisionInfanteria;
import productos_concretos.Soldados.DivisionSS;
import productos_concretos.Soldados.MarinesUS;
import productos_concretos.Soldados.SoldadoRojo;
import productos_concretos.Soldados.SoldadosUS;

/**
 *
 * @author <00138816@uca.edu.sv>
 */
public class CentroDeMando implements Unidad{

    int metal, moneda, hormigon, vida,nivel;
    int maxMetal, maxMoneda, maxHormigon;
    ArrayList<AbstractFactory> fabricas = new ArrayList();
    String comandante;
    Razas nombre;
    

    public CentroDeMando(String comandante) {
        this.moneda = 10000;
        this.hormigon = 5000;
        this.metal = 3000;
        this.maxMetal = 6000;
        this.maxMoneda = 15000;
        this.maxHormigon = 10000;
        this.vida = 7000;
        this.comandante = comandante;
        this.nivel = 0;
    }

    public AbstractFactory crearEdificacion() throws Exception {
        Exception e = new Exception("No hay suficientes recursos");
        Scanner scanner = new Scanner(System.in);
        AbstractFactory nuevaEdif;
        boolean eleccion = true;
        int edificacion;
        while (eleccion) {
            nuevaEdif = null;
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
                            nuevaEdif.setFaseCreacion(Menu.getFase());
                            this.hormigon -= FabricaTanques.getCostHormigon();
                            this.moneda -= FabricaTanques.getCostMonedas();
                        } else {
                            throw e;
                        }

                        break;
                    case 2:
                        if (FabricaAviones.getCostMonedas() <= this.moneda && FabricaAviones.getCostHormigon() <= this.hormigon) {
                            nuevaEdif = CreadorEdificaciones.getFactory(Edificaciones.Aviones);
                            nuevaEdif.setFaseCreacion(Menu.getFase());
                            this.hormigon -= FabricaAviones.getCostHormigon();
                            this.moneda -= FabricaAviones.getCostMonedas();

                        } else {
                            throw e;
                        }
                        break;
                    case 3:
                        if (Academia.getCostHormigon() <= this.hormigon && Academia.getCostMonedas() <= this.moneda) {
                            nuevaEdif = CreadorEdificaciones.getFactory(Edificaciones.Academia);
                            nuevaEdif.setFaseCreacion(Menu.getFase());
                            this.hormigon -= Academia.getCostHormigon();
                            this.moneda -= Academia.getCostMonedas();
                        } else {
                            throw e;
                        }
                        break;
                    case 4:
                        if (MinaMetal.getCostHormigon() <= this.hormigon && MinaMetal.getCostMonedas() <= this.moneda) {
                            nuevaEdif = CreadorEdificaciones.getFactory(Edificaciones.MinaMetal);
                            nuevaEdif.setFaseCreacion(Menu.getFase());
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
                        } else {
                            throw e;
                        }
                        break;
                    case 5:
                        if (CasaDeImpuestosA.getCostHormigon() <= this.hormigon && CasaDeImpuestosA.getCostMonedas() <= this.moneda) {
                            nuevaEdif = CreadorEdificaciones.getFactory(Edificaciones.Impuestos);
                            nuevaEdif.setFaseCreacion(Menu.getFase());
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
                        } else {
                            throw e;
                        }
                        //nuevaEdif.setProduccion(500);
                        break;
                    case 6:
                        if (ProcesadoraHormigon.getCostHormigon() <= this.hormigon && ProcesadoraHormigon.getCostMonedas() <= this.moneda) {
                            nuevaEdif = CreadorEdificaciones.getFactory(Edificaciones.Procesadora);
                            nuevaEdif.setFaseCreacion(Menu.getFase());
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

                            this.hormigon -= ProcesadoraHormigon.getCostHormigon();
                            this.moneda -= ProcesadoraHormigon.getCostMonedas();

                        } else {
                            throw e;
                        }
                        break;
                    case 7:
                        eleccion = false;

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

    public void mostrarRecursos() {
        System.out.println("\nMonedas: " + this.moneda + " | " + "Metal: " + this.metal + " | " + "Hormigon: " + this.hormigon);
    }
    
    public boolean crearUnidad(){
        Scanner scanner = new Scanner(System.in);
        int opc;
        boolean eleccion = true;
        while (eleccion) {
            try {
                System.out.println("\n1. Crear Vehiculo\n2. Entrenar Milicia\n3. Salir");
                System.out.print("Ingrese una opcion: ");
                opc = scanner.nextInt();
                switch(opc){
                    case 1:
                        crearVehiculos();
                        break;
                    case 2:
                        entrenarMilicias();
                        break;
                    case 3:
                        return true;
                    
                }

            } catch (Exception ex) {
                System.err.println(ex.getMessage());
                
            }
        }
        return true;
    }
    
    public boolean entrenarMilicias() {
        boolean eleccion = true;
        int opc;
        Divisiones div = null;
        while (eleccion) {
            mostrarRecursos();
            try {
                System.out.println("Ingrese tipo de soldados que desea crear: \n1. Division normal\n2. Division Elite\n3. Salir\n");
                Scanner scanner = new Scanner(System.in);
                opc = scanner.nextInt();
                switch (opc) {
                    case 1:
                        div = Divisiones.Normal;
                        break;
                    case 2:
                        div = Divisiones.Elite;
                        break;
                    case 3:
                        return true;
                    default:
                        throw new Exception("Ingrese una opcion correcta");
                        
                }
                getMilicia(div);
                

            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }

        }

        return true;
    }

    public void getMilicia(Divisiones div) throws Exception {
        Fabrica edif;
        Exception e = new Exception("No hay suficientes recursos");
        for (AbstractFactory f : this.fabricas) {
            edif = (Fabrica) f;
            if (edif.getTipoEdificacion() == Edificaciones.Academia) {
                if (edif.getHangerSize() < 10) {
                    if (this.nombre == Razas.Alemania) {
                        if (div == Divisiones.Elite) {
                            if (DivisionSS.getCosMoneda() <= this.moneda) {
                                Unidad unidad = (Unidad) f.entrenarSoldados(Divisiones.SS);
                                unidad.setFaseCreacion(Menu.getFase());
                                this.moneda -= DivisionSS.getCosMoneda();
                            } else {
                                throw e;
                            }

                        } else if (div == Divisiones.Normal) {
                            if (DivisionInfanteria.getCosMoneda() <= this.moneda) {
                                Unidad unidad = (Unidad) f.entrenarSoldados(Divisiones.Infanteria);
                                unidad.setFaseCreacion(Menu.getFase());
                                this.moneda -= DivisionInfanteria.getCosMoneda();

                            } else {
                                throw e;
                            }

                        }

                    } else if (this.nombre == Razas.EstadosUnidos) {
                        if (div == Divisiones.Elite) {
                            if (MarinesUS.getCosMoneda() <= this.moneda) {
                                Unidad unidad = (Unidad) f.entrenarSoldados(Divisiones.USMarines);
                                unidad.setFaseCreacion(Menu.getFase());
                                this.moneda -= MarinesUS.getCosMoneda();
                            } else {
                                throw e;
                            }

                        } else if (div == Divisiones.Normal) {
                            if (SoldadosUS.getCosMoneda() <= this.moneda) {
                                Unidad unidad = (Unidad) f.entrenarSoldados(Divisiones.SoldadosUS);
                                unidad.setFaseCreacion(Menu.getFase());
                                this.moneda -= SoldadosUS.getCosMoneda();
                            } else {
                                throw e;
                            }

                        }

                    } else if (this.nombre == Razas.UnionSovietica) {
                        if (div == Divisiones.Elite) {
                            if (ComandantesRojo.getCosMoneda() <= this.moneda) {
                                Unidad unidad = (Unidad) f.entrenarSoldados(Divisiones.ComandantesR);
                                unidad.setFaseCreacion(Menu.getFase());
                                this.moneda -= ComandantesRojo.getCosMoneda();
                            } else {
                                throw e;
                            }

                        } else if (div == Divisiones.Normal) {
                            if (SoldadoRojo.getCosMoneda() <= this.moneda) {
                                Unidad unidad = (Unidad) f.entrenarSoldados(Divisiones.SoldadosR);
                                unidad.setFaseCreacion(Menu.getFase());
                                this.moneda -= SoldadoRojo.getCosMoneda();
                            } else {
                                throw e;
                            }
                        }
                    }
                } else {
                    System.err.println("Academias llenas");
                }
            }
        }
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

            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        }
        return true;
    }

    public boolean getVehiculo(Edificaciones tip) throws Exception {
        Fabrica edif;
        Exception e = new Exception("No hay recursos suficientes");

        for (AbstractFactory f : this.fabricas) {
            Unidad unidad = (Unidad) f;
            if (unidad.getTipoEdificacion() == Edificaciones.Academia || unidad.getTipoEdificacion() == Edificaciones.Aviones || unidad.getTipoEdificacion() == Edificaciones.Tanques) {
                edif = (Fabrica) f;
                if (edif.getHangerSize() < 10) {
                    if (verificarDisponibilidad(unidad)) {
                        if (tip == edif.getTipoEdificacion()) {
                            if (tip == Edificaciones.Tanques) {
                                if (this.nombre == Razas.Alemania) {
                                    if (TigerI.getCosMetal() <= this.metal && TigerI.getCosMoneda() <= this.moneda) {
                                        unidad = (Unidad) f.crearTanque(Tanques.TigerI);
                                        unidad.setFaseCreacion(Menu.getFase());
                                        this.moneda -= TigerI.getCosMoneda();
                                        this.metal -= TigerI.getCosMetal();
                                        return true;
                                    } else {
                                        throw e;
                                    }
                                } else if (this.nombre == Razas.UnionSovietica) {
                                    if (T34.getCosMetal() <= this.metal && T34.getCosMoneda() <= this.moneda) {
                                        unidad = (Unidad) f.crearTanque(Tanques.T34);
                                        unidad.setFaseCreacion(Menu.getFase());
                                        this.moneda -= T34.getCosMoneda();
                                        this.metal -= T34.getCosMetal();
                                        return true;
                                    } else {
                                        throw e;
                                    }
                                } else if (this.nombre == Razas.EstadosUnidos) {
                                    if (Sherman.getCosMetal() <= this.metal && Sherman.getCosMoneda() <= this.moneda) {
                                        unidad = (Unidad) f.crearTanque(Tanques.Sherman);
                                        unidad.setFaseCreacion(Menu.getFase());
                                        this.moneda -= Sherman.getCosMoneda();
                                        this.metal -= Sherman.getCosMetal();
                                        return true;
                                    } else {
                                        throw e;
                                    }
                                }
                            }
                            if (tip == Edificaciones.Aviones) {
                                if (this.nombre == Razas.Alemania) {
                                    if (Stuka.getCosMetal() <= this.metal && Stuka.getCosMoneda() <= this.moneda) {
                                        unidad = (Unidad) f.crearAvion(Aviones.Stuka);
                                        unidad.setFaseCreacion(Menu.getFase());
                                        this.moneda -= Stuka.getCosMoneda();
                                        this.metal -= Stuka.getCosMetal();
                                        return true;
                                    } else {
                                        throw e;
                                    }
                                } else if (this.nombre == Razas.UnionSovietica) {
                                    if (Tu95.getCosMetal() <= this.metal && Tu95.getCosMoneda() <= this.moneda) {
                                        unidad = (Unidad) f.crearAvion(Aviones.Tu95);
                                        unidad.setFaseCreacion(Menu.getFase());
                                        this.moneda -= Tu95.getCosMoneda();
                                        this.metal -= Tu95.getCosMetal();
                                        return true;
                                    } else {
                                        throw e;
                                    }
                                } else if (this.nombre == Razas.EstadosUnidos) {
                                    if (AvionUS.getCosMetal() <= this.metal && AvionUS.getCosMoneda() <= this.moneda) {
                                        unidad = (Unidad) f.crearAvion(Aviones.AvionUS);
                                        unidad.setFaseCreacion(Menu.getFase());
                                        this.metal -= AvionUS.getCosMetal();
                                        this.moneda -= AvionUS.getCosMoneda();
                                        return true;
                                    } else {
                                        throw e;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new Exception("No hay fabricas disponibles");
    }

    public boolean verificarDisponibilidad(Unidad unidad) {
        int verificar;
        verificar = unidad.getEspera() + unidad.getFaseCreacion();
        return (Menu.getFase() > verificar && unidad.getObjetivo() == null);
    }

    public boolean iniciarAtaque(CentroDeMando centro2) throws Exception {
        Unidad uni;
        Edificaciones tip = null;
        Scanner scanner = new Scanner(System.in);
        boolean eleccion = true;
        int opc;
        while (eleccion) {
            try {
                System.out.println("\nIngrese con que desea atacar: ");
                System.out.println("\n1. Tanque\n2. Avion\n3. Milicia\n4. Salir");
                System.out.print("Opcion: ");
                opc = scanner.nextInt();

                switch (opc) {
                    case 1:
                        tip = Edificaciones.Tanques;
                        break;
                    case 2:
                        tip = Edificaciones.Aviones;
                        break;
                    case 3:
                        tip = Edificaciones.Academia;
                        break;
                    case 4:
                        return true;
                    default:
                        break;
                }

                for (AbstractFactory f : this.fabricas) {
                    Unidad edificacion = (Unidad) f;
                    Fabrica edif ;
                    if (edificacion.getTipoEdificacion() == tip) {
                        if (null != tip) {
                            switch (tip) {
                                case Academia:
                                    edif = (Fabrica) f;
                                    for (Division d : edif.getCuartel()) {
                                        if (verificarDisponibilidad((Unidad) d)) {
                                            uni = (Unidad) d;
                                            uni.setFaseDeEnvio(Menu.getFase());

                                            d.setObjetivo(elegirObjetivo(centro2));
                                            if (d.getObjetivo() == null) {
                                                System.out.println("No se ha puesto ningun objetivo");
                                            }
                                            return true;
                                        }
                                    }
                                    throw new Exception("No hay vehiculos disponibles");
                                case Tanques:
                                    edif = (Fabrica) f;
                                    for (Tanque d : edif.getHangarTanques()) {
                                        if (verificarDisponibilidad((Unidad) d)) {
                                            uni = (Unidad) d;
                                            uni.setFaseDeEnvio(Menu.getFase());

                                            d.setObjetivo(elegirObjetivo(centro2));
                                            /*Unidad unidad = (Unidad) d;
                                        System.out.println("Fase de creacion del vehiculo: "+unidad.getFaseCreacion());*/
                                            if (d.getObjetivo() == null) {
                                                System.out.println("No se ha puesto ningun objetivo");
                                            }
                                            return true;
                                        }
                                    }
                                    throw new Exception("No hay vehiculos disponibles");
                                case Aviones:
                                    edif = (Fabrica) f;
                                    for (Avion d : edif.getHangar()) {
                                        if (verificarDisponibilidad((Unidad) d)) {
                                            uni = (Unidad) d;
                                            uni.setFaseDeEnvio(Menu.getFase());

                                            d.setObjetivo(elegirObjetivo(centro2));

                                            if (d.getObjetivo() == null) {
                                                System.out.println("No se ha puesto ningun objetivo");
                                            }
                                            return true;
                                        }
                                    }
                                    throw new Exception("No hay vehiculos disponibles");
                                default:
                                    break;
                            }
                        }
                    }
                }
                System.err.println("No hay fabricas disponibles ");
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        }
        return true;
    }

    public Unidad elegirObjetivo(CentroDeMando centro) throws Exception {
        Unidad uni = null;
        int opc, cont = 0;
        Scanner scanner = new Scanner(System.in);
        if (!centro.fabricas.isEmpty()) {
            System.out.println("\nEdificaciones enemigas disponibles para atacar: ");
            for (AbstractFactory f : centro.fabricas) {
                cont++;

                System.out.println(cont + "." + f.getTipoEdificacion().toString());

            }
            opc = scanner.nextInt();
            return (Unidad) centro.fabricas.get(opc - 1);
        } else {
            System.out.println("\nPuede atacar el centro de mando, desea hacerlo?\n1. Si\n2. No");
            opc = scanner.nextInt();
            if (opc == 1) {
                return (Unidad) centro;
            } else if (opc == 2) {
                return null;
            }

        }
        return null;
    }

    @Override
    public void atacar() {
        Fabrica fab;
        Edificaciones tip;
        for (AbstractFactory f : this.fabricas) {
            tip = f.getTipoEdificacion();
            if (tip == Edificaciones.Academia) {
                fab = (Fabrica) f;
                for (Division d : fab.getCuartel()) {
                    if (d.getObjetivo() != null) {
                        if (puedeAtacar((Unidad) d)) {
                            d.atacar();
                        }
                    }
                }
            } else if (tip == Edificaciones.Tanques) {
                fab = (Fabrica) f;
                for (Tanque t : fab.getHangarTanques()) {
                    if (t.getObjetivo() != null) {
                        if (puedeAtacar((Unidad) t)) {
                            t.atacar();
                        }
                    }
                }
            } else if (tip == Edificaciones.Aviones) {
                fab = (Fabrica) f;
                for (Avion a : fab.getHangar()) {
                    if (a.getObjetivo() != null) {
                        if (puedeAtacar((Unidad) a)) {
                            a.atacar();
                        }
                    }
                }
            }
        }
    }
    
    public void producirRecursos() {
        Recursos rec;
        Edificaciones tip;
        for (AbstractFactory f : this.fabricas) {
            tip = f.getTipoEdificacion();
            if (tip == Edificaciones.Procesadora || tip == Edificaciones.Impuestos || tip == Edificaciones.MinaMetal) {
                if (verificarDisponibilidad((Unidad) f)) {
                    rec = (Recursos) f;
                    rec.crearRecursos(this);
                }
            }
        }
    }
    
    public boolean puedeAtacar(Unidad unidad){
        int suma;
        suma = unidad.getFaseDeEnvio()+unidad.getVelocidad();
        return Menu.getFase()> suma;
    }
    
    public void recolectarRecursos(){
        int nuevoRecurso;
        Recursos rec;
        Edificaciones tip;
        for (AbstractFactory f : this.fabricas) {
            tip = f.getTipoEdificacion();
            if (tip == Edificaciones.MinaMetal) {
                rec = (Recursos) f;
                nuevoRecurso = this.metal+rec.getRecursoRecolectado();
                this.setMetal(nuevoRecurso);
                rec.setRecursoRecolectado(0);
            }
            else if(tip == Edificaciones.Procesadora){
                rec = (Recursos) f;
                nuevoRecurso = this.hormigon+rec.getRecursoRecolectado();
                this.setMetal(nuevoRecurso);
                rec.setRecursoRecolectado(0);
            }

        }
        mostrarRecursos();
    }
    
    public int calcularCostoMejora() {
        double cost;
        switch (this.nivel) {
            case 0:
                cost = (0.25) * ((this.maxHormigon * 1.10) + (this.maxMetal * 1.10) + (this.maxMoneda * 1.10));
                return (int) cost/3;
            case 1:
                cost = (0.25) * ((this.maxHormigon * 1.30) + (this.maxMetal * 1.30) + (this.maxMoneda * 1.30));
                return (int) cost/3;
            case 2:
                cost = (0.25) * ((this.maxHormigon * 1.50) + (this.maxMetal * 1.50) + (this.maxMoneda * 1.50));
                return (int) cost/3;
            default:
                return 0;
        }
    }
    
    public void realizarMejoraCentro(){
        switch (this.nivel) {
            case 0:
                this.maxHormigon = (int) (this.maxHormigon * 1.10);
                this.maxMetal = (int) (this.maxMetal * 1.10);
                this.maxMoneda = (int) (this.maxMoneda * 1.10);
                break;
            case 1:
                this.maxHormigon = (int) (this.maxHormigon * 1.30);
                this.maxMetal = (int) (this.maxMetal * 1.30);
                this.maxMoneda = (int) (this.maxMoneda * 1.30);
                break;
            case 2:
                this.maxHormigon = (int) (this.maxHormigon * 1.50);
                this.maxMetal = (int) (this.maxMetal * 1.50);
                this.maxMoneda = (int) (this.maxMoneda * 1.50);
                break;
            default:
                break;
        }
        
    }
    
    public void mejorarCentro() {
        int cost = calcularCostoMejora();
        if (cost == 0) {
            System.out.println("\nSe ha alcanzado el nivel maximo de mejora");
        } else {
            if (this.moneda >= cost && this.metal >= cost && this.hormigon >= cost) {
                realizarMejoraCentro();
                System.out.println("Se ha realizar la mejora del centro de mando");
            }
            else{
                System.out.println("No hay suficientes recursos para realizar la mejora");
            }
        }
    }

    public int getMetal() {
        return metal;
    }

    public void setMetal(int metal) {
        if (metal>this.maxMetal) {
            this.metal = this.maxMetal;
        }
        else{
            this.metal = metal;
        }
        
    }

    public int getHormigon() {
        return hormigon;
    }

    public void setHormigon(int hormigon) {
        if (hormigon>this.maxHormigon) {
            this.hormigon = this.maxHormigon;
        }
        else{
            this.hormigon = hormigon;
        }
        
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

    public int getMoneda() {
        return moneda;
    }

    public void setMoneda(int moneda) {
        if (moneda>this.maxMoneda) {
            this.moneda = this.maxMoneda;
        }
        else{
            this.moneda = moneda;
        }
    }

    public int getMaxMoneda() {
        return maxMoneda;
    }

    public void setMaxMoneda(int maxMoneda) {
        this.maxMoneda = maxMoneda;
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

    @Override
    public void setFaseCreacion(int a) {
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

    @Override
    public Edificaciones getTipoEdificacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
