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
        
//        Integer.parseInt("5");
//        10.parseInt();
    }
    

}
