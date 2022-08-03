package ChainOfResponsability;

public class pointsManager implements pointsUnlocker {
    private pointsUnlocker next;

    public pointsUnlocker getNext() {
        return next;
    }

    public void insertScore(int score) {
        BronceMedal bronce = new BronceMedal();
        this.setNext(bronce);

        SilverMedal silver = new SilverMedal();
        bronce.setNext(silver);

        GoldMedal gold = new GoldMedal();
        silver.setNext(gold);

        next.insertScore(score);
    }

    public void setNext(pointsUnlocker medal) {
        next = medal;
    }
}
