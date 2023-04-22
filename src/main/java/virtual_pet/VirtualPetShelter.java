package virtual_pet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VirtualPetShelter {

    private Map<String, VirtualPet> pets = new HashMap<>();

    /**
     * Adds a new pet to the shelter.
     *
     * @param pet The VirtualPet object to be added.
     */
    public void admit(VirtualPet pet) {
        pets.put(pet.getName(), pet);
    }

    /**
     * Returns the VirtualPet object with the given name.
     *
     * @param name The name of the VirtualPet object to be retrieved.
     * @return The VirtualPet object with the given name.
     */
    public VirtualPet getPet(String name) {
        return pets.get(name);
    }

    /**
     * Returns a list of all the VirtualPet objects in the shelter.
     *
     * @return A list of all the VirtualPet objects in the shelter.
     */
    public List<VirtualPet> getAllPets() {
        return new ArrayList<>(pets.values());
    }

    /**
     * Removes the VirtualPet object with the given name from the shelter.
     *
     * @param name The name of the VirtualPet object to be removed.
     * @return The VirtualPet object that was removed from the shelter.
     */
    public VirtualPet adopt(String name) {
        return pets.remove(name);
    }

    /**
     * Calls the feed() method on all VirtualPet objects in the shelter.
     */
    public void feedAllPets() {
        for (VirtualPet pet : pets.values()) {
            pet.feed();
        }
    }

    /**
     * Calls the water() method on all VirtualPet objects in the shelter.
     */
    public void waterAllPets() {
        for (VirtualPet pet : pets.values()) {
            pet.water();
        }
    }

    /**
     * Calls the play() method on all VirtualPet objects in the shelter.
     */
    public void playWithAllPets() {
        for (VirtualPet pet : pets.values()) {
            pet.play();
        }
    }

    /**
     * Calls the tick() method on all VirtualPet objects in the shelter.
     */
    public void tickAllPets() {
        for (VirtualPet pet : pets.values()) {
            pet.tick();
        }
    }

    /**
     * Handler for invalid user entry
     */
    public void confuseAllPets() {
        System.out.println("The pets look at you confused...");
        this.tickAllPets();
    }

    /**
     * Print out the written text
     * status for all the pets.
     */
    public void printAllStatuses() {
        System.out.println("All pets' status:");
        System.out.println("Name\t|Hunger\t|Thirst\t|Boredom");
        System.out.println("---------------------------------------");
        for (VirtualPet pet : pets.values()) {
            System.out.println(pet.getName() + "\t|" + pet.getHungerLevel() + "\t|"
                    + pet.getThirstLevel() + "\t|" + pet.getBoredomLevel());
        }
        System.out.println();
    }
}
