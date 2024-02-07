/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiktaktoe;

import example.example;

/**
 * 
 * 
 * GitHub Repo: 
 *
 * @author celeb
 */
public class TikTakToe {
    // This belongs to the class itself and objects cannot change it
    public static int otherNumber = 5;
    
    // Each instance of the class gets its own copy independant from all the others
    public int nonStaticNumber = 10;

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        example ex = new example();
        
        ex.random();
    
//        System.out.println(otherNumber);
        // If we want to use number in the scope of the main method, we have to declare it outside the block {}
        int number;
        {
            // Just local scope - only valid inside the {}
//            int number = 5; 
            number = 5;
        }
        
        System.out.println(number);
        
        /*
        
        */
        
        Grid grid = new Grid();
        
        
        
//        if (grid.isActive()) {
//            
//        }
        
        grid.displayGrid();
        grid.updateGrid(new int[] {0, 0}, "X");
        grid.displayGrid();
        grid.updateGrid(new int[] {1, 2}, "O");
        grid.displayGrid();
        
//        Integer.parseInt("5");
//        10.parseInt();
    }
    

}
