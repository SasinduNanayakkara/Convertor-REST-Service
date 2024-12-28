package com.sas50.ConvertorRESTService.Services.Impl;

import com.sas50.ConvertorRESTService.Config.SoapClientConfig;
import com.sas50.ConvertorRESTService.Dto.BinaryToDecimalRequest;
import com.sas50.ConvertorRESTService.Services.ConvertorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ConvertorServiceImpl implements ConvertorService {

    public ResponseEntity<Object> binaryToDecimalService(BinaryToDecimalRequest binary) throws Exception {
        try {
            log.info("Response from binary to decimal service param: " + binary);
            Object response = SoapClientConfig.getStub().binaryToDecimal(binary.getBinary());
            log.info("Response from binary to decimal service: " + response);
            return ResponseEntity.ok(response);

        } catch (Exception e) {
            throw new Exception("Error calling binary to decimal service: " + e.getMessage());
        }
    }

}
