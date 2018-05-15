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
public class Main {
    public static void main(String[] args)
    {
        Dog cho = new Dog("Cho");
        
        cho.sound();
        cho.feed();
        
        Cat cookie = new Cat("Cookie");
        
        cookie.sound();
        cookie.feed();
        
        System.out.println("\n\nPolymorphism example:\n");
        // polymorphism example
        Animal[] pets = { new Dog("Cho"),
                            new Cat("Cookie"),
                            new Dog("Sam"),
                            new Cat("PoohBear")
                        };
        for (int i = 0; i < pets.length; i++)
        {
            pets[i].sound();
            pets[i].feed();
        }
    }
    
}
