package com.izhar;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
            Syntax of for loop:

            for (initialisation; condition; increment/decrement;) {
                // body
            }
        */

        // Q: print numbers form 1 to 5.
//        for (int i = 1; i <=5; i += 1){
//            System.out.println(i);
//        }


        // Q: print numbers form 1 to n.
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i += 1){
//            System.out.print(i + " ");
//        }

        // While loops
        /*
            Syntax of while loops:
            while (condition){
                // body
            }
        */

        // Q: print numbers form 1 to 5.

        int num = 1;
        while (num <= 5){
            System.out.println(num);
            num += 1;
        }

    }
}
