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
public class Almond  extends Nut {
    
    Almond()
    {
        //
        symbol = "A";
        name = "Almond";
        nutritionPoints = 5;
    }
    @Override
    public void create ()
    {
        // generate nut
        
        
    }
    @Override
    public Entity put(int newRow, int newCol)
    {
        Maze.maze[newRow][newCol] = Almond.this;
        return null;
    }
    
    
}
