package Enums;

public enum Species {
    DONKEY("ослик"),
    HUMAN("человек"),
    BEAR("медвежонок"),
    PIG("свинка"),
    SLONOPOTAM("чудовище");

    private String species;

    Species(String species){ this.species = species; }

    public String toString(){ return this.species; }
}
