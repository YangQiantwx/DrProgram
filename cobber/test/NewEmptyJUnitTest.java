/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import cobber.Player;
import cobber.Tractors;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jerth
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    
    @Test
    public void getX(){
        Player p=new Player(0,0);
        assertEquals(0,p.getX());
    }
    @Test
    public void getY(){
        Player p=new Player(0,0);
        assertEquals(0,p.getY());
    }
    @Test
    public void detectImpact(){
        Tractors t=new Tractors(.8,0,.01,1);
        assertEquals(0,t.move());
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
