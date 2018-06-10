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
    
    //
    String symbol;
    int row;
    int col;
    
    int totalNuts;
    int nutritionPoints;
    String name;
    
    PoisonousCashew()
    {
        this.name = name;
        this.totalNuts = totalNuts;
        this.nutritionPoints = nutritionPoints;
        this.symbol = symbol;
        
        name = "PoisonousCashew";
        nutritionPoints = -15;
        symbol = "C";
    }
    
    @Override
    public void create ()
    {
        // generate nut
        name = "PoisonousCashew";
        nutritionPoints = -15;
        symbol = "C";
        
        
    }
    
}
