package com.sas50.ConvertorRESTService.Controllers;

import com.sas50.ConvertorRESTService.Dto.BinaryToDecimalRequest;
import com.sas50.ConvertorRESTService.Services.ConvertorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/convertor")
public class ConvertorController {

    private final ConvertorService convertorService;

    private ConvertorController(ConvertorService convertorService) {
        this.convertorService = convertorService;
    }

    @PostMapping("/binary-decimal")
    public ResponseEntity<Object> binaryToDecimal(@RequestBody BinaryToDecimalRequest binary) {

        try {
            return convertorService.binaryToDecimalService(binary);
        } catch (Exception e) {
            return ResponseEntity.status(500).body(e.getMessage());
        }
    }

}
