package com.practise.pattern.adapter;

import com.practise.core.Constants;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TargetTest {

    private Target target;
    private Target2 target2;

    @Test
    public void shouldInvokeTargetMethod() throws Exception {

        target = new Target();

        assertThat(target.request(), is(Constants.ADAPTER_TEXT));
    }


    //now requirement change, we need to invoke a new class

    @Test
    public void shouldInvokeNewTargetMethod() throws Exception {

        target = new Adapter(new Adaptee());

        assertThat(target.request(), is(Constants.ADAPTER_NEW_TEXT));

    }

    @Test
    public void shouldInvokeTarget2Method() throws Exception {
        target2 = new RealTarget2();

        assertThat(target2.request(), is(Constants.ADAPTER_TEXT));
    }


    //now requirement change, we need to invoke a new class

    @Test
    public void shouldInvokeNewTarget2Method() throws Exception {
        target2 = new Adapter2();

        assertThat(target2.request(), is(Constants.ADAPTER_NEW_TEXT));
    }
}