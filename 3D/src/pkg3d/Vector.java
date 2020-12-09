/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3d;

/**
 *
 * @author qianyang
 */
public class Vector {
    double x= 0,y= 0,z= 0;
    public Vector(double x , double y, double z)
    {
        double Length = Math.sqrt(x*x+ y*y +z*z);
        if (Length>0)
        {    
        this.x = x/Length;
        this.y = y/Length;
        this.z = z/Length;
        }
    }
    
    Vector CrossProduct(Vector V)
    {
      Vector CrossVector = new Vector(
              y*V.z - z*V.y,
              z*V.x - x*V.z,
              x*V.y - y*V.x
      );
      return CrossVector;
    
    }
    
}
