package com.practise.pattern.builder;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BuilderTest {

    @Test
    public void testConstruct() throws Exception {
        ConcreteBuilder builder = new ConcreteBuilder();
        builder.buildPartA().buildPartB().buildPartC();

        assertThat(builder.getResult().getProductName(), is("partApartBpartC"));
    }
}