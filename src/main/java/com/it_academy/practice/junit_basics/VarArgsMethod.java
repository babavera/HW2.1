package com.it_academy.practice.junit_basics;

//      С этим методом не понял. Нужно было просто создать такой метод, либо нужно
//      было даработать калькуляторор, чтобы в него можно было передавать любое количество чисел?
//      Тогда какие действия с ними произкодить и как?


import java.util.Arrays;

public class VarArgsMethod {

    static void arguments(int... ints) {

        System.out.println("Number of arguments: " + ints.length);
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int) (Math.random() * 100);
        }
        System.out.println("Arguments: " + Arrays.toString(ints));
    }
}
