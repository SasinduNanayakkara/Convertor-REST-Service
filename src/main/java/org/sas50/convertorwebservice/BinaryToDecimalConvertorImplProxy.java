package org.sas50.convertorwebservice;

public class BinaryToDecimalConvertorImplProxy implements org.sas50.convertorwebservice.BinaryToDecimalConvertorImpl {
  private String _endpoint = null;
  private org.sas50.convertorwebservice.BinaryToDecimalConvertorImpl binaryToDecimalConvertorImpl = null;
  
  public BinaryToDecimalConvertorImplProxy() {
    _initBinaryToDecimalConvertorImplProxy();
  }
  
  public BinaryToDecimalConvertorImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initBinaryToDecimalConvertorImplProxy();
  }
  
  private void _initBinaryToDecimalConvertorImplProxy() {
    try {
      binaryToDecimalConvertorImpl = (new org.sas50.convertorwebservice.BinaryToDecimalConvertorImplServiceLocator()).getBinaryToDecimalConvertorImplPort();
      if (binaryToDecimalConvertorImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)binaryToDecimalConvertorImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)binaryToDecimalConvertorImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (binaryToDecimalConvertorImpl != null)
      ((javax.xml.rpc.Stub)binaryToDecimalConvertorImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.sas50.convertorwebservice.BinaryToDecimalConvertorImpl getBinaryToDecimalConvertorImpl() {
    if (binaryToDecimalConvertorImpl == null)
      _initBinaryToDecimalConvertorImplProxy();
    return binaryToDecimalConvertorImpl;
  }
  
  public int binaryToDecimal(java.lang.String binary) throws java.rmi.RemoteException{
    if (binaryToDecimalConvertorImpl == null)
      _initBinaryToDecimalConvertorImplProxy();
    return binaryToDecimalConvertorImpl.binaryToDecimal(binary);
  }
  
  
}