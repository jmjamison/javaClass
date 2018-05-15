/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet;

/**
 *
 * @author jamie
 */
public abstract class Animal {
    String name;
    
    Animal (String name)
    {
        this.name = name;
    }
    
    
    abstract void sound();
    abstract void feed();
    
}
