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
    
    // fields
    private String name:
    private Boolean  sail;
    private float speed;
    
    //  constructor
    Boat(String name)
    {
        this.name = name;
        speed = 0;
        sail = True;
    }
    
    //methods
    public void goFast()
    {
        // code here
    }
    
    public void goSlow()
    {
        // code here
    }   

    public void whereIsTheSail()
    {
        // code here
    }
    
    // constructor
    public setName(String name)
    {
        this.name = name;
    }
    
    public setSail(boolean sail)
    {
        this.sail = sail;
    }
    
    public setSpeed(float speed)
    {
        this.speed = speed;
    }
    
}
