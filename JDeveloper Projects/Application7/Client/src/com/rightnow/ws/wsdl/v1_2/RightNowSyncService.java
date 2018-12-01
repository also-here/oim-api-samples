
package com.rightnow.ws.wsdl.v1_2;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8-b13937
 * Generated source version: 2.2
 *
 */
@WebServiceClient(name = "RightNowSyncService", targetNamespace = "urn:wsdl.ws.rightnow.com/v1_2",
                  wsdlLocation =
                  "http://pts-template-config.rightnowdemo.com/cgi-bin/pts_template_config.cfg/services/soap?wsdl#%7Burn%3Awsdl.ws.rightnow.com%2Fv1_2%7DRightNowSyncService")
public class RightNowSyncService extends Service {

    private final static URL RIGHTNOWSYNCSERVICE_WSDL_LOCATION;
    private final static WebServiceException RIGHTNOWSYNCSERVICE_EXCEPTION;
    private final static QName RIGHTNOWSYNCSERVICE_QNAME =
        new QName("urn:wsdl.ws.rightnow.com/v1_2", "RightNowSyncService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("http://pts-template-config.rightnowdemo.com/cgi-bin/pts_template_config.cfg/services/soap?wsdl#%7Burn%3Awsdl.ws.rightnow.com%2Fv1_2%7DRightNowSyncService");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        RIGHTNOWSYNCSERVICE_WSDL_LOCATION = url;
        RIGHTNOWSYNCSERVICE_EXCEPTION = e;
    }

    public RightNowSyncService() {
        super(__getWsdlLocation(), RIGHTNOWSYNCSERVICE_QNAME);
    }

    public RightNowSyncService(WebServiceFeature... features) {
        super(__getWsdlLocation(), RIGHTNOWSYNCSERVICE_QNAME, features);
    }

    public RightNowSyncService(URL wsdlLocation) {
        super(wsdlLocation, RIGHTNOWSYNCSERVICE_QNAME);
    }

    public RightNowSyncService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, RIGHTNOWSYNCSERVICE_QNAME, features);
    }

    public RightNowSyncService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RightNowSyncService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns RightNowSyncPort
     */
    @WebEndpoint(name = "RightNowSyncPort")
    public RightNowSyncPort getRightNowSyncPort() {
        return super.getPort(new QName("urn:wsdl.ws.rightnow.com/v1_2", "RightNowSyncPort"), RightNowSyncPort.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RightNowSyncPort
     */
    @WebEndpoint(name = "RightNowSyncPort")
    public RightNowSyncPort getRightNowSyncPort(WebServiceFeature... features) {
        return super.getPort(new QName("urn:wsdl.ws.rightnow.com/v1_2", "RightNowSyncPort"), RightNowSyncPort.class,
                             features);
    }

    /**
     *
     * @return
     *     returns RightNowFedAuthSyncPort
     */
    @WebEndpoint(name = "RightNowFedAuthSyncPort")
    public RightNowFedAuthSyncPort getRightNowFedAuthSyncPort() {
        return super.getPort(new QName("urn:wsdl.ws.rightnow.com/v1_2", "RightNowFedAuthSyncPort"),
                             RightNowFedAuthSyncPort.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RightNowFedAuthSyncPort
     */
    @WebEndpoint(name = "RightNowFedAuthSyncPort")
    public RightNowFedAuthSyncPort getRightNowFedAuthSyncPort(WebServiceFeature... features) {
        return super.getPort(new QName("urn:wsdl.ws.rightnow.com/v1_2", "RightNowFedAuthSyncPort"),
                             RightNowFedAuthSyncPort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (RIGHTNOWSYNCSERVICE_EXCEPTION != null) {
            throw RIGHTNOWSYNCSERVICE_EXCEPTION;
        }
        return RIGHTNOWSYNCSERVICE_WSDL_LOCATION;
    }

}