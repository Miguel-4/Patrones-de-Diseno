package ChainOfResponsability;

public interface pointsUnlocker {

    public void setNext(pointsUnlocker medal);
    public pointsUnlocker getNext();
    public void insertScore(int score);

}
