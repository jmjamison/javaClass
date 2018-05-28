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
public class Dog extends Animal{
    
    // concrete class
    
    // constructor
    Dog(String name)
    {
        super(name);
    }
    
    // override
    @Override
    void sound()
    {
        System.out.println(name + " sound woof ... woof");
    }
    
    @Override
    void feed()
    {
        System.out.println(name + " likes bacon.");
    }
    
}
