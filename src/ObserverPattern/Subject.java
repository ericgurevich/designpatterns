package ObserverPattern;

public interface Subject {
    void register(Object observer);
    void unregister(Object observer);

    void notifyObservers();
}
