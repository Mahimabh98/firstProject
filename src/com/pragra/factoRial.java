package com.pragra;

import java.util.Scanner;

public class factoRial {
    public static void main(String[] args) {
        int k=1;
        System.out.println("enter a no:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        for(int i=1;i<=a;i++){
            k=i*k;
        }
            System.out.println("the factorial of this numer is "+k);


    }
}
