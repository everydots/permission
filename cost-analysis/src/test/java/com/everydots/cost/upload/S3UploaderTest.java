package com.everydots.cost.upload;

import org.junit.Test;

/**
 * Created by mxxiao on 7/4/16.
 */
public class S3UploaderTest {

    @Test
    public void shouldUploadAllCostReports() throws Exception {
        S3Uploader s3Uploader = new S3Uploader();
        s3Uploader.uploadFiles("reports");
    }

    @Test
    public void shouldCreateBucket() throws Exception {
        S3Uploader s3Uploader = new S3Uploader();
        s3Uploader.createBucket("costreports");
    }
}