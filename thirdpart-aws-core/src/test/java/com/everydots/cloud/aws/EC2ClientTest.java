package com.everydots.cloud.aws;

import java.util.List;

import com.amazonaws.services.ec2.model.Instance;
import com.amazonaws.services.ec2.model.InstanceStateChange;
import com.amazonaws.services.ec2.model.Reservation;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by mxxiao on 5/27/16.
 */
public class EC2ClientTest {


    private EC2Client ec2Client = new EC2Client();

    @Test
    public void shouldDescribeInstances() throws Exception {

        List<Instance> instances = ec2Client.describeInstances();
        assertThat(instances.size(), is(0));
    }

    @Test
    public void shouldRunFreeTierInstance() throws Exception {
        Reservation freeTierInstance = ec2Client.createFreeTierInstance();
        assertThat(freeTierInstance.getInstances().size(), is(1));
        System.out.println(freeTierInstance.getInstances().get(0).getInstanceId());
    }

    @Test
    public void shouldTerminateInstances() throws Exception {
        List<InstanceStateChange> instanceStateChanges = ec2Client.terminateInstances();
        assertThat(instanceStateChanges.size(), is(2));
    }
}