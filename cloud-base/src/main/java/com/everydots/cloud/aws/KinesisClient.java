package com.everydots.cloud.aws;

import com.amazonaws.services.kinesis.AmazonKinesisClient;
import com.amazonaws.services.kinesis.model.CreateStreamRequest;

public class KinesisClient {
    public void createKinesisStream() {
        AmazonKinesisClient kinesisClient = new AmazonKinesisClient();
        CreateStreamRequest createStreamRequest = new CreateStreamRequest();
        kinesisClient.createStream(createStreamRequest);
    }

}
