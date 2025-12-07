package com.izhar;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        float num = sc.nextFloat();
//        System.out.println(num);

//        Typecasting: Compressing a bigger into a smaller type explicitly.
//        int num = (int)(67.54f);
//        System.out.println(num);

//        Automatic type promotion in expressions

//        int a = 257;
//        byte b = (byte)(a); // 257 % 256 = 1

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d =  a * b / c;     // the intermediate term is performed using integer
//        System.out.println(d);
        // Byte evaluation is done in int(Integers)

//        byte b = 50;
//        b = b * 2;


        int number = 'A';
        System.out.println(number);

//        Java is a UNICODE language meaning it can print all languages like hello in chinese, urdu, hindi.

//        Type promotion  rules::
//        the entire expression gets converted to the highest datatype storage
//        if there is INT & DOUBLE the expression will be DOUBLE
//        if FLOAT and INT then it will FLOAT

//        System.out.println(17*5.6454f);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 64500;
        float f = 5.52f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);
//     Max of            float      int      double        which is double
        System.out.println((f * b) + " " + (i / c) + " " +  (d * s));
        System.out.println(result);

    }
}
