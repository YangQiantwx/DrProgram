/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3d;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author qianyang
 */
public class DDD extends JFrame{
    
    static Dimension ScreenSize = Toolkit.getDefaultToolkit().getScreenSize();
    public static JFrame F = new DDD();
    Screen ScreenObject = new Screen();
    
    
    
    
    public DDD()
    {
        add(ScreenObject);
        setUndecorated(true);
        setSize(ScreenSize);
        setVisible(true);
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
