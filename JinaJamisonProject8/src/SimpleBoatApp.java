
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jmjamison
 */
public class SimpleBoatApp {
    public static void main(String[] args) throws IOException
    {
        boatList.readBoatList();
        
        Boat simpleBoat = new Boat("Destiny");
        
        simpleBoat.goFast();
        
        simpleBoat.goSlow();
        
        simpleBoat.whereIsTheSail();
        
        simpleBoat.goFast();
        
        simpleBoat.whereIsTheSail();
        
        simpleBoat.goFast();
        
    }
    
}
