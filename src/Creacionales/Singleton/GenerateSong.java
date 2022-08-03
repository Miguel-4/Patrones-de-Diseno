package Creacionales.Singleton;

public class GenerateSong {

    private static GenerateSong SaveState;
    private String song;

    private GenerateSong(String song) {
        this.song = song;
        System.out.println("Generando y reproduciendo " + song + "...");
    }

    public static GenerateSong play(String song) {
        if (SaveState == null){
            SaveState = new GenerateSong(song);
        }
        else{
            System.out.println("Ya he generedo una cancion!!!");
        }

        return SaveState;
    }

    public String getSong() {
        return song;
    }
}
