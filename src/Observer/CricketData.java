package Observer;

import java.util.*;

public class CricketData implements Subject {
    int runs;
    int wickets;
    float overs;
    List<Observer> subscribers;

    @Override
    public void notifyObservers() {
        for (Observer o : subscribers)
            o.update(runs, wickets, overs);
    }

    @Override
    public void registerObserver(Observer o) {
        if (subscribers == null)
            subscribers = new ArrayList<Observer>();
        subscribers.add(o);
    }

    @Override
    public void unregisterObserver(Observer o) {
        subscribers.remove(o);
    }

    public int getLatestRuns() {
        return 10;
    }

    public int getLatestWickets() {
        return 2;
    }

    public float getLatestOvers() {
        return (float) 2.3;
    }

    public void dataChanged() {
        runs = getLatestRuns();
        wickets = getLatestWickets();
        overs = getLatestOvers();
        notifyObservers();
    }
}
