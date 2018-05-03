/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Project4:  Boat class: constructor and 3 methods: goFast, goSlow, wherIsTheSail
 * @author jmjamison
 */
public class Boat {
    
    /** protected private fields */
    private String name;
    private Boolean  sail;
    private float speed;
    
     /** constructor, initializes the object kind of like c++?  */
    Boat(String name)
    {
        this.name = name;
        speed = 0;
        sail = true;
    }
    
    /** methods */
    public void goFast()
    {
        // code here
        sail = true;
        speed = speed + 10;
        System.out.println(name + " is raising the sail at the speed of " + Math.round(speed) + " mph.\n");
    }
    
    public void goSlow()
    {
        // code here
        sail = false;
        speed = speed - 5;
        System.out.println(name + " is lowering the sail at the speed of " + Math.round(speed) + " mph.\n");
    }   

    /** sail is true/up
        sail is false/down */
    public void whereIsTheSail()
    {
        // code here
        if(sail)  // sail is ture/up
            System.out.println(name + " sail is up.\n");
        else   // sale is false/down
            System.out.println(name + " sail is down.\n");
    }
    
    /**  the public interface to the protected fields */
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setSail(boolean sail)
    {
        this.sail = sail;
    }
    
    public void setSpeed(float speed)
    {
        this.speed = speed;
    }
    
}
