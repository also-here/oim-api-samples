package com.rightnow.ws.wsdl.v1_2;

import javax.xml.ws.WebFault;

@WebFault(faultBean="com.rightnow.ws.faults.v1_2.ServerErrorFaultType",
  targetNamespace="urn:faults.ws.rightnow.com/v1_2", name="ServerErrorFault")
public class ServerErrorFault
  extends Exception
{
  private com.rightnow.ws.faults.v1_2.ServerErrorFaultType faultInfo;

  public ServerErrorFault(String message,
                          com.rightnow.ws.faults.v1_2.ServerErrorFaultType faultInfo)
  {
    super(message);
    this.faultInfo = faultInfo;
  }

  public ServerErrorFault(String message,
                          com.rightnow.ws.faults.v1_2.ServerErrorFaultType faultInfo,
                          Throwable t)
  {
    super(message,t);
    this.faultInfo = faultInfo;
  }

  public com.rightnow.ws.faults.v1_2.ServerErrorFaultType getFaultInfo()
  {
    return faultInfo;
  }

  public void setFaultInfo(com.rightnow.ws.faults.v1_2.ServerErrorFaultType faultInfo)
  {
    this.faultInfo = faultInfo;
  }
}
// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 130224.1947.04102)
package com.rightnow.ws.wsdl.v1_2;

import javax.xml.ws.WebFault;

@WebFault(faultBean="com.rightnow.ws.faults.v1_2.ServerErrorFaultType",
  targetNamespace="urn:faults.ws.rightnow.com/v1_2", name="ServerErrorFault")
public class ServerErrorFault
  extends Exception
{
  private com.rightnow.ws.faults.v1_2.ServerErrorFaultType faultInfo;

  public ServerErrorFault(String message,
                          com.rightnow.ws.faults.v1_2.ServerErrorFaultType faultInfo)
  {
    super(message);
    this.faultInfo = faultInfo;
  }

  public ServerErrorFault(String message,
                          com.rightnow.ws.faults.v1_2.ServerErrorFaultType faultInfo,
                          Throwable t)
  {
    super(message,t);
    this.faultInfo = faultInfo;
  }

  public com.rightnow.ws.faults.v1_2.ServerErrorFaultType getFaultInfo()
  {
    return faultInfo;
  }

  public void setFaultInfo(com.rightnow.ws.faults.v1_2.ServerErrorFaultType faultInfo)
  {
    this.faultInfo = faultInfo;
  }
}
// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 130224.1947.04102)
