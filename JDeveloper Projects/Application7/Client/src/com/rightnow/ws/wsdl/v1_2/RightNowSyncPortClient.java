package com.rightnow.ws.wsdl.v1_2;

import weblogic.wsee.jws.jaxws.owsm.SecurityPoliciesFeature;
// This source file is generated by Oracle tools.
// Contents may be subject to change.
// For reporting problems, use the following:
// Generated by Oracle JDeveloper 12c 12.1.2.0.0.6668
public class RightNowSyncPortClient {
    public static void main(String[] args) {
        RightNowSyncService rightNowSyncService = new RightNowSyncService();

        // Configure security feature
        SecurityPoliciesFeature securityFeatures = new SecurityPoliciesFeature(new String[] {
                                                                               "oracle/wss_username_token_client_policy" });
        RightNowSyncPort rightNowSyncPort = rightNowSyncService.getRightNowSyncPort(securityFeatures);
        // Add your code to call the desired methods.


    }
}
