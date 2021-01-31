package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Integer:");

        GenericClass<Integer> genericClass = new GenericClass();
        genericClass.setDigit(2020);
        System.out.println(genericClass.getDigit());

        System.out.println("----------------------");

        System.out.println("Float:");

        GenericClass<Float> genericClass1 = new GenericClass();
        genericClass1.setText(2020f);
        System.out.println(genericClass1.getText());






    }
}
