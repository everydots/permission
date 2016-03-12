package com.everydots.premium.permission.service;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ComputeTest {

    @Test
    public void testComputeTotal() throws Exception {
        Compute compute = new Compute();
        int total = compute.computeTotal(1, 2);
        assertThat(total, is(3));
    }

}