/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hungrySquirrel;

import static java.lang.System.out;

/**
 *
 * @author jmjamison
 */
public class Squirrel extends Entity implements Movable {
    
    // Squirel is represented by @ symbol in the maze
    // Squirrel moves up, down, left and right.
    // Initial location of the squirl is determined by the user
    // Program prompts the user to enter the starting row and column of the squril
    // Squirrel can't move over a wall (*) but cam move over a nut
    // When Squirrel moves over a nut, it eats the nut and collects or loses points
    
    // implements movable
    
    public static int pointsCollected;
    public static int totalNutsEaten;
    
    Squirrel () 
    {
        symbol = "@";
    }
    
    public void create()
    {
        // code to place squirrel
        
    }
    
    @Override
    public Entity put(int newRow, int newCol)
    {
        Maze.maze[newRow][newCol] = Squirrel.this;
        return null;
    }
    
    @Override
    public void move(char direction)
    {
        switch(direction)
        {
            case 'u':
            case 'U':
              System.out.println("Squirrel moves up.");  
              break;
            case 'd':
            case 'D':
              System.out.println("Squirrel moves down.");  
              break;
            case 'r':
            case 'R':
              System.out.println("Squirrel moves right.");  
              break;
            case 'l':
            case 'L':
              System.out.println("Squirrel moves left.");  
              break;
                
        }
        
        
       
            
            
        
    }
    
}
