package com.example.SoapToRestAdapter.services;

import com.example.SoapToRestAdapter.dto.RequestDto;
import com.example.SoapToRestAdapter.dto.ResponseDto;

public interface CalculatorService {
    ResponseDto add(RequestDto requestDto);
    ResponseDto divide(RequestDto requestDto);
    ResponseDto multiply(RequestDto requestDto);
    ResponseDto subtract(RequestDto requestDto);
}
