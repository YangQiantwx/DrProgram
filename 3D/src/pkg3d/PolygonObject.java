/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3d;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

/**
 *
 * @author qianyang
 */
public class PolygonObject {
    Polygon P;
    Color c;
    double AvgDist = 0; 
    
    
    public PolygonObject(double[] x, double[] y, Color c)
    {
        Screen.NumberOfPolygons++;
         P = new Polygon();
         for(int i = 0; i<x.length; i++)
             P.addPoint((int)x[i], (int)y[i]);

         this.c = c;
    
    }
    
    void drawPolygon(Graphics g)
    {
       g.setColor(c);
       g.fillPolygon(P);
       g.setColor(Color.black);
       g.drawPolygon(P);
       
    }


}
