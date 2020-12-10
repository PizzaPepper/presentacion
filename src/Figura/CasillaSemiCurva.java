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
public class CasillaSemiCurva extends CasillaDibujo{

    private int startAngle;
    private int grade;

    public CasillaSemiCurva(int x, int y, int ancho, int alto,int startAngle, int grade, Color color, Graphics2D g2d) {
        super(x, y, ancho, alto, color, g2d);
        this.startAngle = startAngle;
        this.grade = grade;
    }
    
    

    public int getStartAngle() {
        return startAngle;
    }

    public void setStartAngle(int startAngle) {
        this.startAngle = startAngle;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    
    @Override
    public void dibujar(int x, int y, Graphics2D g2d) {
        g2d.setColor(color);
        g2d.drawArc(x, y, ancho, alto, startAngle, grade);
    }
    
}
