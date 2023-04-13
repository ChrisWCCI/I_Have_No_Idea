package virtual_pet;

import java.util.Scanner;

public class VirtualPetApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Create a new VirtualPet object
        VirtualPet pet = new VirtualPet("Fido");

        //Game loop
        while (true) {
            //Output pet status
            System.out.println("Name: " + pet.getName());
            System.out.println("Hunger: " + pet.getHungerLevel());
            System.out.println("Thirst: " + pet.getThirstLevel());
            System.out.println("Boredom: " + pet.getBoredomLevel());
            System.out.println();
            
            //Ask for user input
            System.out.println("What would you like to do?");
            System.out.println("1. Feed the pet");
            System.out.println("2. Give the pet some water");
            System.out.println("3. Play with the pet");
            System.out.println("4. Do nothing");
            int choice = scanner.nextInt();
            
            //Handle user input
            if (choice == 1) {
                pet.feed();
            } else if (choice == 2) {
                pet.water();
            } else if (choice == 3) {
                pet.play();
            } else {
                pet.confuse();
            }
            
            //Simulate the passage of time
            pet.tick();
        }
    }
}