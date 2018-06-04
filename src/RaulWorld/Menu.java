/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RaulWorld;

import Bandos.*;
import InterfazBandos.Pais;
import fabricas_abstractas.AbstractFactory;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rau3
 */
public class Menu {

    private static Menu menu = null;
    private ArrayList<CentroDeMando> bandos;
    int fase = 0, turno = 1;
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
        if(opc==1){
            
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

    }

    public CentroDeMando cambiarTurno() {
        if (this.turno == 1) {
            this.turno = 0;
        } else {
            this.turno = 1;
        }
        return this.bandos.get(turno);

    }

    public ArrayList<CentroDeMando> elegirBandos() {
        //Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <= 1; i++) {
            System.out.println("\nJugador " + (i + 1) + ": ");
            System.out.println("\n1. Alemania\n2.Estados Unidos\n3.Union Sovietica");
            System.out.print("Escoga un bando: ");

            int bando = scanner.nextInt();
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

        }
        return bandos;

    }

    /*public void menuAlemania(){
        System.out.println("");
        
        
    }*/
    public void jugar() {
        boolean hayGanador = false;
        elegirBandos();
        while (!hayGanador) {
            hayGanador = true;

        }

    }


}
