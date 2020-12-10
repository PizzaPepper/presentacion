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
public class CasillaNormal extends CasillaDibujo {

    public CasillaNormal(int x, int y, int ancho, int alto, Color color, Graphics2D g2d) {
        super(x, y, ancho, alto, color, g2d);
    }

    @Override
    public void dibujar(int x, int y, Graphics2D g2d) {
        g2d.setColor(color);
        
        Rectangle rect = new Rectangle();
        rect.setBounds(x, y, ancho, alto);
        g2d.draw(rect);
    }

}
