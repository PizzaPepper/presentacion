/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figura;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

/**
 *Clase de una cania pubto
 * @author Equipo5
 */
public class CaniaPunto implements IFigura{
    
    private int x;
    private int y;
    private int ancho;
    private int alto;
    private Graphics2D g2d;
    /**
     * Contructor 
     * @param x Posicion x de la casilla
     * @param y Posicion y de la casilla
     * @param ancho Ancho de la casilla
     * @param alto Alto de la casilla
     * @param g2d Graphics2D del JPanel
     */
    public CaniaPunto(int x, int y, int ancho, int alto, Graphics2D g2d) {
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
     * Metodo que dibuja una cania punto
     * @param x Posicion x de la casilla
     * @param y Posicion y de la casilla
     * @param g2d Graphics2D del JPanel 
     */
    @Override
    public void dibujar(int x, int y, Graphics2D g2d) {
        
        Rectangle rect = new Rectangle();
        Ellipse2D.Double ell = new Ellipse2D.Double(x + ancho / 3, y + alto / 3, ancho / 3, alto / 4);
        rect.setBounds(x, y, ancho, alto);
        g2d.setColor(Color.BLACK);
        g2d.draw(rect);
        g2d.fill(ell);
        g2d.draw(ell);
    }
    
}
