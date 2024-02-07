 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package example;

import java.util.Random;
import tiktaktoe.Grid;

/**
 *
 * @author celeb
 */
public class example extends Grid {
    Grid grid = new Grid();
    
    Random r = new Random();
    
    public void random() {
        System.out.println(r.nextInt(100));
        
        // Random int between 23 and 150?
        int start = 23;
        int end = 150;
        
        // 0-> bound  // 23 -> bound + 23
//        r.nextInt() + start;
        System.out.println(r.nextInt(end-start) + start);
        
        
        
    }
}
