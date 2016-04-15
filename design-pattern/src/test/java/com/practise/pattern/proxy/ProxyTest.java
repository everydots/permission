package com.practise.pattern.proxy;

import com.practise.core.Constants;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ProxyTest {

    private Proxy proxy = new Proxy(new RealSubject());

    @Test
    public void shouldInvokePreRequestAndPostRequest() throws Exception {
        assertThat(proxy.request(),
                is(Constants.PROXY_PRE_REQUEST + Constants.PROXY_TEXT + Constants.PROXY_POST_REQUEST));

    }
}