package virtual_pet;

import java.util.Scanner;

public class VirtualPetApp {

    public static void main(String[] args) {
        VirtualPetShelter shelter = new VirtualPetShelter();

        Scanner scanner = new Scanner(System.in);

        // Create and admit pets
        VirtualPet pet1 = new VirtualPet("Fido");
        VirtualPet pet2 = new VirtualPet("Fluffy");
        shelter.admit(pet1);
        shelter.admit(pet2);

        // Game loop
        while (true) {
            // Output pet status
            shelter.printAllStatuses();

            // Ask for user input
            System.out.println("What would you like to do?");
            System.out.println("1. Feed the pets");
            System.out.println("2. Give the pets some water");
            System.out.println("3. Play with the pets");
            System.out.println("4. Adopt a pet");
            System.out.println("5. Admit a pet");
            System.out.println("6. Do nothing");
            System.out.println("7. Exit");
            int choice = scanner.nextInt();

            // Handle user input
            if (choice == 1) {
                shelter.feedAllPets();
            } else if (choice == 2) {
                shelter.waterAllPets();
            } else if (choice == 3) {
                shelter.playWithAllPets();
            } else if (choice == 4) {
                System.out.println("Which pet would you like to adopt?");
                for (VirtualPet pet : shelter.getAllPets()) {
                    System.out.println(pet.getName());
                }
                String petToAdopt = scanner.nextLine();
                if (shelter.adopt(petToAdopt) != null) {
                    System.out.println("Enjoy your new pet!");
                } else {
                    System.out.println(
                            "Uhh " + petToAdopt + " was either already adopted or was never here... or ran away...");
                }
            } else if (choice == 5) {
                System.out.println("What is the name of the pet you want to admit?");
                shelter.admit(new VirtualPet(scanner.nextLine()));
            } else if (choice == 6) {
                shelter.confuseAllPets();
            } else if (choice == 7) {
                break;
            } else {
                shelter.confuseAllPets();
            }

            // Simulate the passage of time
            shelter.tickAllPets();
        }

        scanner.close();
    }
}
