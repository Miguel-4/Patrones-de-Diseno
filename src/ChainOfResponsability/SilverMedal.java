package ChainOfResponsability;

public class SilverMedal implements pointsUnlocker {
    private pointsUnlocker next;

    public pointsUnlocker getNext() { return next;}

    public void insertScore(int score) {
        if (score > 50000 && score <= 100000)
            System.out.println("Nicee, silver medal for you my boy");
        else
            next.insertScore(score);
    }

    public void setNext(pointsUnlocker medal) { next = medal; }
}
