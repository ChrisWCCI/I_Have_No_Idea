package virtual_pet;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VirtualPetShelterTest {

    private VirtualPetShelter shelter;
    private VirtualPet pet1;
    private VirtualPet pet2;
    private VirtualPet pet3;

    @BeforeEach
    void setUp() throws Exception {
        shelter = new VirtualPetShelter();
        pet1 = new VirtualPet("Max");
        pet2 = new VirtualPet("Fluffy");
        pet3 = new VirtualPet("Spike");
        shelter.admit(pet1);
        shelter.admit(pet2);
        shelter.admit(pet3);
    }

    @Test
    void shouldFeedAllPets() {
        int initialHunger1 = pet1.getHungerLevel();
        int initialHunger2 = pet2.getHungerLevel();
        int initialHunger3 = pet3.getHungerLevel();
        shelter.feedAllPets();
        assertEquals(initialHunger1 - pet1.getStatChangeAmt() * pet1.getStatChangeMultiplier(), pet1.getHungerLevel());
        assertEquals(initialHunger2 - pet2.getStatChangeAmt() * pet2.getStatChangeMultiplier(), pet2.getHungerLevel());
        assertEquals(initialHunger3 - pet3.getStatChangeAmt() * pet3.getStatChangeMultiplier(), pet3.getHungerLevel());
    }

    @Test
    void shouldAdoptPet() {
        assertTrue(shelter.adopt("Max") != null);
        assertTrue(shelter.getPet("Max") == null);
    }

    @Test
    void shouldAdmitPet() {
        VirtualPet newPet = new VirtualPet("Rex");
        shelter.admit(newPet);
        assertTrue(shelter.getPet("Rex") != null);
    }
}
