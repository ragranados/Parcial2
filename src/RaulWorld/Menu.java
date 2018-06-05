/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RaulWorld;

import Bandos.*;
import InterfazBandos.Pais;
import enumeraciones.Edificaciones;
import fabricas_abstractas.AbstractFactory;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rau3
 */
public class Menu {

    private static Menu menu = null;
    private ArrayList<CentroDeMando> bandos;
    int fase = 0, atac = 0, defen = 1;
    private final Scanner scanner = new Scanner(System.in);

    private Menu() {
        this.bandos = new ArrayList();

    }

    public static Menu getInstance() {
        if (menu == null) {
            return new Menu();
        }
        return null;
    }

    public void Opciones() {
        int opc;

        System.out.println("\n1. Crear Edificacion\n2. Fabricar Vehiculo\n3. Fabricar Avion");
        opc = scanner.nextInt();
        if (opc == 1) {

        }

    }

    public static Menu getMenu() {
        return menu;
    }

    public ArrayList<CentroDeMando> getBandos() {
        return bandos;
    }

    public void moverFase() {
        this.fase += 1;
        System.out.println("\nSe ha pasado a la fase: " + this.fase);

    }

    public CentroDeMando cambiarTurno() {
        if (this.defen == 1) {
            this.atac = 1;
            this.defen = 0;
        } else {
            this.atac = 0;
            this.defen = 1;
        }
        return this.bandos.get(defen);

    }

    public ArrayList<CentroDeMando> elegirBandos() {
        //Scanner scanner = new Scanner(System.in);
        int n = 0;
        while (n < 2) {
            System.out.println("\nJugador " + (n + 1) + ": ");
            System.out.println("\n1. Alemania\n2.Estados Unidos\n3.Union Sovietica");
            System.out.print("Escoga un bando: ");
            try {
                int bando = scanner.nextInt();
                if (bando > 0 && bando <= 3) {
                    scanner.nextLine();
                    System.out.print("Ingrese nombre del jugador: ");
                    switch (bando) {
                        case 1:
                            this.bandos.add(new Alemania(scanner.nextLine()));
                            System.out.println("Se ha escogido a alemania");
                            break;
                        case 2:
                            this.bandos.add(new EstadosUnidos(scanner.nextLine()));
                            System.out.println("Se ha escogido a Estados Unidos");
                            break;
                        case 3:
                            this.bandos.add(new UnionSovietica(scanner.nextLine()));
                            System.out.println("Se ha escogido a la Union Sovietica");
                            break;
                        default:
                            break;
                    }
                    n++;
                } else {
                    System.err.println("Eliga un bando valido");
                    //System.out.println("Eliga un bando valido");
                }
            } catch (Exception ex) {
                System.err.println("Ingrese un numero entre 1 y 3");
                scanner.nextLine();
            }

        }
        return bandos;

    }

    public void jugarTurno() {
        System.out.println("\nTurno de: " + this.bandos.get(atac).getComandante());
        int opc;
        boolean turno = true;
        Scanner scanner = new Scanner(System.in);
        while (turno) {
            try {
                System.out.println("\nAcciones: \n1. Crear una edificacion\n2. Terminsr turno");
                System.out.print("Ingrese una opcion: ");
                opc = scanner.nextInt();
                switch (opc) {
                    case 1:
                        this.bandos.get(atac).crearEdificacion();
                        break;
                    case 2:
                        turno = false;
                        System.err.println("Pasando de turno");
                        break;
                }
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        }
    }

    /*public void menuAlemania(){
        System.out.println("");
        
        
    }*/
    public void jugar() {

        boolean hayGanador = false;
        elegirBandos();
        while (!hayGanador) {
            jugarTurno();
            cambiarTurno();
            jugarTurno();
            cambiarTurno();
            moverFase();
            if (this.fase == 3) {
                hayGanador = true;

            }

        }

    }

}
