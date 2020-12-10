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
 *
 * @author Jorge Eliu
 */
public class FichaDibujo implements IFigura{
    
    private Ficha ficha;
    private int x;
    private int y;
    private int ancho;
    private int alto;
    private Color color;
    private Graphics2D g2d;

    public FichaDibujo(Ficha ficha, int x, int y, int ancho, int alto, Color color, Graphics2D g2d) {
        this.ficha = ficha;
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
        this.color = color;
        this.g2d = g2d;
    }
    
    
    
    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Graphics2D getG2d() {
        return g2d;
    }

    public void setG2d(Graphics2D g2d) {
        this.g2d = g2d;
    }
    
    
    

    @Override
    public void dibujar(int x, int y, Graphics2D g2d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
