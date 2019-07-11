package Observer;

public class CricketScore implements Observer {
    private int runs, wickets;
    private float overs;

    @Override
    public void update(int runs, int wickets, float overs) {
        this.runs = runs;
        this.overs = overs;
        this.wickets = wickets;
        display();
    }

    public void display() {
        System.out.println("runs " + runs + " wickets " + wickets + " overs " + overs);
    }

}
