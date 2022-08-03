package Creacionales.Singleton;

public class Main {

    public static void main(String[] args) {

        //No puede instanciar mas de una cancion a la vez
        GenerateSong song1 = GenerateSong.play("lolipop");
        GenerateSong song2 = GenerateSong.play("earthDestroyer");

        //El objeto no podra cambiar
        System.out.println(song2.getSong());
        System.out.println(song1.getSong());
    }
}
