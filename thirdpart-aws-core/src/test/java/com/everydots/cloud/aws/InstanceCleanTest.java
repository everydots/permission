package com.everydots.cloud.aws;

import com.amazonaws.services.ec2.model.Reservation;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by mxxiao on 5/27/16.
 */
public class InstanceCleanTest {


    @Test
    public void shouldDescribeInstances() throws Exception {

        InstanceClean instanceClean = new InstanceClean();
        List<Reservation> reservations = instanceClean.describeInstances();
        assertThat(reservations.size(), is(0));
    }
}