package ChainOfResponsability;

public class Main {

    public static void main(String[] args) {

        //Primero pense que podria ser un sistema de logros, pero me parecio mas conveniente esto
        pointsManager pointsmanager = new pointsManager();
        pointsmanager.insertScore(560);
        pointsmanager.insertScore(26670);
        pointsmanager.insertScore(54590);
        pointsmanager.insertScore(144590);
    }
}
