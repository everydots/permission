package com.everydots.cloud.aws;

import com.amazonaws.auth.ClasspathPropertiesFileCredentialsProvider;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3Client;

public class S3Client {

    private static AmazonS3Client instance = null;

    public AmazonS3Client getS3Client() {
        if (instance == null) {
            instance = new AmazonS3Client(new ClasspathPropertiesFileCredentialsProvider());
            instance.setRegion(Region.getRegion(Regions.US_EAST_1));
        }
        return instance;
    }

    public void createBucket() {
    }
}
