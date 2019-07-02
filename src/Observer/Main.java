package Observer;

public class Main {
    public static void main(String[] args) {
        CricketData cd = new CricketData();
        CricketScore scoreboard = new CricketScore();
        scoreboard.display();
        cd.registerObserver(scoreboard);
        cd.dataChanged();
        cd.unregisterObserver(scoreboard);
        cd.dataChanged();

    }
}
