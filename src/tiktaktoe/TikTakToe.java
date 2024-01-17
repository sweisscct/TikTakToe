/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiktaktoe;

/**
 *
 * @author celeb
 */
public class TikTakToe {
    
    public static String[][] setupGridArray() {
        String[][] gridArray = new String[3][5];
        gridArray[0][0] = "_";
        gridArray[0][1] = "|";
        gridArray[0][2] = "_";
        gridArray[0][3] = "|";
        gridArray[0][4] = "_";
        
        gridArray[1][0] = "_";
        gridArray[1][1] = "|";
        gridArray[1][2] = "_";
        gridArray[1][3] = "|";
        gridArray[1][4] = "_";

        gridArray[2][0] = " ";
        gridArray[2][1] = "|";
        gridArray[2][2] = " ";
        gridArray[2][3] = "|";
        gridArray[2][4] = " ";  
        
        return gridArray;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] gridArray = setupGridArray();
        displayGrid(gridArray);
        updateGrid(gridArray, new int[] {0, 0}, "X");
        displayGrid(gridArray);
        updateGrid(gridArray, new int[] {1, 2}, "O");
        displayGrid(gridArray);
        
    }
    
    public static void displayGrid(String[][] gridArray) {
        for (int row=0; row<gridArray.length; row++) {
            for (int col=0; col< gridArray[row].length; col++) {
                System.out.print(gridArray[row][col]);
            }
            System.out.println("");
        }
    }
    
    public static void updateGrid(String[][] gridArray, int[] position, String letter) {
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
}
