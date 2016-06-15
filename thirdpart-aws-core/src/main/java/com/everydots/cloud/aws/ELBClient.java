package com.everydots.cloud.aws;

import com.amazonaws.auth.ClasspathPropertiesFileCredentialsProvider;
import com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing;
import com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancingClient;
import com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerRequest;
import com.amazonaws.services.elasticloadbalancing.model.Listener;

public class ELBClient {

    public static final String LOAD_BALANCER_NAME = "LOAD_BALANCER_NAME";

    public void createLoadBalancer() {
        AmazonElasticLoadBalancing elasticLoadBalancing =
                new AmazonElasticLoadBalancingClient(new ClasspathPropertiesFileCredentialsProvider());
        CreateLoadBalancerRequest createLoadBalancerRequest =
                new CreateLoadBalancerRequest()
                        .withLoadBalancerName(LOAD_BALANCER_NAME)
                        .withListeners(new Listener()
                                .withProtocol("HTTP")
                                .withInstanceProtocol("HTTP")
                                .withInstancePort(8080)
                                .withLoadBalancerPort(8080))
                        .withSubnets()
                        .withSecurityGroups("sg-5faa3f3b");
        elasticLoadBalancing.createLoadBalancer(createLoadBalancerRequest);
    }
}
