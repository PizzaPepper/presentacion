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
 *Clase de una casilla tipo normal
 * @author Equipo 5
 */
public class CasillaNormal extends CasillaDibujo {
    /**
     * Contructor 
     * @param x Posicion x de la casilla
     * @param y Posicion y de la casilla
     * @param ancho Ancho de la casilla
     * @param alto Alto de la casilla
     * @param color Color de la casilla
     * @param g2d Graphics2D del JPanel
     */
    public CasillaNormal(int x, int y, int ancho, int alto, Color color, Graphics2D g2d) {
        super(x, y, ancho, alto, color, g2d);
    }
    /**
     * Metodo que dibuja una casilla normal
     * @param x Posicion x de la casilla
     * @param y Posicion y de la casilla
     * @param g2d Graphics2D del JPanel 
     */
    @Override
    public void dibujar(int x, int y, Graphics2D g2d) {
        g2d.setColor(color);
        
        Rectangle rect = new Rectangle();
        rect.setBounds(x, y, ancho, alto);
        g2d.draw(rect);
    }

}
