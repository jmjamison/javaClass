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
public class Nut extends Entity {
    
    public static int totalNuts = 5;  // per game description
    public static int nutritionPoints;
    public static String name;
    
    Nut() {}
    
    @Override
    public void create ()
    {
        //
    }
    
    @Override
    public Entity put(int newRow, int newCol)
    {
        return null;
    }
    
}
