/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobber;

import java.awt.Color;

/**
 *
 * @author jerth
 */
public class Tractors {

    private double x;
    private double y;
    private double size;
    private double dx;
    private Color color;

    
   
    public Tractors(double x, double y, double size, double dx) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.dx = dx;
        // choose a random color for the car
        color = new Color((float) Math.random(), 
                          (float) Math.random(), 
                          (float) Math.random());
    }
    
   
    public double getX() { return x; }
    
    public void move() {
        x += dx;
    }
        
    
    public void draw() {
        
    }
    
    

    public boolean detectImpact(Player f) {
        return false;
        
    }


}
