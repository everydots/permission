package com.practise.pattern.facade;

import com.practise.core.Constants;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FacadeTest {

    @Test
    public void shouldInvokeSubSystems() throws Exception {
        Facade facade = new Facade();
        assertThat(facade.wrapOptions(),
                is(Constants.FACATE_OPERATEA + Constants.FACATE_OPERATEB + Constants.FACATE_OPERATEC));
    }
}