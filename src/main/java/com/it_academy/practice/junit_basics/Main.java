package com.it_academy.practice.junit_basics;

//  С исключениями не успел разобраться.
//  Я понимаю есть checked и unchecked exceptions. Runtime относится к unchecked т.е. генерируются JVM.
//  Как они обрабатываются или тут вопрос с подвохом.
//  Нужна подсказка.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = Integer.parseInt(sc.next());
        int n2 = Integer.parseInt(sc.next());


        Calculator calculator = new Calculator(n1, n2);

        System.out.println("Plus result: " + calculator.calculate('+'));
        System.out.println("Minus result: " + calculator.calculate('-'));
        System.out.println("Division result: " + calculator.calculate('/'));
        System.out.println("Multiply result: " + calculator.calculate('*'));
        System.out.println("Exponentiation result: " + calculator.calculate('e'));
        System.out.println("Root result: " + calculator.calculate('s'));

        VarArgsMethod.arguments(new int[(int) (Math.random() * 100)]);
    }
}
