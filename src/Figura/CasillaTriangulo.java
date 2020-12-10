/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figura;

import Enum.Sentido;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;

/**
 * Clase de una casilla tipo triangulo
 * @author Equipo5
 */
public class CasillaTriangulo extends CasillaDibujo{
    
    private Sentido sentido;
    /**
     * Contructor 
     * @param x Posicion x de la casilla
     * @param y Posicion y de la casilla
     * @param ancho Ancho de la casilla
     * @param alto Alto de la casilla
     * @param color Color de la casilla
     * @param sentido Sentido que apunta el triangulo
     * @param g2d Graphics2D del JPanel
     */
    public CasillaTriangulo( int x, int y, int ancho, int alto, Color color, Sentido sentido,Graphics2D g2d) {
        super(x, y, ancho, alto, color, g2d);
        this.sentido = sentido;
    }
    /**
     * Metodo que regresa el sentido
     * @return sentido
     */
    public Sentido getSentido() {
        return sentido;
    }
    /**
     * Metodo que establece el sentido
     * @param sentido  
     */
    public void setSentido(Sentido sentido) {
        this.sentido = sentido;
    }
    
    /**
     * Metodo que dibuja una casilla triangular
     * @param x Posicion x de la casilla
     * @param y Posicion y de la casilla
     * @param g2d Graphics2D del JPanel 
     */
    @Override
    public void dibujar(int x, int y, Graphics2D g2d) {
        Polygon triangulo;
        int x1[];
        int y1[];

        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(1));
        
        Rectangle rect = new Rectangle();
        rect.setBounds(x,y, ancho, alto);

        switch (sentido) {
            case ABAJO:
                x1 = new int[]{x, x + ancho / 2, x + ancho};
                y1 = new int[]{y, y + alto, y};
                triangulo = new Polygon(x1, y1, 3);
                g2d.draw(rect);
                g2d.fillPolygon(triangulo);
                g2d.drawPolygon(triangulo);
                break;
            case ARRIBA:
                x1 = new int[]{x, x + ancho / 2, x + ancho};
                y1 = new int[]{y + alto, y,y + alto};
                triangulo = new Polygon(x1, y1, 3);
                g2d.draw(rect);
                g2d.fillPolygon(triangulo);
                g2d.drawPolygon(triangulo);
                break;
            case DERECHA:
                x1 = new int[]{x, x + ancho, x};
                y1 = new int[]{y, y + alto / 2, y+ alto};
                triangulo = new Polygon(x1, y1, 3);
                g2d.draw(rect);
                g2d.fillPolygon(triangulo);
                g2d.drawPolygon(triangulo);
                break;
            case IZQUIERDA:
                x1 = new int[]{x + ancho, x, x + ancho};
                y1 = new int[]{y, y + alto / 2, y + alto};
                triangulo = new Polygon(x1, y1, 3);
                g2d.draw(rect);
                g2d.fillPolygon(triangulo);
                g2d.drawPolygon(triangulo);
                break;
        }
        g2d.setColor(this.getColor());
        g2d.setStroke(new BasicStroke(2));
    }
    
}
