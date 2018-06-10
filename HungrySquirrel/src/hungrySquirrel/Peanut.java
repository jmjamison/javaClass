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
    
    String symbol;
    int row;
    int col;
    
    int totalNuts;
    int nutritionPoints;
    String name;
    
    Peanut()
    {
        this.name = name;
        this.totalNuts = totalNuts;
        this.nutritionPoints = nutritionPoints;
        this.symbol = symbol;
        
        
    }

    @Override
    public void create ()
    {
        // generate nut
        name = "Peanut";
        nutritionPoints = 10;
        symbol = "P";
        
        
    }

    
}
 