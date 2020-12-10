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
 * @author Jorge Eliu
 */
public abstract class CasillaDibujo  implements IFigura{
    protected int x;
    protected int y;
    protected int ancho;
    protected int alto;
    protected Color color;
    protected FichaDibujo ficha;
    protected Graphics2D g2d;

    public CasillaDibujo(int x, int y, int ancho, int alto, Color color, Graphics2D g2d) {
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
        this.color = color;
        this.ficha = null;
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

    public FichaDibujo getFicha() {
        return ficha;
    }

    public void setFicha(FichaDibujo ficha) {
        this.ficha = ficha;
    }
    
}
