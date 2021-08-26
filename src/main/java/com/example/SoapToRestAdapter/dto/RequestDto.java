package com.example.SoapToRestAdapter.dto;

public class RequestDto {
    private int intA;
    private int intB;

    public RequestDto(int intA, int intB) {
        this.intA = intA;
        this.intB = intB;
    }

    public int getIntA() {
        return intA;
    }

    public void setIntA(int intA) {
        this.intA = intA;
    }

    public int getIntB() {
        return intB;
    }

    public void setIntB(int intB) {
        this.intB = intB;
    }
}
