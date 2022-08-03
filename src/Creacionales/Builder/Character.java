package Creacionales.Builder;

public class Character {

    private String nickname;
    private String clan;
    private String vocation;
    private String tendency;
    private String species;

    Character(CharacterBuilder builder) {
        if (builder.getNickname() == "" || builder.getNickname() == null) {
            throw new IllegalArgumentException("el nombre de tu personaje es requerido");
        }
        this.nickname = builder.getNickname();
        this.clan = builder.getClan();
        this.vocation = builder.getVocation();
        this.tendency = builder.getTendency();
        this.species = builder.getSpecies();

        System.out.println(this.nickname);
        System.out.println(this.clan);
        System.out.println(this.vocation);
        System.out.println(this.tendency);
        System.out.println(this.species);
    }
}