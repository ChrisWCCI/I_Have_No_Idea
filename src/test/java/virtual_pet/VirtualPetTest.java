package virtual_pet;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VirtualPetTest {

    @Test
    public void testFeed() {
        VirtualPet pet = new VirtualPet("Fido");
        int initialHungerLevel = pet.getHungerLevel();
        pet.feed();
        int newHungerLevel = pet.getHungerLevel();
        assertTrue(newHungerLevel < initialHungerLevel);
    }

    @Test
    public void testWater() {
        VirtualPet pet = new VirtualPet("Fido");
        int initialThirstLevel = pet.getThirstLevel();
        pet.water();
        int newThirstLevel = pet.getThirstLevel();
        assertTrue(newThirstLevel < initialThirstLevel);
    }

    @Test
    public void testPlay() {
        VirtualPet pet = new VirtualPet("Fido");
        int initialHungerLevel = pet.getHungerLevel();
        int initialThirstLevel = pet.getThirstLevel();
        pet.play();
        int newHungerLevel = pet.getHungerLevel();
        int newThirstLevel = pet.getThirstLevel();
        assertTrue(newHungerLevel <= initialHungerLevel && newHungerLevel >= initialHungerLevel - 5);
        assertTrue(newThirstLevel <= initialThirstLevel && newThirstLevel >= initialThirstLevel - 5);
    }

    @Test
    public void testTick() {
        VirtualPet pet = new VirtualPet("Fido");
        int initialHungerLevel = pet.getHungerLevel();
        int initialThirstLevel = pet.getThirstLevel();
        int initialBoredomLevel = pet.getBoredomLevel();
        pet.tick();
        int newHungerLevel = pet.getHungerLevel();
        int newThirstLevel = pet.getThirstLevel();
        int newBoredomLevel = pet.getBoredomLevel();
        assertTrue(newHungerLevel >= initialHungerLevel && newHungerLevel <= initialHungerLevel + 5);
        assertTrue(newThirstLevel >= initialThirstLevel && newThirstLevel <= initialThirstLevel + 5);
        assertTrue(newBoredomLevel >= initialBoredomLevel && newBoredomLevel <= initialBoredomLevel + 5);
    }
}
