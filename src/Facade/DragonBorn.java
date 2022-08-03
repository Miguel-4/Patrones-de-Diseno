package Facade;

public class DragonBorn implements Npc {
    @Override
    public Boolean talk() { return true; }

    @Override
    public String dialogue() { return "Hello its me, dragonman from dragon realm"; }

    @Override
    public String negate() { return "Am not talking to you"; }
}
