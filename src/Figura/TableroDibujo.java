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
 *
 * @author Jorge Eliu
 */
public class TableroDibujo implements IFigura {

    private CasillaDibujo[] casilladibujo;
    private Tablero tablero;
    private boolean sentido;

    public TableroDibujo(Tablero tablero) {
        int total = ((tablero.getTamanio() + 1) * 8) - 4;
        this.casilladibujo = new CasillaDibujo[total];
        this.tablero = tablero;
        this.sentido = true;
    }

    public CasillaDibujo[] getCasilladibujo() {
        return casilladibujo;
    }

    public void setCasilladibujo(CasillaDibujo[] casilladibujo) {
        this.casilladibujo = casilladibujo;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    @Override
    public void dibujar(int x, int y, Graphics2D g2d) {
        //Configuracion
        int tam=tablero.getTamanio();
        int ancho=20,alto=20;
        
         //AstillaIzquierda
        dibujarAstillaIzquierda(x - (ancho), y, ancho, alto, tam, g2d);
        //AstillaAbajo
        dibujarAstillaAbajo(x, y + ancho + (alto + 1), ancho, alto, tam, g2d);  
        //AstillaDerecha
        dibujarAstillaDerecha(x + (ancho * 2), y, ancho, alto, tam, g2d);
        //AstillaArriba
        dibujarAstillaArriba(x, y - ancho, ancho, alto, tam, g2d);
        //CasillaCentral (Solo dibuja)
        dibujarCentrales(x, y, ancho, alto, g2d);
    }

    private void dibujarAstillaArriba(int x, int y, int ancho, int alto, int tam, Graphics2D g2d) {
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

    private void dibujarAstillaAbajo(int x, int y, int ancho, int alto, int tam, Graphics2D g2d) {

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

    private void dibujarAstillaIzquierda(int x, int y, int ancho, int alto, int tam, Graphics2D g2d) {
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

    private void dibujarAstillaDerecha(int x, int y, int ancho, int alto, int tam, Graphics2D g2d) {

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
