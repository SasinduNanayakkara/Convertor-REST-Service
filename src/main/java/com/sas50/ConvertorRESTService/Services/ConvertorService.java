package com.sas50.ConvertorRESTService.Services;

import com.sas50.ConvertorRESTService.Dto.BinaryToDecimalRequest;
import org.springframework.http.ResponseEntity;

public interface ConvertorService {

    public ResponseEntity<Object> binaryToDecimalService(BinaryToDecimalRequest binary) throws Exception;
}
