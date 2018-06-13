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
        
        symbol = "C";
        name = "PoisonousCashew";
        nutritionPoints = -15;
        // if I'm adding Poisonous Cashews I will need to add them to the total.
        Nut.totalNuts =+ 5;
        
    }
    
    //
    
    @Override
    public void create ()
    {
        // generate nut
        
        
    }
    @Override
    public Entity put(int newRow, int newCol)
    {
        Maze.maze[newRow][newCol] = PoisonousCashew.this;
        return null;
    }
    
}
