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
        System.out.println("go fast\n");
    }
    
    public void goSlow()
    {
        // code here
        System.out.println("go slow\n");
    }   

    public void whereIsTheSail()
    {
        // code here
        System.out.println("Sail is up or down.");
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
