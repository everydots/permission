package com.everydots.cloud.aws;

import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.AmazonEC2Client;
import com.amazonaws.services.ec2.model.DescribeInstancesResult;
import com.amazonaws.services.ec2.model.Reservation;
import com.amazonaws.services.ec2.model.RunInstancesRequest;
import com.google.common.base.Predicate;

import java.util.List;

import static com.google.common.collect.FluentIterable.from;

/*
* use this class to clean instances
* */
public class InstanceClean {

    public static final String CREDENTIAL_PROFILE = "awsCredentials.properties";

    private AmazonEC2 instance = null;

    private AmazonEC2 getAmazonEC2Client() {
        if (instance == null) {
            instance = new AmazonEC2Client(new DefaultAWSCredentialsProviderChain());
            instance.setRegion(Region.getRegion(Regions.AP_SOUTHEAST_1));
        }
        return instance;
    }

    public List<Reservation> describeInstances() {
        DescribeInstancesResult describeInstances = getAmazonEC2Client().describeInstances();
        return describeInstances.getReservations();
    }

    public List<Reservation> describeActiveInstances() {
        return from(describeInstances()).filter(new Predicate<Reservation>() {
            @Override
            public boolean apply(Reservation reservation) {
                return reservation.getInstances().get(0)
                        .getState().getCode().equals(16);
            }
        }).toList();
    }


    public void createFreeTierInstance() {
        RunInstancesRequest runInstancesRequest = new RunInstancesRequest();
        runInstancesRequest.getInstanceType();
        getAmazonEC2Client().runInstances(runInstancesRequest);

    }


}
