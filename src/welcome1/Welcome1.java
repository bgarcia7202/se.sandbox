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
import java.util.Scanner;

public class Welcome1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Main method begins execution of Java Application

        {
            System.out.print("Welcome to ");
            System.out.println("Java Programming... 1st modification");
            System.out.printf("%s\n%s\n", "Welcome to ", "Java Programming");

        //create a Scanner to obtain input from the command window
            Scanner input = new Scanner(System.in);
            int numberl; // first number to add
            int number2; //second number to add
            int sum; // sum of numberl and number2

            System.out.print("Enter first integer: "); // prompt
            numberl = input.nextInt(); // read first number from user

            System.out.print("Enter second integer: "); // prompt
            number2 = input.nextInt(); //read second number from user

            sum = numberl + number2; // add numbers, then store total in sum

            System.out.printf("Sum is %d\n", sum); // display sum

            if (numberl == number2) {
                System.out.printf("%d == %d\n", numberl, number2);
            }
            if (numberl != number2) {
                System.out.printf("%d ! = %d\n", numberl, number2);
            }

            if (numberl < number2) {
                System.out.printf("%d < %d\n", numberl, number2);
            }

            if (numberl > number2) {
                System.out.printf("%d > %d\n", numberl, number2);
            }

            if (numberl <= number2) {
                System.out.printf("%d <= %d\n", numberl, number2);
            }

            if (numberl >= number2) {
                System.out.printf("%d >= %d\n", numberl, number2);
            }

//            GradeBook myGradeBook = new GradeBook();
//
////call myGradeBook's displayMessage method
//            myGradeBook.displayMessage();

//        
      Animal a = new Animal(); // Animal reference and object
      Animal b = new Dog(); // Animal reference but Dog object
      Dog d = new Dog();

      a.move();// runs the method in Animal class

      b.move();//Runs the method in Dog class

//      d.move();
//      
//      a.barkAnimal();
//      
//      b.barkAnimal();
//      
//      d.bark();  
//      
//      d.barkAnimal();
      
      d.barkAnimal();
 
        }//End method main
    }

}
