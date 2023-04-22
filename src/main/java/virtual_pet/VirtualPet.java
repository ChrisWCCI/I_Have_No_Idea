package virtual_pet;

import java.util.Random;

public class VirtualPet {
    private String name;
    private int hungerLevel;
    private int thirstLevel;
    private int boredomLevel;

    private int minStatLevel = 0;
    private int maxStatLevel = 100;
    private int problemLevel = maxStatLevel / 2;
    private int statChangeAmt = 5;
    private int statChangeMultiplier = 4;

    private Random ran = new Random();

    /**
     * Create a new VirtualPet with the given name, hunger level, thirst level, and
     * boredom level.
     * 
     * @param name         The name of the pet.
     * @param hungerLevel  The starting hunger level of the pet.
     * @param thirstLevel  The starting thirst level of the pet.
     * @param boredomLevel The starting boredom level of the pet.
     */
    public VirtualPet(String name, int hungerLevel, int thirstLevel, int boredomLevel) {
        this.name = name;
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.boredomLevel = boredomLevel;
    }

    /**
     * Constructs a new VirtualPet object with the given name and initial attribute
     * values.
     *
     * @param name the name of the pet
     */
    public VirtualPet(String name) {
        this.name = name;
        this.hungerLevel = 50; // set initial hunger level to 50
        this.thirstLevel = 50; // set initial thirst level to 50
        this.boredomLevel = 50; // set initial boredom level to 50
    }

    /**
     * Get the name of the pet.
     * 
     * @return The current name of the pet.
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the pet.
     * 
     * @param name The new name of the pet.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the current hunger level of the pet.
     * 
     * @return The current hunger level of the pet.
     */
    public int getHungerLevel() {
        return hungerLevel;
    }

    /**
     * Set the hunger level of the pet.
     * 
     * @param hungerLevel The new hunger level of the pet.
     */
    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    /**
     * Get the current thirst level of the pet.
     * 
     * @return The current thirst level of the pet.
     */
    public int getThirstLevel() {
        return thirstLevel;
    }

    /**
     * Set the thirst level of the pet.
     * 
     * @param thirstLevel The new thirst level of the pet.
     */
    public void setThirstLevel(int thirstLevel) {
        this.thirstLevel = thirstLevel;
    }

    /**
     * Get the current boredom level of the pet.
     * 
     * @return The current boredom level of the pet.
     */
    public int getBoredomLevel() {
        return boredomLevel;
    }

    /**
     * Set the boredom level of the pet.
     * 
     * @param boredomLevel The new boredom level of the pet.
     */
    public void setBoredomLevel(int boredomLevel) {
        this.boredomLevel = boredomLevel;
    }

    /**
     * Lower the pet's hunger level by a certain amount.
     */
    public void feed() {
        hungerLevel -= statChangeAmt * statChangeMultiplier;
        if (hungerLevel < minStatLevel) {
            hungerLevel = minStatLevel;
        }
    }

    /**
     * Lower the pet's thirst level by a certain amount.
     */
    public void water() {
        thirstLevel -= statChangeAmt * statChangeMultiplier;
        if (thirstLevel < minStatLevel) {
            thirstLevel = minStatLevel;
        }
    }

    /**
     * Lowers the pet's boredom level by default amount.
     * Also increases hunger and thirst levels by default amount.
     */
    public void play() {
        if (ran.nextBoolean()) {
            boredomLevel -= statChangeAmt * statChangeMultiplier;
            if (boredomLevel < minStatLevel) {
                boredomLevel = minStatLevel;
            }
        }
    }

    /**
     * Increases all the pet's stats by 5 each.
     */
    public void tick() {
        boredomLevel += statChangeAmt;
        if (boredomLevel > maxStatLevel) {
            boredomLevel = maxStatLevel;
        }

        hungerLevel += statChangeAmt;
        if (hungerLevel > maxStatLevel) {
            hungerLevel = maxStatLevel;
        }

        thirstLevel += statChangeAmt;
        if (thirstLevel > maxStatLevel) {
            thirstLevel = maxStatLevel;
        }

        selfCare();
    }

    /**
     * Chance for the pet to take care of
     * urgent problems itself.
     */
    private void selfCare() {
        if (ran.nextInt(maxStatLevel) >= problemLevel) {
            if (thirstLevel >= hungerLevel && thirstLevel >= problemLevel) {
                water();
            } else if (hungerLevel >= problemLevel) {
                feed();
            }
        }
    }

    /**
     * Handler for invalid user entry.
     */
    public void confuse() {
        System.out.println(name + " looks at you confused...");
    }

    /**
     * Print out the ASCII art or
     * written text status for the pet.
     */
    public void printPetStatus() {
        System.out.println("Name: " + this.getName());

        if (this.getHungerLevel() >= problemLevel) {
            System.out.println("   ,    /-.");
            System.out.println("   ((___/ __>");
            System.out.println("   /      }");
            System.out.println("   \\ .--.(    ___");
            System.out.println("    \\\\   \\\\  /___\\");
            System.out.println();
        } else {
            System.out.println("Hunger: " + this.getHungerLevel());
        }

        if (this.getThirstLevel() >= problemLevel) {
            System.out.println("   / \\__");
            System.out.println("  (    @\\___");
            System.out.println("  /         O");
            System.out.println(" /   (_____/");
            System.out.println("/_____/   U");
            System.out.println();
        } else {
            System.out.println("Thirst: " + this.getThirstLevel());
        }

        if (this.getBoredomLevel() >= problemLevel) {
            System.out.println("              /\\___/\\");
            System.out.println("              `)9 9('");
            System.out.println("              {_:Y:.}_");
            System.out.println("    ----------( )U-'( )----------");
            System.out.println("              ```   '''");
        } else {
            System.out.println("Boredom: " + this.getBoredomLevel());
        }

        System.out.println();
    }

    /**
     * Get the amount by which a pet's status is
     * changed when interacting with them.
     * 
     * @return The amount by which a pet's status is changed.
     */
    public int getStatChangeAmt() {
        return statChangeAmt;
    }

    /**
     * Get the multiplier used to calculate how much a
     * pet's status is changed when interacting with them.
     * 
     * @return The multiplier used to calculate how much a pet's status is changed.
     */
    public int getStatChangeMultiplier() {
        return statChangeMultiplier;
    }

}
