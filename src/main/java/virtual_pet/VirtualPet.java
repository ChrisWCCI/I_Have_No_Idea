package virtual_pet

private class VirtualPet {
    private String name;
    private int hungerLevel;
    private int thirstLevel;
    private int boredomLevel;

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
        if (hungerLevel < 0) {
            hungerLevel = 0;
        }
    }
    
    /**
     * Lower the pet's thirst level by a certain amount.
     * 
     * @param amount The amount to lower the thirst level by.
     */
    public void water(int amount) {
        thirstLevel -= amount;
        if (thirstLevel < 0) {
            thirstLevel = 0;
        }
    }
    
    /**
     * Lower the pet's boredom level by a certain amount.
     * 
     * @param amount The amount to lower the boredom level by.
     */
    public void play(int amount) {
        boredomLevel -= amount;
        if (boredomLevel < 0) {
            boredomLevel = 0;
        }
    }
}