/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos_concretos.Soldados;

/**
 *
 * @author rau3
 */
public class SoldadosBuilder {
    private final int vida,danio,espera;
    private final String nombre,bando;

    public SoldadosBuilder(DivisionBuilder builder) {
        this.nombre=builder.nombre;
        this.bando=builder.bando;
        this.vida = builder.vida;
        this.danio = builder.danio;
        this.espera = builder.espera;
        
    }
    
    public String getNombre(){
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public int getDanio() {
        return danio;
    }

    public int getEspera() {
        return espera;
    }
    
    public String getBando(){
        return bando;
    }

    

    public static class DivisionBuilder {

        private final int vida,danio,espera;
        private final String bando,nombre;

        public DivisionBuilder(String nombre,String bando,int vida,int danio, int espera) {
            this.nombre=nombre;
            this.bando=bando;
            this.vida = vida;
            this.danio = danio;
            this.espera=espera;
        }


        public SoldadosBuilder build() {

            return new SoldadosBuilder(this);
        }

    }
    
}
