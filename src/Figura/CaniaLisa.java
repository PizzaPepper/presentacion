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
 *
 * @author Jorge Eliu
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

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public Graphics2D getG2d() {
        return g2d;
    }

    public void setG2d(Graphics2D g2d) {
        this.g2d = g2d;
    }
    
    @Override
    public void dibujar(int x, int y, Graphics2D g2d) {
        Rectangle rect = new Rectangle();
        rect.setBounds(x, y, ancho, alto);
        g2d.setColor(Color.BLACK);
        g2d.draw(rect);
    }
    
    
    
}
