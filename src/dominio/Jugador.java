package dominio;

import java.awt.Color;

/**
 * clase que representa al jugador
 * @author Equipo 5
 */
public class Jugador {
    
    /* Variables a utilizar */
    private String nombreUsuario;
    private int semillas;
    private Ficha[] fichas;
    
    //Cosntructor que recibe el nombre del jugador y su cantidad de semillas
    public Jugador(String nombreUsuario, int semillas) {
        this.nombreUsuario = nombreUsuario;
        this.semillas = semillas;
    }
//metodo que recibe el nombre del usuario
    public String getNombreUsuario() {
        return nombreUsuario;
    }
//metodo que recibe el nombre del jugador
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
// metodo que devuelve la cantidad de semillas 
    public int getSemillas() {
        return semillas;
    }
//Metodo que recibe la cantidad de semillas
    public void setSemillas(int semillas) {
        this.semillas = semillas;
    }
//Metodo que devuelve el arreglo de fichas por jugador
    public Ficha[] getFichas() {
        return fichas;
    }
//Metodo que recibe el arreglo de fichas por jugador
    public void ConfigurarFichas(int cant,Color color) {
        Ficha[] f=new Ficha[cant];
        for (Ficha ficha : f) {
            ficha=new Ficha(this);
            ficha.getFichaJ().setColor(color);
        }
        this.fichas=f;
    }

    //Metodo que devuelve una cadena de texto con los atributos descritos
    @Override
    public String toString() {
        return "Jugador[" + "nombreUsuario:" + nombreUsuario + ", semillas:" + semillas + ", fichas:" + fichas + ']';
    }
}
