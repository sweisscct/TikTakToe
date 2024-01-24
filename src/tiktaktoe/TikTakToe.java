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
        
        Grid grid = new Grid();
        
        grid.displayGrid();
        grid.updateGrid(new int[] {0, 0}, "X");
        grid.displayGrid();
        grid.updateGrid(new int[] {1, 2}, "O");
        grid.displayGrid();
        
//        Integer.parseInt("5");
//        10.parseInt();
    }
    

}
