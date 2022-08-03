package Facade;

public class Main {


    public static void main(String[] args) {

        //Una simulacion no muy buena de como hablar con algunos npcs de un juego
        Npc dragonborn = new DragonBorn();
        Npc seller = new Seller();
        Npc zombie = new Zombie();

        if (dragonborn.talk())
            System.out.println(dragonborn.dialogue());
        else
            System.out.println(dragonborn.negate());

        if (seller.talk())
            System.out.println(seller.dialogue());
        else
            System.out.println(seller.negate());

        if (zombie.talk())
            System.out.println(zombie.dialogue());
        else
            System.out.println(zombie.negate());

    }
}
