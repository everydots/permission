package com.everydots.cloud.aws;

import com.amazonaws.services.identitymanagement.model.AccessKey;
import org.junit.Before;
import org.junit.Test;

import java.util.Properties;

/**
 * Created by mxxiao on 6/15/16.
 */
public class IAMClientTest {

    IAMClient iamClient;

    @Before
    public void setUp() throws Exception {

        iamClient = new IAMClient();

    }

    @Test
    public void shouldCreateIAM() throws Exception {
        AccessKey IAM = iamClient.createIAM();
        System.out.println("accessKey: " + IAM.getAccessKeyId() + "secretKey: " + IAM.getSecretAccessKey());
    }

    @Test
    public void shouldWriteProperties() throws Exception {
        Properties IAM = iamClient.writeCredentials();
        System.out.println("accessKey: " + IAM.getProperty("accessKey") + '\n' + "secretKey: " + IAM.getProperty("secretKey"));
    }

    @Test
    public void destroyIAM() throws Exception {
        iamClient.destroyIAM();
    }
}