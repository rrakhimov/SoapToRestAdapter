package com.example.SoapToRestAdapter.controller;

import com.example.SoapToRestAdapter.dto.RequestDto;
import com.example.SoapToRestAdapter.services.CalculatorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody RequestDto dto){
        return new ResponseEntity<>(calculatorService.add(dto), HttpStatus.OK);
    }


    @PostMapping("/divide")
    public ResponseEntity<?> divide(@RequestBody RequestDto dto){
        return new ResponseEntity<>(calculatorService.divide(dto), HttpStatus.OK);
    }

    @PostMapping("/multiply")
    public ResponseEntity<?> multiply(@RequestBody RequestDto dto){
        return new ResponseEntity<>(calculatorService.multiply(dto), HttpStatus.OK);
    }

    @PostMapping("/subtract")
    public ResponseEntity<?> subtract(@RequestBody RequestDto dto){
        return new ResponseEntity<>(calculatorService.subtract(dto), HttpStatus.OK);
    }
}
