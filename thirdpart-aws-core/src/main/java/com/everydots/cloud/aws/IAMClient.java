package com.everydots.cloud.aws;

import com.amazonaws.services.identitymanagement.AmazonIdentityManagementClient;
import com.amazonaws.services.identitymanagement.model.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class IAMClient {
    public static final String IAMUSER = "Siyu";
    public static final String ACCESSKEY = "accessKey";
    public static final String SECRETKEY = "secretKey";
    public static final String PROPERTIES = "src/main/resources/awsCredentials.properties";
    public static AmazonIdentityManagementClient instance = null;

    public Properties writeCredentials() throws IOException {
        Properties prop = new Properties();
        OutputStream output = new FileOutputStream(PROPERTIES);

        AccessKey IAM = createIAM();
        String accessKey = IAM.getAccessKeyId();
        String secretKey = IAM.getSecretAccessKey();

        prop.setProperty(ACCESSKEY, accessKey);
        prop.setProperty(SECRETKEY, secretKey);
        prop.store(output, null);
        return prop;
    }

    public AmazonIdentityManagementClient getIAMClient() {
        if (instance == null) {
            instance = new AmazonIdentityManagementClient();
        }
        return instance;
    }

    public AccessKey createIAM() {
        CreateAccessKeyRequest createAccessKeyRequest = new CreateAccessKeyRequest().withUserName(createUser());
        CreateAccessKeyResult accessKey = getIAMClient().createAccessKey(createAccessKeyRequest);
        return accessKey.getAccessKey();
    }

    private String createUser() {
        CreateUserRequest createUserRequest = new CreateUserRequest().withUserName(IAMUSER);
        User user = getIAMClient().createUser(createUserRequest).getUser();
        return user.getUserName();
    }

    public void destroyIAM() {
        DeleteAccessKeyRequest deleteAccessKeyRequest = new DeleteAccessKeyRequest().withUserName(IAMUSER);
        DeleteUserRequest deleteUserRequest = new DeleteUserRequest().withUserName(IAMUSER);
        getIAMClient().deleteAccessKey(deleteAccessKeyRequest);
        getIAMClient().deleteUser(deleteUserRequest);

    }
}
