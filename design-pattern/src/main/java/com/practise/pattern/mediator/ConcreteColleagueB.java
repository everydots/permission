package com.practise.pattern.mediator;

import com.sun.javafx.binding.StringFormatter;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ConcreteColleagueB extends Colleague {

    private Log logger = LogFactory.getLog(ConcreteColleagueB.class);

    @Override
    void receiveMsg(int number) {
        logger.info(StringFormatter.format("colleague B receive msg from: ", number));
        mediator.operate(number);
    }

    @Override
    void sendMsg(int number, Colleague colleague) {
        logger.info(StringFormatter.format("colleague B send msg from: ", number));
        colleague.sendMsg(number, colleague);
    }
}
