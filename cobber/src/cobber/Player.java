/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobber;
import java.util.Arrays;
/**
 *
 * @author jerth
 */
public class Player {

    
    //fields
    private int x;
    private int y;
    //private double size;
    private int stepSize;
    public int numLives;
    
    // static constants for movement
    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    public static final int UP = 2;
    public static final int DOWN = 3;
    
    private Board b;
    
    
    
    
    // construct cob at location (x,y, and choose the board)
    public Player(int x, int y, Board board) {
        this.x = x;
        this.y = y;
        b= board;
        stepSize = 1;
        numLives = 2; //One Mistake
    }
    //static void draw() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }
    
    
    //Print the board on screen
    public String drawBoard() {
        int i=0;
        int j=0;
        
        String s="";
        
        for(i=0;i<b.getHeight();i++){
            for(j=0;j<b.getWidth();j++){
                if(i==y&&j==x){
                    //Choose the player "character" its literally a character
                    s+="X";
                }
                else{
                    s+=b.getBoard()[i][j];
                }
            }
            s+="\r\n";
        }
        return s;
    }
    
    // getter for x-coordinate
    public double getX() { return x; }
    
    // getter for y-coordinate
    public double getY() { return y; }
    
    
    public void move(int direction) {
        switch (direction) {
            case LEFT:  
                if (x > 0) 
                    //Check if its safe
                    if(b.checkIfValid(x-1, y))
                    {
                        x -= stepSize;
                            //Check if we won
                            if(b.checkIfWon(x, y)){
                                System.out.println("You did it, you WON!");
                                System.exit(0);
                            }
                    }
                    else {
                        //die
                        System.out.println("You fell in the water, and almost got eaten!");
                        numLives--;
                        System.out.println("Lose a Life! You have "+numLives+" lives left.");
                        if(numLives==0){
                            System.exit(0);
                        }
                    }
                break;
            case RIGHT: 
                if (x < 9)
                    //Check if its safe
                    if(b.checkIfValid(x+1, y))
                    {
                        x += stepSize;
                            //Check if we won
                            if(b.checkIfWon(x, y)){
                                System.out.println("You did it, you WON!");
                                System.exit(0);
                            }
                        }
                    else {
                        //die
                        System.out.println("You fell in the water, and almost got eaten!");
                        numLives--;
                        System.out.println("Lose a Life! You have "+numLives+" lives left.");
                        if(numLives==0){
                            System.exit(0);
                        }
                    }
                break;
            case UP:    
                if (y < 9)
                    //Check if its safe
                    if(b.checkIfValid(x, y+1))
                    {
                        y += stepSize;
                            //Check if we won
                            if(b.checkIfWon(x, y)){
                                System.out.println("You did it, you WON!");
                                System.exit(0);
                            }
                    }
                    else {
                        //die
                        System.out.println("You fell in the water, and almost got eaten!");
                        numLives--;
                        System.out.println("Lose a Life! You have "+numLives+" lives left.");
                        if(numLives==0){
                            System.exit(0);
                        }
                    }
                break;
            case DOWN:  
                if (y > 0)
                    //Check if its safe
                    if(b.checkIfValid(x, y-1))
                    {
                        y -= stepSize;
                            //Check if we won
                            if(b.checkIfWon(x, y)){
                                System.out.println("You did it, you WON!");
                                System.exit(0);
                            }
                    } 
                    else {
                        //die
                        System.out.println("You fell in the water, and almost got eaten!");
                        numLives--;
                        System.out.println("Lose a Life! You have "+numLives+" lives left.");
                        if(numLives==0){
                            System.exit(0);
                        }
                    }
                break;
        }
            
    }
    
    
}  