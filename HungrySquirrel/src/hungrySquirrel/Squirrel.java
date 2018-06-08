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
public class Squirrel extends Entity {
    
    // Squirel is represented by @ symbol in the maze
    // Squirrel moves up, down, left and right.
    // Initial location of the squirl is determined by the user
    // Program prompts the user to enter the starting row and column of the squril
    // Squirrel can't move over a wall (*) but cam move over a nut
    // When Squirrel moves over a nut, it eats the nut and collects or loses points
    
    // implements movable
    
    int pointsCollected;
    int totalNutsEaten;
    
    public void create()
    {
        //
    }
    
    public void move(char direction)
    {
        //u
    }
    
}
