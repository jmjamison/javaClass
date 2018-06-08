package hungrySquirrel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jmjamison
 */
abstract class Entity {
    
    String symbol;
    int row;
    int col;
       
    public void create()
    {
        //
    } 
    
    public Entity put(int newRow, int newCol)
    {
        this.row = row;
        this.col = col;
        return null;
    }
    
}
