package me.kasturez.elementalwar.guild.entities;

public enum GuildRanks {

    RECRUIT("Recruit"), MEMBER("Member"), ADMIN("Admin");

    private String name;

    GuildRanks(String name){
        this.name = name;
    }

    public String getName(String name){
        return name;
    }
}
