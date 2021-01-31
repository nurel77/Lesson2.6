package com.company;

public class GenericClass <T extends Number>
        implements GenericInterface <T>{

private T digit;
    private T text;

    @Override
    public T getDigit() {
        return digit;
    }

    @Override
    public T getText() {
        return text;
    }

    @Override
    public void setDigit(T digit) {
        this.digit=digit;

    }

    @Override
    public void setText(T text) {
        this.text=  text;

    }

















    }