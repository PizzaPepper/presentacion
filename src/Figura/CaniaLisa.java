/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figura;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 * Clase de una cania lisa
 * @author Equipo5
 */
public class CaniaLisa implements IFigura{
    private int x;
    private int y;
    private int ancho;
    private int alto;
    private Graphics2D g2d;

    public CaniaLisa(int x, int y, int ancho, int alto, Graphics2D g2d) {
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
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
     * Metodo que dibuja una cania lisa
     * @param x Posicion x de la cania
     * @param y Posicion y de la cania
     * @param g2d Graphics2D del JPanel 
     */
    
    @Override
    public void dibujar(int x, int y, Graphics2D g2d) {
        Rectangle rect = new Rectangle();
        rect.setBounds(x, y, ancho, alto);
        g2d.setColor(Color.BLACK);
        g2d.draw(rect);
    }
    
    
    
}
