package com.practise.pattern.mediator;

import com.sun.javafx.binding.StringFormatter;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ConcreteColleagueA extends Colleague {

    private Log logger = LogFactory.getLog(ConcreteColleagueA.class);

    @Override
    void receiveMsg(int number) {
        logger.info(StringFormatter.format("colleague A receive msg from: ", number));
        mediator.operate(number);
    }

    @Override
    void sendMsg(int number, Colleague colleague) {
        logger.info(StringFormatter.format("colleague A send msg from: ", number));
        mediator.operate(number);
    }
}
