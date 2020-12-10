/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figura;

import dominio.Ficha;
import java.awt.Color;
import java.awt.Graphics2D;

/**
 * Clase de una ficha dibujo
 * @author Equipo5
 */
public class FichaDibujo implements IFigura{
    
    private Ficha ficha;
    private int x;
    private int y;
    private int ancho;
    private int alto;
    private Color color;
    private Graphics2D g2d;
    /**
     * Constructor
     * @param ficha Ficha representate abstracta
     * @param x Posicion x de la casilla
     * @param y Posicion y de la casilla
     * @param ancho Ancho de la casilla
     * @param alto Alto de la casilla
     * @param color Color de la casilla
     * @param g2d Graphics2D del JPanel
     */
    public FichaDibujo(Ficha ficha, int x, int y, int ancho, int alto, Color color, Graphics2D g2d) {
        this.ficha = ficha;
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
        this.color = color;
        this.g2d = g2d;
    }
    
    
    /**
     * Metodo que obtiene la ficha
     * @return ficha
     */
    public Ficha getFicha() {
        return ficha;
    }
    /**
     * Metodo que establece la ficha
     * @param cicha 
     */
    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
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
     * Metodo que dibuja la ficha
     * @param x Posicion x de la ficha
     * @param y Posicion y de la ficha
     * @param g2d Graphics2D del JPanel 
     */
    @Override
    public void dibujar(int x, int y, Graphics2D g2d) {
        g2d.setStroke(new BasicStroke(1));
        g2d.setColor(color);
        Ellipse2D.Double ficha = new Ellipse2D.Double(x + (ancho / 7), y + (alto / 7), ancho - (ancho / 4), alto - (alto / 4));
        g2d.fill(ficha);
        g2d.setColor(Color.BLACK);
        g2d.draw(ficha);
    }
    
}
