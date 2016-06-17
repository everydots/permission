package com.everydots.cloud.aws;

import org.junit.Test;

/**
 * Created by mxxiao on 6/15/16.
 */
public class ELBClientTest {


    @Test
    public void shouldCreateELB() throws Exception {
        ELBClient elbClient = new ELBClient();
        String loadBalancer = elbClient.createLoadBalancer();
        System.out.println(loadBalancer);
    }

    @Test
    public void shouldDestroyELB() throws Exception {
        ELBClient elbClient = new ELBClient();
        String loadBalancer = elbClient.destroyLoadBalancer();
        System.out.print(loadBalancer);
    }
}