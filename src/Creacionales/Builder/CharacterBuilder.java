package Creacionales.Builder;

public class CharacterBuilder {

    private String nickname;
    private String clan;
    private String vocation;
    private String tendency;
    private String species;

    public CharacterBuilder() {
    }

    public CharacterBuilder nickName(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public CharacterBuilder clan(String clan) {
        this.clan = clan;
        return this;
    }

    public CharacterBuilder vocation(String vocation) {
        this.vocation = vocation;
        return this;
    }

    public CharacterBuilder tendency(String tendency) {
        this.tendency = tendency;
        return this;
    }

    public CharacterBuilder species(String species) {
        this.species = species;
        return this;
    }

    public Character build() {
        return new Character(this);
    }

    // Getters
    public String getNickname() {
        return nickname;
    };

    public String getClan() {
        return clan;
    };

    public String getVocation() {
        return vocation;
    };

    public String getTendency() {
        return tendency;
    };

    public String getSpecies() {
        return species;
    };
}