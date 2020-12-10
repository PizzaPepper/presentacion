/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figura;

import java.awt.Graphics2D;

/**
 *Interfaz que define el dibujo
 * @author Equipo 5
 */
public interface IFigura {
    /**
     * Metodo abstracto que define la forma de dibujar 
     * @param x
     * @param y
     * @param g2d 
     */
    public void dibujar(int x,int y, Graphics2D g2d);
}
