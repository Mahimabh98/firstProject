package com.pragra;

import org.w3c.dom.ls.LSOutput;

public class SimpleFibonacci {
    public static void main(String[] args) {
        int n1=0, n2=1, n3;
        System.out.print(n1+" ");
        System.out.print(n2+" ");
        for (int i = 2; i < 10; i++) {
            System.out.print((n1+n2)+" ");
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
        }

    }
}