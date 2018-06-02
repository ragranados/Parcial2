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

    private Menu() {
        this.bandos = new ArrayList();
        
    }
    public static Menu getInstance(){
        if(menu==null){
            return new Menu();
        }
        return null;
    }
    
    public void mostrarOpciones(){
        
    }

    public static Menu getMenu() {
        return menu;
    }

    public ArrayList<CentroDeMando> getBandos() {
        return bandos;
    }
    
    
    

    public ArrayList<CentroDeMando> elegirBandos() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <= 1; i++) {
            System.out.println("\nJugador "+(i+1)+": ");
            System.out.println("1. Alemania\n2.Estados Unidos");
            System.out.print("Escoga un bando: ");
            int bando = scanner.nextInt();
            if (bando == 1) {
                scanner.nextLine();
                System.out.print("Ingrese nombre del jugador: ");
                this.bandos.add(new Alemania(scanner.nextLine()));
                System.out.println("Se ha escogido a alemania");
            }
            else if(bando ==2){
                scanner.nextLine();
                System.out.print("Ingrese nombre del jugador: ");
                this.bandos.add(new EstadosUnidos(scanner.nextLine()));
                System.out.println("Se ha escogido a Estados Unidos");
            }
            else if(bando==3){
                scanner.nextLine();
                System.out.print("Ingrese nombre del jugador: ");
                this.bandos.add(new UnionSovietica(scanner.nextLine()));
                System.out.println("Se ha escogido a la Union Sovietica");
            }
            
        }
        return bandos;

    }
    
    

}
