/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figura;

import Enum.Sentido;
import dominio.Tablero;
import java.awt.Color;
import java.awt.Graphics2D;

/**
 * Clase del tablero dibujo 
 * @author Equipo5
 */
public class TableroDibujo implements IFigura {

    private CasillaDibujo[] casilladibujo;
    private Tablero tablero;
    private boolean sentido;
    /**
     * Constructor
     * @param tablero que configura el tamaño del tablero 
     */
    public TableroDibujo(Tablero tablero) {
        int total = ((tablero.getTamanio() + 1) * 8) - 4;
        this.casilladibujo = new CasillaDibujo[total];
        this.tablero = tablero;
        this.sentido = true;
    }
     /**
     * Metodo que Regresa el arreglo de casillas dibujo
     * @return casilladibujo[]
     */
    public CasillaDibujo[] getCasilladibujo() {
        return casilladibujo;
    }
    /**
     * Metodo que establece el arreglo de casillas dibujo
     * @param casilladibujo[] Valor a cambiar
     */
    public void setCasilladibujo(CasillaDibujo[] casilladibujo) {
        this.casilladibujo = casilladibujo;
    }
    /**
     * Metodo que Regresa el tablero dominio
     * @return casilladibujo[]
     */
    public Tablero getTablero() {
        return tablero;
    }
    /**
     * Metodo que establece el tablero
     * @param tablero Valor a cambiar
     */
    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }
    /**
     * Metodo que dibuja el conjunto de casillas
     * @param x Posicion x inicial
     * @param y Posicion y inicial
     * @param g2d Graphics2D del JPanel 
     */
    @Override
    public void dibujar(int x, int y, Graphics2D g2d) {
        //Configuracion
        int tam=tablero.getTamanio();
        int ancho=20,alto=20;
        
         //AstillaIzquierda
        dibujarAspaIzquierda(x - (ancho), y, ancho, alto, tam, g2d);
        //AstillaAbajo
        dibujarAspaAbajo(x, y + ancho + (alto + 1), ancho, alto, tam, g2d);  
        //AstillaDerecha
        dibujarAspaDerecha(x + (ancho * 2), y, ancho, alto, tam, g2d);
        //AstillaArriba
        dibujarAspaArriba(x, y - ancho, ancho, alto, tam, g2d);
        //CasillaCentral (Solo dibuja)
        dibujarCentrales(x, y, ancho, alto, g2d);
    }
    /**
     * dibuja el aspa hacia arriba
     * @param x Posicion x de la casilla
     * @param y Posicion y de la casilla
     * @param ancho Ancho de la casilla
     * @param alto Alto de la casilla
     * @param g2d Graphics2D del JPanel
     */
    private void dibujarAspaArriba(int x, int y, int ancho, int alto, int tam, Graphics2D g2d) {
        int cant = tam + 1;
        int i = (cant * 6) - 2; //46

        x += ancho;

        //Astilla Arriba-Derecha
        int iCant = (cant * 7) - 3;
        while (i < iCant) {
            /*53*/
            if (i < iCant - 3) {
                casilladibujo[i] = new CasillaNormal(x, y, ancho, alto, Color.BLACK, g2d);
                casilladibujo[i].dibujar(x, y, g2d);
            }
            if (i > iCant - 4 && i < iCant - 1) {
                casilladibujo[i] = new CasillaTriangulo(x, y, ancho, alto, Color.BLACK, Sentido.IZQUIERDA, g2d);
                casilladibujo[i].dibujar(x, y, g2d);
            }
            if (i == iCant - 1) {
                casilladibujo[i] = new CasillaSemiCurva(x, y, ancho, alto * 2, 0, 180, Color.BLACK, g2d);
                casilladibujo[i].dibujar(x, y, g2d);
            }
            y -= alto;

            i++;
        }
        //Astilla Arriba-Izquierda
        y += alto;
        x -= ancho;
        iCant = (cant * 8) - 4;
        while (i < iCant) {
            /*60*/
            if (i == (cant * 7) - 3) {
                casilladibujo[i] = new CasillaSemiCurva(x, y, ancho, alto * 2, 0, 180, Color.BLACK, g2d);
                casilladibujo[i].dibujar(x, y, g2d);
            }
            if (i > (cant * 7) - 3 && i <= (cant * 7) - 1) {
                casilladibujo[i] = new CasillaTriangulo(x, y, ancho, alto, Color.BLACK, Sentido.DERECHA, g2d);
                casilladibujo[i].dibujar(x, y, g2d);
            }
            if (i > (cant * 7) - 1 && i < iCant) {
                casilladibujo[i] = new CasillaNormal(x, y, ancho, alto, Color.BLACK, g2d);
                casilladibujo[i].dibujar(x, y, g2d);
            }
            y += alto;
            i++;
        }
    }
    /**
     * dibuja el aspa hacia abajo
     * @param x Posicion x de la casilla
     * @param y Posicion y de la casilla
     * @param ancho Ancho de la casilla
     * @param alto Alto de la casilla
     * @param g2d Graphics2D del JPanel
     */
    private void dibujarAspaAbajo(int x, int y, int ancho, int alto, int tam, Graphics2D g2d) {

        int cant = tam + 1;
        int i = cant * 2; //16
        int iCant = (cant * 3) - 1;

        //Astilla Abajo-Izquierda
        while (i < iCant) {
            /*23*/
            if (i < iCant - 3) {
                casilladibujo[i] = new CasillaNormal(x, y, ancho, alto, Color.BLACK, g2d);
                casilladibujo[i].dibujar(x, y, g2d);
            }
            if (i > iCant - 4 && i < iCant - 1) {
                casilladibujo[i] = new CasillaTriangulo(x, y, ancho, alto, Color.BLACK, Sentido.DERECHA, g2d);
                casilladibujo[i].dibujar(x, y, g2d);
            }
            if (i == iCant - 2) {
                casilladibujo[i] = new CasillaSemiCurva(x, y + alto, ancho, alto * 2, 180, 180, Color.BLACK, g2d);
                casilladibujo[i].dibujar(x, y, g2d);
            }
            y += alto;
            i++;
        }
        
        
        //Astilla Abajo-Derecha
        x += ancho;
        y -= alto;
        iCant = (cant * 4) - 1;
        while (i < iCant) {
            /*31*/
            if (i == (cant * 3) ) {
                casilladibujo[i] = new CasillaSemiCurva(x, y - alto, ancho, alto * 2, 180, 180, Color.BLACK, g2d);
                casilladibujo[i].dibujar(x, y, g2d);
            }
            if (i > (cant * 3) - 1 && i < (cant * 3) + 2) {
                casilladibujo[i] = new CasillaTriangulo(x, y, ancho, alto, Color.BLACK, Sentido.IZQUIERDA, g2d);
                casilladibujo[i].dibujar(x, y, g2d);
            }
            if (i > (cant * 3) + 1 && i < iCant - 1) {
                casilladibujo[i] = new CasillaNormal(x, y, ancho, alto, Color.BLACK, g2d);
                casilladibujo[i].dibujar(x, y, g2d);
            }
            if (i == iCant - 1) {
                //casilla[i] = new Central();
                casilladibujo[i] = new CasillaCentral(x, y, ancho, alto, Color.YELLOW, g2d);
                casilladibujo[i].dibujar(x, y, g2d);
            }
            y -= alto;
            i++;
        }
    }
    /**
     * dibuja el aspa hacia la izquierda
     * @param x Posicion x de la casilla
     * @param y Posicion y de la casilla
     * @param ancho Ancho de la casilla
     * @param alto Alto de la casilla
     * @param g2d Graphics2D del JPanel
     */
    private void dibujarAspaIzquierda(int x, int y, int ancho, int alto, int tam, Graphics2D g2d) {
        int cant = tam + 1;
        int iCant = cant;

        x += ancho;

        int i = 0;
        // Astilla izquierda-Arriba
        while (i < iCant) {
            /*8*/

            if (i == 0) {
                casilladibujo[i] = new CasillaCentral(x, y, ancho, alto, Color.YELLOW, g2d);
                casilladibujo[i].dibujar(x, y, g2d);
            }

            if (i >= 1 && i < iCant - 3) {
                casilladibujo[i] = new CasillaNormal(x, y, ancho, alto, Color.BLACK, g2d);
                casilladibujo[i].dibujar(x, y, g2d);
            }

            if (i == iCant - 2 || i == iCant - 3) {
                casilladibujo[i] = new CasillaTriangulo(x, y, ancho, alto, Color.BLACK, Sentido.ABAJO, g2d);
                casilladibujo[i].dibujar(x, y, g2d);
            }

            if (i == iCant - 1) {
                casilladibujo[i] = new CasillaSemiCurva(x, y, ancho * 2, alto, 90, 180, Color.BLACK, g2d);
                casilladibujo[i].dibujar(x, y, g2d);
            }
            x -= ancho;

            i++;
        }
        y += alto;
        x += ancho;
        iCant = cant * 2;
        //Astilla Izquierda-Abajo
        while (i < iCant) {
            /*16*/

            if (i == cant) {
                casilladibujo[i] = new CasillaSemiCurva(x, y, ancho * 2, alto, 90, 180, Color.BLACK, g2d);
                casilladibujo[i].dibujar(x, y, g2d);
            }
            if (i > cant && i <= cant + 2) {
                casilladibujo[i] = new CasillaTriangulo(x, y, ancho, alto, Color.BLACK, Sentido.ARRIBA, g2d);
                casilladibujo[i].dibujar(x, y, g2d);
            }
            if (i > cant + 2 && i < iCant - 1) {
                casilladibujo[i] = new CasillaNormal(x, y, ancho, alto, Color.BLACK, g2d);
                casilladibujo[i].dibujar(x, y, g2d);
            }
            if (i == iCant - 1) {
                casilladibujo[i] = new CasillaCentral(x, y, ancho, alto, Color.YELLOW, g2d);
                casilladibujo[i].dibujar(x, y, g2d);
            }

            x += ancho;

            i++;
        }
    }
    /**
     * dibuja el aspa hacia la derecha
     * @param x Posicion x de la casilla
     * @param y Posicion y de la casilla
     * @param ancho Ancho de la casilla
     * @param alto Alto de la casilla
     * @param g2d Graphics2D del JPanel
     */
    private void dibujarAspaDerecha(int x, int y, int ancho, int alto, int tam, Graphics2D g2d) {

        y += alto;

        int cant = tam + 1;
        int i = (cant * 4) - 1; //31
        //Astilla Derecha-Abajo
        int iCant = (cant * 5) - 2;
        while (i < iCant) {
            /*38*/
            if (i < iCant - 3) {
                casilladibujo[i] = new CasillaNormal(x, y, ancho, alto, Color.BLACK, g2d);
                casilladibujo[i].dibujar(x, y, g2d);
            }
            if (i > iCant - 4 && i < iCant - 1) {
                casilladibujo[i] = new CasillaTriangulo(x, y, ancho, alto, Color.BLACK, Sentido.ARRIBA, g2d);
                casilladibujo[i].dibujar(x, y, g2d);
            }
            if (i == iCant - 1) {
                casilladibujo[i] = new CasillaSemiCurva(x - ancho, y, ancho * 2, alto, 270, 180, Color.BLACK, g2d);
                casilladibujo[i].dibujar(x - ancho, y, g2d);
            }
            x += ancho;
            i++;
        }
        //Astilla Derecha-Arriba
        y -= alto;
        x -= ancho;
        iCant = (cant * 6) - 2;
        while (i < iCant) {
            /*46*/
            if (i == (cant * 5) - 2) {
                casilladibujo[i] = new CasillaSemiCurva(x - ancho, y, ancho * 2, alto, 270, 180, Color.BLACK, g2d);
                casilladibujo[i].dibujar(x - ancho, y, g2d);
            }
            if (i > (cant * 5) - 2 && i <= (cant * 5)) {
                casilladibujo[i] = new CasillaTriangulo(x, y, ancho, alto, Color.BLACK, Sentido.ABAJO, g2d);
                casilladibujo[i].dibujar(x, y, g2d);
            }
            if (i > (cant * 5) && i < iCant - 1) {
                casilladibujo[i] = new CasillaNormal(x, y, ancho, alto, Color.BLACK, g2d);
                casilladibujo[i].dibujar(x, y, g2d);
            }
            if (i == iCant - 1) {
                casilladibujo[i] = new CasillaCentral(x, y, ancho, alto, Color.YELLOW, g2d);
                casilladibujo[i].dibujar(x, y, g2d);
            }
            x -= ancho;
            i++;
        }
    }
    /**
     * dibuja las casillas centrales
     * @param x Posicion x de la casilla
     * @param y Posicion y de la casilla
     * @param ancho Ancho de la casilla
     * @param alto Alto de la casilla
     * @param g2d Graphics2D del JPanel
     */
    private void dibujarCentrales(int x, int y, int ancho, int alto, Graphics2D g2d) {
        CasillaDibujo casillaCentral;
        for (int i = 0; i < 2; i++) {
            casillaCentral = new CasillaCentral(x, y, ancho, alto, Color.YELLOW, g2d);
            casillaCentral.dibujar(x, y, g2d);
            casillaCentral = new CasillaCentral(x, y + alto, ancho, alto, Color.YELLOW, g2d);
            casillaCentral.dibujar(x, y + alto, g2d);
            x += ancho;
        }
    }
}
