package dominio;

/**
 * Clase padre que va a heredar los metodos correspondientes a sus casillas hijas
 * @author Equipo 5
 */
public abstract class Casilla {
     /* Variable a utilizar */
    private FichaJugador fichaActual;
    private Posicion pos;

     //Constructor que inicializa los atributos ficha y posición
    public Casilla() {
        this.fichaActual=null;
        this.pos=null;
    }

     //Metodo get de ficha actual que devuelve lo antes dicho
    public FichaJugador getFichaActual() {
        return fichaActual;
    }

     //Metodo que recibe la ficha 
    public void setFichaActual(FichaJugador fichaActual) {
        this.fichaActual = fichaActual;
    }

//metodo que devuelve la posición ficha
    public Posicion getPos() {
        return pos;
    }
//metodo que recibe la posición
    public void setPos(Posicion pos) {
        this.pos = pos;
    }
    
    /* Metodo del comportamiento de la ficha*/
    public abstract void Comportamiento(Ficha ficha);
}
