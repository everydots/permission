package com.everydots.cost.upload;

import com.everydots.cloud.aws.S3Client;
import com.everydots.common.S3File;
import com.everydots.cost.common.FileUtils;
import com.everydots.utils.PropertiesUtils;

import java.util.List;

public class S3Uploader {

    public static final String BUCKET_NAME = "costreports";
    private S3Client s3Client = new S3Client();

    public void uploadFiles(String folderName) {
        List<S3File> s3Files = FileUtils.retrieveClassPathFiles(folderName);
        s3Client.uploadFiles(PropertiesUtils.getProperty("bucketName"), s3Files);
    }

    public void createBucket(String bucketName) {
        s3Client.createBucket(bucketName);
    }

}
