/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dibujo;

import Figura.CaniaLisa;
import Figura.CaniaPunto;
import Figura.IFigura;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import javax.swing.JPanel;

/**
 * Clase que se encarga de dibujar el resultado de las canias 
 * @author Equipo 5
 */
public class LienzoCanias extends JPanel implements IFigura{
    
    private boolean[] canias = null;
    private Graphics2D g2d;
    /**
     * Metodo que dibuja el Jpanel
     * @param g Objeto Grapgics para dibujar el Jpanel
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
    
        g.clearRect(0, 0, getWidth(), getHeight());

        g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(Color.BLACK);

        Rectangle rect = new Rectangle();

        rect.setBounds(0, 0, this.getWidth() - 1, this.getHeight() - 1);
        g2d.draw(rect);

        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(2));

        LanzarCanias(canias);
    
    }
    
    
    /**
     * Metodo que regresa las Canias
     * @return regresa las Canias
     */
    public boolean[] getCanias() {
        return canias;
    }
    /**
     * Metodo que establece Canias
     * @param canias Canias a establecer
     */
    public void setCanias(boolean[] canias) {
        this.canias = canias;
    }
    /**
     * Metodo que regresa el Graphics
     * @return regresa el objeto Graphics
     */
    public Graphics2D getG2d() {
        return g2d;
    }
    /**
     * Metodo que establece Canias
     * @param canias Canias a establecer
     */
    public void setG2d(Graphics2D g2d) {
        this.g2d = g2d;
    }
    /**
     * Metodo que repinta el resultado del las canias
     */
    public void LanzarCanias() {
        if (canias != null) {
            int x = 0, y = 0;
            dibujar(x, y, g2d);
            repaint();
        }
    }

    /*  
    * Metodo que complementa lanzar canias
    */
    public void LanzarCanias(boolean[] canias) {
        if (canias != null) {
            int x = 50, y = 20;
            dibujar(x, y, g2d);
            repaint();
        }
    }

    /**
     * Metodo interfaz que dibuja las canias
     * @param x Posicion x
     * @param y Posicion y
     * @param g2d Objeto Graphics2D donde se va dibujar
     */
    @Override
    public void dibujar(int x, int y, Graphics2D g2d) {
       int ancho=20,alto=20;
       IFigura Ifigura;
        for (int i = 0; i < 5; i++) {
            if (canias[i] == true) {
                Ifigura=new CaniaLisa(x + ancho * 3, y + alto, ancho * 2, alto * 3, g2d);
                Ifigura.dibujar(x, y, g2d);
            } else {
                Ifigura=new CaniaPunto(x + ancho * 3, y + alto, ancho * 2, alto * 3, g2d);
                Ifigura.dibujar(x, y, g2d);
            }
            x += ancho * 3;
        }
        
    }
    
    
    
}
