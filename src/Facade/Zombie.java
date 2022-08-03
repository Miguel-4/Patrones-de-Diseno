package Facade;

public class Zombie implements Npc {
    @Override
    public Boolean talk() { return false; }

    @Override
    public String dialogue() {
        return "Hello buddy";
    }

    @Override
    public String negate() { return "Brains..."; }
}
