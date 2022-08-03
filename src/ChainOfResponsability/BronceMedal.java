package ChainOfResponsability;

public class BronceMedal implements pointsUnlocker {
    private pointsUnlocker next;

    public pointsUnlocker getNext() { return next;}

    public void insertScore(int score) {
        if (score <= 25000)
            System.out.println("Better luck next Time!");
        if (score > 25000 && score <= 50000)
            System.out.println("Was a good try, bronce for you");
        else
            next.insertScore(score);
    }

    public void setNext(pointsUnlocker medal) { next = medal; }
}
