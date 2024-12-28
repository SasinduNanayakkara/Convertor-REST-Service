package com.sas50.ConvertorRESTService.Config;

import org.sas50.convertorwebservice.BinaryToDecimalConvertorImplPortBindingStub;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import javax.xml.rpc.Service;
import java.net.URL;

@Configuration
public class SoapClientConfig {

    @Value("${convertor.service.url}")
    private static String convertorServiceUrl;

    private static BinaryToDecimalConvertorImplPortBindingStub stub = null;
    public static BinaryToDecimalConvertorImplPortBindingStub getStub() throws Exception {

        return stub;
    }

    public static void initConvetorService() throws Exception {
        URL endpointURL = new URL("http://localhost:8083/ConvertorWebService_war_exploded/binary-decimal?wsdl");
        Service service = new org.sas50.convertorwebservice.BinaryToDecimalConvertorImplServiceLocator();
        stub = new BinaryToDecimalConvertorImplPortBindingStub(endpointURL, service);

    }


}
