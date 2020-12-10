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
 * @author Equipo 5
 */
public class CasillaSemiCurva extends CasillaDibujo{

    private int startAngle;
    private int grade;
    /**
     * Contructor 
     * @param x Posicion x de la casilla
     * @param y Posicion y de la casilla
     * @param ancho Ancho de la casilla
     * @param alto Alto de la casilla
     * @param startAngle Angulo inicial de la curvatura de la casilla
     * @param grade grados de la curvatura de la casilla
     * @param color Color de la casilla
     * @param g2d Graphics2D del JPanel
     */
    public CasillaSemiCurva(int x, int y, int ancho, int alto,int startAngle, int grade, Color color, Graphics2D g2d) {
        super(x, y, ancho, alto, color, g2d);
        this.startAngle = startAngle;
        this.grade = grade;
    }
    
    
    /**
     * Metodo que obtiene el angulo inicial
     * @return startAngle
     */
    public int getStartAngle() {
        return startAngle;
    }
    /**
     * Metodo que establece el angulo inicial
     * @param startAngle  
     */
    public void setStartAngle(int startAngle) {
        this.startAngle = startAngle;
    }
     /**
     * Metodo que obtiene los grados de la curvatura
     * @return grade
     */
    public int getGrade() {
        return grade;
    }
    /**
     * Metodo que establece los grados de la curvatura
     * @param grade
     */
    public void setGrade(int grade) {
        this.grade = grade;
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
        g2d.drawArc(x, y, ancho, alto, startAngle, grade);
    }
    
}
