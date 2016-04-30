package com.practise.pattern.observer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.times;

/**
 * Created by mxxiao on 4/30/16.
 */
@RunWith(MockitoJUnitRunner.class)
public class ObserverPatternTest {

    @Mock
    private Observer observerA;
    @Mock
    private Observer observerB;

    @Test
    public void shouldExecuteObserverAAndB() throws Exception {

        Subject subject = new ConcreteSubject();
        observerA = new ConcreteObserverA();
        observerB = new ConcreteObserverB();
        subject.attach(observerA);
        subject.attach(observerB);

        subject.notifies();

        Mockito.verify(observerA, times(1)).update();
        Mockito.verify(observerB, times(1)).update();
    }
}