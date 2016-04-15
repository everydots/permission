package com.practise.pattern.flyweight;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by mxxiao on 4/14/16.
 */
public class FlyweightFactoryTest {

    @Test
    public void shouldCreateNewOneWhenNoFlyWeightExist() throws Exception {

        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight one = flyweightFactory.getFlyWeightInstance("one");
        Flyweight exsitOne = flyweightFactory.getFlyWeightInstance("one");
        assertThat(one, is(exsitOne));
    }
}