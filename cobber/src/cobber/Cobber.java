/*
 *
 */
package cobber;
//import java.awt.event.KeyEvent;import java.awt.event.KeyListener;

/**
 *
 * @author jerth
 */
public class Cobber {
    /**
     * @param args the command line arguments
     */

    
    
    
    
    
    public static void main(String[] args) {
       
        //Create new instances
        Board b= new Board(10,10);
        Player p= new Player(0,0,b);
        
        
        //while(p.numLives>0){
        
        
        p.drawBoard();
        
        
       
        }
        
        
        
}

    
    
    
    
    
    /*
    boolean keys[] = new boolean[256];


    public void keyPressed(KeyEvent e) {
        keys[e.getKeyCode()] = true;
    }

    public void keyReleased(KeyEvent e) {
        keys[e.getKeyCode()] = false;
    }

    public void keyTyped(KeyEvent e) {
        
    }
    
    public void update() {
        if(keys[KeyEvent.VK_ENTER]){
            
        }
        
        
        if(keys[KeyEvent.VK_W] || keys[KeyEvent.VK_UP]){
             p.move(p.UP);
        }

        if(keys[KeyEvent.VK_S] || keys[KeyEvent.VK_DOWN]){
             p.move(p.DOWN);
        }

        if(keys[KeyEvent.VK_A] || keys[KeyEvent.VK_LEFT]){
            p.move(p.LEFT);
        }

        if(keys[KeyEvent.VK_D] || keys[KeyEvent.VK_RIGHT]){
             p.move(p.RIGHT);
        }
    }
    

}




// TODO code application logic here
        
        /**
        System.out.println("Start Screen");
        System.out.println("Welcome to Crossy Cobber!");
        System.out.println("Press Enter to continue.");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        System.out.println("Instructions Screen");
        System.out.println("Use the  Arrow Keys, or WASD, to move.");
        System.out.println("Try to get to the other side without getting hit.");
        System.out.println("Press Enter to continue.");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        
        System.out.println("Game Screen");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        //if(you win)
        System.out.println("Win Screen");
        System.out.println("Congratulations, you Win!");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        //Else
        System.out.println("Lose Screen");
        System.out.println("You Lose, Try again!");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        */
        