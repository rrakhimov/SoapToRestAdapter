package com.example.SoapToRestAdapter.controller;

import com.example.SoapToRestAdapter.dto.RequestDto;
import com.example.SoapToRestAdapter.services.CalculatorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "Адаптер для запросов к dneonline.com/calculator.asmx")
@RestController
public class CalculatorController {

    private CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @PostMapping("/add")
    @ApiOperation(value = "Метод возвращает результат сложения двух чисел",
            consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> add(@Validated @RequestBody RequestDto dto) {
        return new ResponseEntity<>(calculatorService.add(dto), HttpStatus.OK);
    }

    @PostMapping("/divide")
    @ApiOperation(value = "Метод возвращает результат деления двух чисел",
            consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> divide(@Validated @RequestBody RequestDto dto) {
        if(dto.getIntB() == 0){
            throw new ArithmeticException("Arithmetic exception: division by zero error");
        }
        return new ResponseEntity<>(calculatorService.divide(dto), HttpStatus.OK);
    }

    @PostMapping("/multiply")
    @ApiOperation(value = "Метод возвращает результат умножения двух чисел",
            consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> multiply(@Validated @RequestBody RequestDto dto) {
        return new ResponseEntity<>(calculatorService.multiply(dto), HttpStatus.OK);
    }

    @PostMapping("/subtract")
    @ApiOperation(value = "Метод возвращает результат вычитания двух чисел",
            consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> subtract(@Validated @RequestBody RequestDto dto) {
        return new ResponseEntity<>(calculatorService.subtract(dto), HttpStatus.OK);
    }
}