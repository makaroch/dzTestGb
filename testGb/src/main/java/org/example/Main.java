package org.example;

import dz1.calculator.Calculator;
import dz1.shop.Shop;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Calculator calculator = new Calculator();
//        System.out.println(calculator.calculateDiscount(10445, 5));
        Shop shop = new Shop();
        System.out.println(shop.sortProductsByPrice());
    }
}