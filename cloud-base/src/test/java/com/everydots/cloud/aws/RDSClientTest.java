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

    @Test
    public void shouldDisplayRDSInstanceId() throws Exception {
        RDSClient rdsClient = new RDSClient();
        DBInstance dbInstance = rdsClient.describeRDSInstance();
        String dbInstanceIdentifier = dbInstance
                .getDBInstanceIdentifier();
        String dbiResourceId = dbInstance.getDbiResourceId();
        System.out.println(dbInstanceIdentifier);
        System.out.println(dbiResourceId);
    }
}