package com.example.grafikrechner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Backend {
    public static void main(String[] args) {
        List<Float> list = readInput();
        printPoly(list);
    }

    static List<Float> readInput() {
        Scanner scanner = new Scanner(System.in);
        List<Float> coefficients = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            System.out.printf("Enter the %s. coefficient: ", i);
            float input = Float.parseFloat(scanner.nextLine());
            coefficients.add(input);
        }
        return coefficients;
    }

    static void printPoly(List<Float> list) {
        System.out.printf("%.2fx⁴ + %.2fx³ + %.2fx² + %.2fx + %.2f",
                list.get(0), list.get(1), list.get(2), list.get(3), list.get(4));
    }

    static void deriviate(){}
}