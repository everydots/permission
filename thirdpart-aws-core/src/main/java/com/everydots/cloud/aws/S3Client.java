package com.everydots.cloud.aws;

import com.amazonaws.services.s3.AmazonS3Client;

public class S3Client {

    public void getS3Client() {
        AmazonS3Client s3Client = new AmazonS3Client();

    }
}
