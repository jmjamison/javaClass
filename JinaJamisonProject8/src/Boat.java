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
    private String boatName;
    private String boatCommand;
    private Boolean  sail;
    private int speed;
    private int degrees;
    private int minimumSpeed = 2;
    
     /** constructor, initializes the object kind of like c++?  */
    Boat(String name, String command)
    {
        this.boatName = name;        
        this.boatCommand = command;
        speed = 0;
        degrees = 0;
        sail = true;
        
        // Sea Monkey, power in
        //System.out.println(boatName + ", " + boatCommand);
        
        if (boatCommand.equals("power on"))
        {
            System.out.println(boatName + " is pointing in the direction of " + degrees + " degrees.");
        }
        else if (boatCommand.equals("power off"))
        {
            System.out.println(boatName + " is powered off.");
        }
        else if (boatCommand.equals("slow down"))
         //  decress boat speed by 2 mph to the minimum of 2mph
        {
            degrees = 5;
            
            if ((speed - 2)  > minimumSpeed)
            {   
                speed = speed - 2;

            }
            else
            {
                speed = minimumSpeed;
            }
            
            System.out.println(boatName + " is moving in a " + degrees + " degree angle at the speed of " + speed + " mph.");
        }
        else if (boatCommand.equals("speed up"))
         //  decress boat speed by 2 mph to the minimum of 2mph
        {
            degrees = 5;
            speed = speed + minimumSpeed;
            
            System.out.println(boatName + " is moving in a " + degrees + " degree angle at the speed of " + speed + " mph.");
        }
        else if (boatCommand.equals("turn left"))
        {
            degrees = 5;
            System.out.println(boatName + " is moving in a " + degrees + " degree angle.");
        }
        else if (boatCommand.equals("turn right"))
        {
            degrees = 5;
            System.out.println(boatName + " is moving in a " + degrees + " degree angle.");
        }
    }
    
}   