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
    private float speed;
    private int degrees;
    
     /** constructor, initializes the object kind of like c++?  */
    Boat(String name, String command)
    {
        this.boatName = name;        
        this.boatCommand = command;
        speed = 0;
        degrees = 0;
        sail = true;
        
        System.out.println(boatName + ", " + boatCommand);
        
        if (boatCommand.equals("power on"))
        {
            System.out.println(boatName + " is pointing in the direction of " + degrees + " degrees.");
        }
        else if (boatCommand.equals("power off"))
        {
            System.out.println(boatName + " is powered off.");
        }
        else if (boatCommand.equals("slow down"))
        {
            System.out.println(boatName + " is powered off.");
        }
        else if (boatCommand.equals("turn left"))
        {
            degrees = degrees + 10;
            speed = speed + 10;
            System.out.println(boatName + " is powered off.");
        }
        else if (boatCommand.equals("turn right"))
        {
            System.out.println(boatName + " is powered off.");
        }
    }
    
}   