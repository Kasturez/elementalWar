package me.kasturez.elementalwar.guild.elementalEssence;

public enum ElementalType {

    FIRE("FIRE"), ICE("ICE"), AIR("AIR"), EARTH("EARTH"), WOOD("WOOD");

    private final String name;

    ElementalType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
