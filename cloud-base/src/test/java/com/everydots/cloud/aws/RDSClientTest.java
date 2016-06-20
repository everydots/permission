package com.everydots.cloud.aws;

import com.amazonaws.services.rds.model.DBInstance;
import org.junit.Test;

/**
 * Created by mxxiao on 6/18/16.
 */
public class RDSClientTest {

    @Test
    public void shouldLaunchFreeTierRDS() throws Exception {
        RDSClient rdsClient = new RDSClient();
        DBInstance freeTierDB = rdsClient.launchFreeTierDB();
        System.out.println(freeTierDB.getDBName());
    }
}