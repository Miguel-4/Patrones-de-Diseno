package Facade;

public class Seller implements Npc {
    @Override
    public Boolean talk() {
        return true;
    }

    @Override
    public String dialogue() {
        return "What are you buying?";
    }

    @Override
    public String negate() { return "Not my pelts, get away from them"; }
}
