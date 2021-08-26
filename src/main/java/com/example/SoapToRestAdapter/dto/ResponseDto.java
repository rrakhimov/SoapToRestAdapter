package com.example.SoapToRestAdapter.dto;

public class ResponseDto {
    private int result;

    public ResponseDto(int result) {
        this.result = result;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
