/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dibujo;

import Figura.IFigura;
import Figura.TableroDibujo;
import dominio.Tablero;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import javax.swing.JPanel;

/**
 *Clase que se encarga de dibujar el tablero
 * @author Equipo 5
 */
public class LienzoTablero extends JPanel implements IFigura{
    private Color colorDefault;
    private Graphics2D g2d;
    private TableroDibujo tableroD;
    public static Tablero tablero;
    
    /**
     * Constructor que inicializar el tablero
     * @param tablero Objeto Tablero que permite definir el tamaño del tablero
     */
    public LienzoTablero(Tablero tablero) {
        this.tablero = tablero;
        this.colorDefault = Color.BLACK;
        this.tableroD=new TableroDibujo(tablero);
    }
    /**
     * Metodo que dibuja el Jpanel
     * @param g Objeto Grapgics para dibujar el Jpanel
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
    
        super.paintComponent(g);
        this.setOpaque(false);
        
        g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(Color.BLACK);

        Rectangle rect = new Rectangle();
        rect.setBounds(0, 0, this.getWidth() - 1, this.getHeight() - 1);
        g2d.draw(rect);
        
        g2d.rotate(Math.toRadians(45), rect.getCenterX(), rect.getCenterY());

        g2d.setColor(colorDefault);
        g2d.setStroke(new BasicStroke(2));

        //Configuracion
        int x = (int) rect.getCenterX() - 22, y = (int) rect.getCenterY() - 22;
        
        dibujar(x, y, g2d);
        
    }
    /**
     * Metodo que dibuja el tablero
     * @param x Posicion x inicial
     * @param y Posicion y inicial
     * @param g2d Objeto Graphics2D donde se va dibujar
     */
    @Override
    public void dibujar(int x, int y, Graphics2D g2d) {
        tableroD.dibujar(x, y, g2d);
    }
}
