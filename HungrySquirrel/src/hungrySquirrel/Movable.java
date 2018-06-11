/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hungrySquirrel;

/**
 *  Movable interface declares a single method and is implemented by entities that can move in the maze 
 *      Note:  used by the Squirrel
 * @author jmjamison
 */
public interface Movable 
{
    
    void move(char direction);
    
}
