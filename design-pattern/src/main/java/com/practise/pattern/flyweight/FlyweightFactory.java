package com.practise.pattern.flyweight;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.concurrent.ConcurrentHashMap;

public class FlyweightFactory {

    private ConcurrentHashMap<String, Flyweight> flyWeightPool = new ConcurrentHashMap<String, Flyweight>();
    private Log logger = LogFactory.getLog(FlyweightFactory.class);

    public Flyweight getFlyWeightInstance(String key) {
        if (flyWeightPool.get(key) != null) {
            logger.info("already exist in flyweight pool!");
            return flyWeightPool.get(key);
        } else {
            Flyweight flyweight = new ConcreteFlyweight();
            logger.info(String.format("create a new flyweight to pool [%s]!", flyweight.operation()));
            flyWeightPool.put(key, flyweight);
            return flyweight;
        }
    }

}
