package com.practise.pattern.mediator;

import org.junit.Test;

public class ConcreteMediatorTest {

    @Test
    public void shouldInvokeColleagueA() throws Exception {

        Colleague concreteColleagueA = new ConcreteColleagueA();
        Colleague concreteColleagueB = new ConcreteColleagueB();

        Mediator concreteMediator = new ConcreteMediator();
        concreteMediator.register(1, concreteColleagueA);
        concreteMediator.register(2, concreteColleagueB);

        concreteColleagueA.sendMsg(1, concreteColleagueB);
        concreteColleagueB.receiveMsg(1);
    }
}