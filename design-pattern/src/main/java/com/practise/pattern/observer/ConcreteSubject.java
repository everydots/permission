package com.practise.pattern.observer;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcreteSubject implements Subject {

    private static final ConcurrentLinkedQueue observerQueue = new ConcurrentLinkedQueue();

    @Override
    public void attach(Observer observer) {
        observerQueue.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerQueue.remove(observer);
    }

    @Override
    public void notifies() {
        Iterator<Observer> iterator = observerQueue.iterator();
        while (iterator.hasNext()) {
            iterator.next().update();
        }
    }
}
