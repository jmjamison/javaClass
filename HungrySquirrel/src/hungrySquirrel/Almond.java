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
        symbol = "A";
    }
    @Override
    public void create ()
    {
        // generate nut
        name = "Almond";
        nutritionPoints = 5;
        
        
    }
    
    
}