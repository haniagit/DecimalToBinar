package com.company;

import java.util.ArrayList;
import java.util.List;

public class DecimalToBinar {

    public static List decimalToBinar(int decimal) {
        int iteration = 0;
        List<Integer> powerTwo = new ArrayList<>();
        for (int i = 1; i <= decimal; i *= 2) {
//            System.out.println(i);
            powerTwo.add(i);
            iteration++;
        }
        int last = iteration - 1;
        int lastHighest = powerTwo.get(last);
        int sum = lastHighest;
        List<Integer> binar = new ArrayList<>();
        binar.add(1);
        while (last - 1 >= 0) {
            for (int i = last - 1; i >= 0; i--) {
                if (sum + powerTwo.get(i) <= decimal) {
                    sum += powerTwo.get(i);
                    binar.add(1);
//                    System.out.println("Binar: " + 1);
//                    System.out.println(lastHighest + "+" + powerTwo.get(i) + "=" + sum);
                } else {
                    binar.add(0);
//                    System.out.println("Insufficient sum: " + sum);
//                    System.out.println("Binar: " + 0);
                }
//                System.out.println("Iteration: " + i);
                last -= 1;
            }
        }
        return binar;
    }

    public static void main(String[] args) {
        System.out.println(decimalToBinar(15601));
    }

}
