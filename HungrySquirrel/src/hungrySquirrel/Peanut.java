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
public class Peanut extends Nut {
    
    Peanut()
    {
        symbol = "P";
        
    }
    
    @Override
    public void create ()
    {
        // generate nut
        name = "Peanut";
        nutritionPoints = 10;
        
    }
    
}
 