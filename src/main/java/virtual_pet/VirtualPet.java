package virtual_pet

private class VirtualPet {
    private String name;
    private int hungerLevel;
    private int thirstLevel;
    private int boredomLevel;

    private int minStatLevel = 0;
    private int maxStatLevel = 100;

    /**
     * Create a new VirtualPet with the given name, hunger level, thirst level, and boredom level.
     * 
     * @param name The name of the pet.
     * @param hungerLevel The starting hunger level of the pet.
     * @param thirstLevel The starting thirst level of the pet.
     * @param boredomLevel The starting boredom level of the pet.
     */
    public VirtualPet(String name, int hungerLevel, int thirstLevel, int boredomLevel) {
        this.name = name;
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.boredomLevel = boredomLevel;
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
     * 
     * @param amount The amount to lower the hunger level by.
     */
    public void feed(int amount) {
        hungerLevel -= amount;
        if (hungerLevel < minStatLevel) {
            hungerLevel = minStatLevel;
        }
    }
    
    /**
     * Lower the pet's thirst level by a certain amount.
     * 
     * @param amount The amount to lower the thirst level by.
     */
    public void water(int amount) {
        thirstLevel -= amount;
        if (thirstLevel < minStatLevel) {
            thirstLevel = minStatLevel;
        }
    }
    
    /**
     * Lowers the pet's boredom level by a certain amount.
     * Also increases hunger and thirst levels by 5 each.
     * 
     * @param amount The amount to lower the boredom level by.
     */
    public void play(int amount) {
        boredomLevel -= amount;
        if (boredomLevel < minStatLevel) {
            boredomLevel = minStatLevel;
        }

        hungerLevel += 5;
        if (hungerLevel > maxStatLevel) {
            hungerLevel = maxStatLevel;
        }

        thirstLevel += 5;
        if (thirstLevel > maxStatLevel) {
            thirstLevel = maxStatLevel;
        }
    }

    /**
     * Increases all the pet's stats by 5 each
     */
    public void stay() {
        boredomLevel += 5;
        if (boredomLevel > maxStatLevel) {
            boredomLevel = maxStatLevel;
        }

        hungerLevel += 5;
        if (hungerLevel > maxStatLevel) {
            hungerLevel = maxStatLevel;
        }

        thirstLevel += 5;
        if (thirstLevel > maxStatLevel) {
            thirstLevel = maxStatLevel;
        }
    }
}