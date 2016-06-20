package com.everydots.cloud.aws;

import com.amazonaws.auth.ClasspathPropertiesFileCredentialsProvider;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.rds.AmazonRDSClient;
import com.amazonaws.services.rds.model.CreateDBInstanceRequest;
import com.amazonaws.services.rds.model.DBInstance;
import com.amazonaws.services.rds.model.DescribeDBInstancesRequest;
import com.amazonaws.services.rds.model.DescribeDBInstancesResult;

public class RDSClient {

    public static final String DB_NAME = "demo";
    private static final String DB_INSTANCE_TYPE = "db.t2.micro";
    private static final String DB_ENGINE = "MySQL";
    public static final String MASTER_USERNAME = "root";
    public static final String MASTER_PASSWORD = "xiaomixin";

    private AmazonRDSClient instance = null;

    private AmazonRDSClient getRDSClient() {
        if (instance == null) {
            instance = new AmazonRDSClient(new ClasspathPropertiesFileCredentialsProvider());
            instance.setRegion(Region.getRegion(Regions.US_EAST_1));
        }
        return instance;
    }

    public DBInstance launchFreeTierDB() {
        EC2Client ec2Client = new EC2Client();
        CreateDBInstanceRequest dbInstanceRequest =
                new CreateDBInstanceRequest()
                        .withDBInstanceClass(DB_INSTANCE_TYPE)
                        .withEngine(DB_ENGINE)
                        .withDBInstanceIdentifier(DB_NAME)
                        .withMasterUsername(MASTER_USERNAME)
                        .withMasterUserPassword(MASTER_PASSWORD)
                        .withAllocatedStorage(5)
                        .withVpcSecurityGroupIds(ec2Client
                                .getSecurityGroup(EC2Client.DEFAULT_VPC_SECURITY_GROUP));
        DBInstance dbInstance = getRDSClient().createDBInstance(dbInstanceRequest);
        return dbInstance;
    }


    public DBInstance describeRDSInstance() {
        DescribeDBInstancesRequest describeDBInstancesRequest =
                new DescribeDBInstancesRequest()
                        .withDBInstanceIdentifier(DB_NAME);
        try {
            DescribeDBInstancesResult describeDBInstancesResult =
                    getRDSClient().describeDBInstances(describeDBInstancesRequest);
            return describeDBInstancesResult.getDBInstances().get(0);
        } catch (Exception e) {
            return null;
        }
    }

}