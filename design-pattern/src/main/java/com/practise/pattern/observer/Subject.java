package com.practise.pattern.observer;

import java.util.concurrent.ConcurrentLinkedQueue;

public interface Subject {

    void attach(Observer observer);

    void detach(Observer observer);

    void notifies();
}
