package virtual_pet;

public class VirtualPetTest {

    public void testFeed() {
        VirtualPet pet = new VirtualPet("Fido");
        int initialHungerLevel = pet.getHungerLevel();
        pet.feed();
        int newHungerLevel = pet.getHungerLevel();
        System.out.println(newHungerLevel < initialHungerLevel);
    }

    public void testWater() {
        VirtualPet pet = new VirtualPet("Fido");
        int initialThirstLevel = pet.getThirstLevel();
        pet.water();
        int newThirstLevel = pet.getThirstLevel();
        System.out.println(newThirstLevel < initialThirstLevel);
    }

    public void testPlay() {
        VirtualPet pet = new VirtualPet("Fido");
        int initialHungerLevel = pet.getHungerLevel();
        int initialThirstLevel = pet.getThirstLevel();
        pet.play();
        int newHungerLevel = pet.getHungerLevel();
        int newThirstLevel = pet.getThirstLevel();
        System.out.println(newHungerLevel <= initialHungerLevel && newHungerLevel >= initialHungerLevel - 5);
        System.out.println(newThirstLevel <= initialThirstLevel && newThirstLevel >= initialThirstLevel - 5);
    }

    public void testTick() {
        VirtualPet pet = new VirtualPet("Fido");
        int initialHungerLevel = pet.getHungerLevel();
        int initialThirstLevel = pet.getThirstLevel();
        int initialBoredomLevel = pet.getBoredomLevel();
        pet.tick();
        int newHungerLevel = pet.getHungerLevel();
        int newThirstLevel = pet.getThirstLevel();
        int newBoredomLevel = pet.getBoredomLevel();
        System.out.println(newHungerLevel >= initialHungerLevel && newHungerLevel <= initialHungerLevel + 5);
        System.out.println(newThirstLevel >= initialThirstLevel && newThirstLevel <= initialThirstLevel + 5);
        System.out.println(newBoredomLevel >= initialBoredomLevel && newBoredomLevel <= initialBoredomLevel + 5);
    }
}
