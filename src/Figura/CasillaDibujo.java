/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figura;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author Equipo 5
 */
public abstract class CasillaDibujo  implements IFigura{
    protected int x;
    protected int y;
    protected int ancho;
    protected int alto;
    protected Color color;
    protected FichaDibujo ficha;
    protected Graphics2D g2d;
    /**
     * Contructor 
     * @param x Posicion x de la casilla
     * @param y Posicion y de la casilla
     * @param ancho Ancho de la casilla
     * @param alto Alto de la casilla
     * @param color Color de la casilla
     * @param g2d Graphics2D del JPanel
     */
    public CasillaDibujo(int x, int y, int ancho, int alto, Color color, Graphics2D g2d) {
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
        this.color = color;
        this.ficha = null;
        this.g2d = g2d;
    }

    /**
     * Metodo que Regresa la posicion X
     * @return X
     */
    public int getX() {
        return x;
    }
    /**
     * Metodo que establece el valor de la posicion X
     * @param x Valor a cambiar
     */
    public void setX(int x) {
        this.x = x;
    }
    /**
     * Metodo que Regresa la posicion Y
     * @return y
     */
    public int getY() {
        return y;
    }
    
    /**
     * Metodo que establece el valor de la posicion Y
     * @param y Valor a cambiar
     */
    public void setY(int y) {
        this.y = y;
    }
    /**
     * Metodo que Regresa Ancho
     * @return ancho
     */
    public int getAncho() {
        return ancho;
    }
    /**
     * Metodo que establece el ancho
     * @param ancho Valor a cambiar
     */
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    /**
     * Metodo que regresa Ancho
     * @return Alto
     */
    public int getAlto() {
        return alto;
    }
    /**
     * Metodo que establece el alto
     * @param Alto Valor a cambiar
     */
    public void setAlto(int alto) {
        this.alto = alto;
    }
    /**
     * Metodo que regresa el color
     * @return color
     */
    public Color getColor() {
        return color;
    }
    /**
     * Metodo que establece el color
     * @param color Valor a cambiar
     */
    public void setColor(Color color) {
        this.color = color;
    }
    /**
     * Metodo que regresa Graphics2D
     * @return g2d
     */
    public Graphics2D getG2d() {
        return g2d;
    }
    /**
     * Metodo que establece el Graphics2D
     * @param g2d Valor a cambiar
     */
    public void setG2d(Graphics2D g2d) {
        this.g2d = g2d;
    }
    /**
     * Metodo que regresa ficha
     * @return ficha
     */
    public FichaDibujo getFicha() {
        return ficha;
    }
    /**
     * Metodo que establece la ficha
     * @param ficha Valor a cambiar
     */
    public void setFicha(FichaDibujo ficha) {
        this.ficha = ficha;
    }
    
}
