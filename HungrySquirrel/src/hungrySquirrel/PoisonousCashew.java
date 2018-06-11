/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hungrySquirrel;

/**
 *
 * @author jmjamison
 */
public class PoisonousCashew extends Nut {
    
    PoisonousCashew()
    {
        
        symbol = "%";
    }
    
    //
    
    @Override
    public void create ()
    {
        // generate nut
        name = "PoisonousCashew";
        nutritionPoints = -15;
        
        
    }
    @Override
    public Entity put(int newRow, int newCol)
    {
        Maze.maze[newRow][newCol] = PoisonousCashew.this;
        return null;
    }
    
}
