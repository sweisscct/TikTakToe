/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiktaktoe;

/**
 *
 * @author celeb
 */
public class Grid {
    
    private boolean active;

    public boolean isActive() {
        return active;
    }
    
    private int height;
    private int width;
    
    
    
    
    
    
    private String[][] gridArray;

    public Grid() {
        this.height = 3;
        this.width = 3;
        gridArray = setupGridArray();
    }

    public Grid(int height, int width) {
        this.height = height;
        this.width = width;
        gridArray = setupGridArray();
    }

    public void displayGrid() {
        for (int row=0; row<gridArray.length; row++) {
            for (int col=0; col< gridArray[row].length; col++) {
                System.out.print(gridArray[row][col]);
            }
            System.out.println("");
            // Getting otherNumber directly from the TikTakToe class.
            System.out.println("Class: " + TikTakToe.otherNumber);
            TikTakToe game = new TikTakToe();
            System.out.println("Game 1 og: " + game.nonStaticNumber);
            game.nonStaticNumber = 20;
            System.out.println("Game 1 new: " + game.nonStaticNumber);
            TikTakToe game2 = new TikTakToe();
            System.out.println("Game 2: " + game2.nonStaticNumber);
        }
    }
    
    public void updateGrid(int[] position, String letter) {
        // Position is 3x3
        // position = {2, 0}
        gridArray[position[0]][2*position[1]] = letter; // only even cols -  use 2*n+1 for only odd cols
        /*
        position
        0 1 2
        0 1 2
        0 1 2
        
        grid
        x|x|x|
        012345
           
        */
    }
    
    private String[][] setupGridArray() {
        // Makes it the thrid odd number
        String[][] gridArray = new String[height][2*width-1]; 
        
        for (int row = 0; row < gridArray.length; row++) {
            for (int col = 0; col < gridArray[row].length; col++) {
                // if col is odd
                if (col%2==1) {
                    gridArray[row][col] = "|";
                    // if not last row
                } else if (row < gridArray.length-1) {
                    gridArray[row][col] = "_";
                } else {
                    gridArray[row][col] = " ";
                }
            }
        }
//        gridArray[0][0] = "_";
//        gridArray[0][1] = "|";
//        gridArray[0][2] = "_";
//        gridArray[0][3] = "|";
//        gridArray[0][4] = "_";
//        
//        gridArray[1][0] = "_";
//        gridArray[1][1] = "|";
//        gridArray[1][2] = "_";
//        gridArray[1][3] = "|";
//        gridArray[1][4] = "_";
//
//        gridArray[2][0] = " ";
//        gridArray[2][1] = "|";
//        gridArray[2][2] = " ";
//        gridArray[2][3] = "|";
//        gridArray[2][4] = " ";  
        
        return gridArray;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Trying to set the grid width to a negative number");
        }
    }
    
    public void incrementHeight() {
        height++;
    }
    

    public String[][] getGridArray() {
        return gridArray;
    }
}
