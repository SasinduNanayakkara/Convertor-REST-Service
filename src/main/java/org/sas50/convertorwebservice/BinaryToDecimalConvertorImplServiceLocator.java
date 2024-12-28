/**
 * BinaryToDecimalConvertorImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sas50.convertorwebservice;

public class BinaryToDecimalConvertorImplServiceLocator extends org.apache.axis.client.Service implements org.sas50.convertorwebservice.BinaryToDecimalConvertorImplService {

    public BinaryToDecimalConvertorImplServiceLocator() {
    }


    public BinaryToDecimalConvertorImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BinaryToDecimalConvertorImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BinaryToDecimalConvertorImplPort
    private java.lang.String BinaryToDecimalConvertorImplPort_address = "http://localhost:8083/ConvertorWebService_war_exploded/binary-decimal";

    public java.lang.String getBinaryToDecimalConvertorImplPortAddress() {
        return BinaryToDecimalConvertorImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BinaryToDecimalConvertorImplPortWSDDServiceName = "BinaryToDecimalConvertorImplPort";

    public java.lang.String getBinaryToDecimalConvertorImplPortWSDDServiceName() {
        return BinaryToDecimalConvertorImplPortWSDDServiceName;
    }

    public void setBinaryToDecimalConvertorImplPortWSDDServiceName(java.lang.String name) {
        BinaryToDecimalConvertorImplPortWSDDServiceName = name;
    }

    public org.sas50.convertorwebservice.BinaryToDecimalConvertorImpl getBinaryToDecimalConvertorImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BinaryToDecimalConvertorImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBinaryToDecimalConvertorImplPort(endpoint);
    }

    public org.sas50.convertorwebservice.BinaryToDecimalConvertorImpl getBinaryToDecimalConvertorImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.sas50.convertorwebservice.BinaryToDecimalConvertorImplPortBindingStub _stub = new org.sas50.convertorwebservice.BinaryToDecimalConvertorImplPortBindingStub(portAddress, this);
            _stub.setPortName(getBinaryToDecimalConvertorImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBinaryToDecimalConvertorImplPortEndpointAddress(java.lang.String address) {
        BinaryToDecimalConvertorImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.sas50.convertorwebservice.BinaryToDecimalConvertorImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                org.sas50.convertorwebservice.BinaryToDecimalConvertorImplPortBindingStub _stub = new org.sas50.convertorwebservice.BinaryToDecimalConvertorImplPortBindingStub(new java.net.URL(BinaryToDecimalConvertorImplPort_address), this);
                _stub.setPortName(getBinaryToDecimalConvertorImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BinaryToDecimalConvertorImplPort".equals(inputPortName)) {
            return getBinaryToDecimalConvertorImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://convertorwebservice.sas50.org/", "BinaryToDecimalConvertorImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://convertorwebservice.sas50.org/", "BinaryToDecimalConvertorImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BinaryToDecimalConvertorImplPort".equals(portName)) {
            setBinaryToDecimalConvertorImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
