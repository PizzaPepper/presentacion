package dominio;

/* Librerias a utilizar */

/**
 *
 * @author Equipo 5
 */
public class Ficha {
     /* Variables a utilizar */
    private Jugador jugador;
    private FichaJugador fichaJ;

     //Constructor por defecto
    public Ficha() {
    }

     //constructor que recibe en su parametro el jugador 
    public Ficha(Jugador jugador) {
        this.jugador = jugador;

    }
//Metodo que devuelve el jugador
    public Jugador getJugador() {
        return jugador;
    }
//Metodo que recibe el jugador
    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
//Metodo que devuelve la ficha del jugador
    public FichaJugador getFichaJ() {
        return fichaJ;
    }
//metodo que recibe la ficha del jugador
    public void setFichaJ(FichaJugador fichaJ) {
        this.fichaJ = fichaJ;
    }
//Metodo que devuelve una cadena de texto con los atributos correspondientes
    @Override
    public String toString() {
        return "Ficha{" + "jugador=" + jugador + ", fichaJ=" + fichaJ + '}';
    }
}
