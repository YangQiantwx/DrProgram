/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobber;

import java.util.ArrayList;

/**
 *
 * @author jerth
 */


public class Board { 
 

      // fields
    private int direction;  // LEFT or RIGHT
    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    
   
    
    public Board(int width, int height){
        Board = new int[height][width];
        this.width=width;
        this.height=height;
        int i=0;
        int j=0;
        for(i=0;i<height;i++){
            for(j=0;j<width;j++){
                Board[i][j]=0;
            }}
        
        fillBoard();
    }
    private int[][] Board;
    private int width;
    private int height;
    
    public int[][] getBoard(){
        return Board;
    }
    
    public int getWidth(){
        return width;
    }
    
    public int getHeight(){
        return height;
    }
    
     public void fillBoard(){
         int h=1;
         int w=1;
         Board[0][0]=1;
         Board[0][1]=1;
         Board[1][0]=1;
         Board[9][0]=9;
         Board[9][1]=9;
         Board[9][2]=9;
         Board[9][3]=9;
         Board[9][4]=9;
         Board[9][5]=9;
         Board[9][6]=9;
         Board[9][7]=9;
         Board[9][8]=9;
         Board[9][9]=9;
         
         
         //Randomly Choose 1 of 10 boards
         
         //int random=7; //to check each board" 
         int random = (int) (Math.random() * 10 + 1); //to "choose" the board
         
         if(random==1){
            Board[1][2]=1;
            Board[2][2]=1;
            Board[3][2]=1;
            Board[4][2]=1;
            Board[4][1]=1;
            Board[4][0]=1;
            Board[5][0]=1;
            Board[5][1]=1;
            Board[5][2]=1;
            Board[5][3]=1;
            Board[5][4]=1;
            Board[6][4]=1;
            Board[6][5]=1;
            Board[7][5]=1;
            Board[7][6]=1;
            Board[7][7]=1;
            Board[8][7]=1;
         }
         if(random==2){
            Board[1][1]=1;
            Board[2][1]=1;
            Board[2][2]=1;
            Board[3][2]=1;
            Board[4][2]=1;
            Board[4][3]=1;
            Board[4][4]=1;
            Board[5][4]=1;
            Board[5][5]=1;
            Board[5][6]=1;
            Board[5][7]=1;
            Board[4][7]=1;
            Board[4][8]=1;
            Board[4][9]=1;
            Board[5][9]=1;
            Board[6][9]=1;
            Board[7][9]=1;
            Board[7][8]=1;
            Board[7][7]=1;
            Board[8][7]=1;
         }
         if(random==3){
            Board[0][2]=1;
            Board[0][3]=1;
            Board[1][3]=1;
            Board[2][3]=1;
            Board[3][2]=1;
            Board[4][2]=1;
            Board[5][2]=1;
            Board[5][3]=1;
            Board[5][4]=1;
            Board[6][4]=1;
            Board[7][4]=1;
            Board[7][3]=1;
            Board[7][2]=1;
            Board[8][2]=1;
            Board[3][3]=1;
            Board[3][4]=1;
            Board[3][5]=1;
            Board[3][6]=1;
            Board[4][6]=1;
            Board[5][6]=1;
            Board[5][7]=1;
         }
         if(random==4){
            Board[1][1]=1;
            Board[1][2]=1;
            Board[1][3]=1;
            Board[1][4]=1;
            Board[1][5]=1;
            Board[2][5]=1;
            Board[3][5]=1;
            Board[4][5]=1;
            Board[4][6]=1;
            Board[5][6]=1;
            Board[5][7]=1;
            Board[5][8]=1;
            Board[5][9]=1;
            Board[6][9]=1;
            Board[7][9]=1;
            Board[7][8]=1;
            Board[7][7]=1;
            Board[7][6]=1;
            Board[6][6]=1;
            Board[8][9]=1;
         }
         if(random==5){
            Board[0][2]=1;
            Board[0][3]=1;
            Board[0][4]=1;
            Board[0][5]=1;
            Board[1][5]=1;
            Board[2][5]=1;
            Board[2][6]=1;
            Board[1][6]=1;
            Board[1][7]=1;
            Board[2][7]=1;
            Board[3][7]=1;
            Board[4][7]=1;
            Board[4][8]=1;
            Board[4][9]=1;
            Board[5][9]=1;
            Board[6][9]=1;
            Board[6][8]=1;
            Board[6][7]=1;
            Board[7][7]=1;
            Board[8][7]=1;
         }
         if(random==6){
            Board[0][2]=1;
            Board[0][3]=1;
            Board[0][4]=1;
            Board[0][5]=1;
            Board[0][6]=1;
            Board[0][7]=1;
            Board[0][8]=1;
            Board[1][8]=1;
            Board[1][9]=1;
            Board[2][9]=1;
            Board[3][9]=1;
            Board[4][9]=1;
            Board[4][8]=1;
            Board[4][7]=1;
            Board[5][7]=1;
            Board[5][6]=1;
            Board[6][6]=1;
            Board[7][6]=1;
            Board[8][6]=1;
            Board[8][7]=1;
         }
         if(random==7){
             //Lucky #7
             //9s on the right
            Board[9][0]=0;
            Board[9][1]=0;
            Board[9][2]=0;
            Board[9][3]=0;
            Board[9][4]=0;
            Board[9][5]=0;
            Board[9][6]=0;
            Board[9][7]=0;
            Board[9][8]=0;
            Board[0][9]=9;
            Board[1][9]=9;
            Board[2][9]=9;
            Board[3][9]=9;
            Board[4][9]=9;
            Board[5][9]=9;
            Board[6][9]=9;
            Board[7][9]=9;
            Board[8][9]=9;
            Board[9][9]=9;
            
            //Actual Path
            Board[0][2]=1;
            Board[0][3]=1;
            Board[0][4]=1;
            Board[0][5]=1;
            Board[0][6]=1;
            Board[0][7]=1;
            Board[0][8]=1;
            
            //Actual Fake Path
            Board[1][0]=1;
            Board[2][0]=1;
            Board[3][0]=1;
            Board[4][0]=1;
            Board[5][0]=1;
            Board[6][0]=1;
            Board[7][0]=1;
            Board[8][0]=1;
            Board[9][0]=1;
         }
         if(random==8){
            Board[1][1]=1;
            Board[2][1]=1;
            Board[2][2]=1;
            Board[3][2]=1;
            Board[3][3]=1;
            Board[4][3]=1;
            Board[4][4]=1;
            Board[5][4]=1;
            Board[5][5]=1;
            Board[5][6]=1;
            Board[6][6]=1;
            Board[6][7]=1;
            Board[7][7]=1;
            Board[7][6]=1;
            Board[7][5]=1;
            Board[7][4]=1;
            Board[8][4]=1;
         }
         if(random==9){
            Board[1][1]=1;
            Board[1][2]=1;
            Board[2][2]=1;
            Board[3][2]=1;
            Board[4][2]=1;
            Board[4][1]=1;
            Board[4][0]=1;
            Board[5][0]=1;
            Board[6][0]=1;
            Board[6][1]=1;
            Board[6][2]=1;
            Board[6][3]=1;
            Board[6][4]=1;
            Board[7][4]=1;
            Board[7][5]=1;
            Board[7][6]=1;
            Board[8][6]=1;
         }
         if(random==10){
            Board[1][0]=1;
            Board[2][0]=1;
            Board[3][0]=1;
            Board[4][0]=1;
            Board[5][0]=1;
            Board[5][1]=1;
            Board[6][1]=1;
            Board[7][1]=1;
            Board[7][2]=1;
            Board[8][2]=1;
         }
         
         //A Random Board Generator that doesn't work. 
         
         /*while(h<8){
         double random = Math.random() * 1 + 1;
         if(random==1){
            h++;
            Board[h][w]=1;
         }
         if(random==2){
            double random2 = Math.random() * 1 + 1;
            if(random2==1){
            while(h>0){
            h--;
            Board[h][w]=1;
            }
         }
            if(random2==2){
            while(h<9){
            w++;
            Board[h][w]=1;
            }
         }
         }
        }*/
     }
    
    public boolean checkIfValid(int x, int y) {
    if(Board[y][x]==0){
        return false;
        
    }
    else{
        return true;
    }
    
}
    public boolean checkIfWon(int x, int y) {
        if(Board[y][x]==9){
        return true;
        }
        else {
            return false;
        }
    }
    
    
    //Spare Frogger Code for Generation
    
    
    /*
    // draw the lane, including all cars
    public void draw() {
        // draw all cars in lane
        for (int i = 0; i < tractors.size(); i++) {
            Tractors t = tractors.get(i);
            t.draw();
        }
    }
    
    // step cars in all lane
    public void step() {
        
        // add new cars with some probability
        if (generateNewTractors && Math.random() < 0.05) {
            
            double x = 0, dx = 0;
            if (direction == LEFT) {
                x = 1.2;
                dx = -speed;
            } else {
                x = -0.2;
                dx = speed;
            }
            
            Tractors t = new Tractors(x, yPosition, width / 2, dx);
            tractors.add(t);
        }
        
        // move all cars
        for (int i = 0; i < tractors.size(); i++) {
            Tractors c = tractors.get(i);
            c.move();
            if (c.getX() < -0.5 || c.getX() > 1.5) {
                tractors.remove(i);
                i--;
            }
        }
       
        // switch lane direction
        if (Math.random() < 0.01) {
            // switch direction
            direction = (direction + 1) % 2;
            generateNewTractors = false;  // temporarily disable new cars
        }
        
        // test to see if it is ok to resume car generation
        if (tractors.isEmpty()) {
            generateNewTractors = true;
        }
    }
    
    // detect impacts with the given frog
    public boolean detectImpact(Player f) {
        for (int i = 0; i < tractors.size(); i++) {
            Tractors c = tractors.get(i);
            if (c.detectImpact(f)) return true;
        }
        return false;
    }
    */
        
}