package ChainOfResponsability;

public class GoldMedal implements pointsUnlocker {
    private pointsUnlocker next;

    public pointsUnlocker getNext() { return next;}

    public void insertScore(int score) {
        if (score > 100000)
            System.out.println("Holy moly!!! You got gold!!!");
    }

    public void setNext(pointsUnlocker medal) { next = medal; }
}
