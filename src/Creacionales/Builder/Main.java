package Creacionales.Builder;

public class Main {

    public static void main(String[] args) {

        //Un creador de personajes, es lo mejor que pude encontrar para resolver :p
        Character usuario1 = new CharacterBuilder()
                .nickName("Striker347")
                .vocation("Herrero")
                .tendency("Justo / Bueno")
                .species("Enano")
                .build();

        Character usuario2 = new CharacterBuilder()
                .nickName("xXVegasXx")
                .clan("No-Muertos")
                .tendency("Caotico / Bueno")
                .species("HombreBestia")
                .build();

        Character usuario3 = new CharacterBuilder()
                .clan("No-Muertos")
                .vocation("Guerrero")
                .tendency("Caotico / Bueno")
                .species("HombreBestia")
                .build();
    }
}
