/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package welcome1;

/**
 *
 * @author bgarcia
 */
class Dog extends Animal{
    public void move(){
        super.move(); // invokes the super class method
      System.out.println("Dogs can walk and run");
   }
   public void bark(){
      System.out.println("Dogs can bark");
   }
   
     public void barkAnimal(){
         super.barkAnimal();
      System.out.println("Dogs can barkAnimal");
   }
}
