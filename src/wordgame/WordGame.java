package wordgame;

import java.util.Scanner;

/**
 * Author: Jesus Arias
 * GitHub username: ariasje1
 * Date: 09/02/2024
 * Description: This program plays a word game with the user. It prompts the user to enter
 * various pieces of information and then uses that information to generate a 
 * fun story. The program uses the Scanner class for input and displays the 
 * story in the console.
 */
public class WordGame {

    public static void main(String[] args) {
        // Declare variables to store user input
        String name;        // His or her name
        int age;            // His or her age
        String city;        // The name of a city
        String college;     // The name of a college
        String profession;  // A profession
        String animal_type; // A type of animal
        String pet_name;    // A pet's name
        
        // Create a Scanner object to read input from the user
        Scanner keyboard = new Scanner(System.in);
        
        // Get the user's name
        System.out.println("Enter your name.");
        name = keyboard.nextLine();
        
        // Get the user's age
        System.out.print("Enter your age.");
        age = keyboard.nextInt();  // Read the age as an integer
        keyboard.nextLine();  // Consume the remaining newline character
        
        // Get the name of the city the user lives in
        System.out.print("Enter the city you live in.");
        city = keyboard.nextLine();
        
        // Get the name of the college the user attended
        System.out.print("Enter the college you went to.");
        college = keyboard.nextLine();
        
        // Get the name of the user's profession
        System.out.print("Enter your profession.");
        profession = keyboard.nextLine();
        
        // Get the type of animal the user adopted
        System.out.print("Enter the type of animal you adopted.");
        animal_type = keyboard.nextLine();
        
        // Get the name of the user's pet
        System.out.print("Enter the pet's name.");
        pet_name = keyboard.nextLine();
        
        // Create the story using the user's input
        System.out.print("There once was a person named " +
                             name + " who lived in " + city + ".\nAt the age of " +
                             age + ", " + name + " went to college at " + college +
                             ".\n" + name + " graduated and went to work as a " +
                             profession + ".\nThen " + name + " adopted a(n) " +
                             animal_type + " named " + pet_name +
                             ".\nThey both lived happily ever after.");
    }
}
