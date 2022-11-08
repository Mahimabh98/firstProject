package com.pragra;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
        //int height = sc.nextInt();
        int n1, n2, n3;
        for(int i=1;i<10;i++){
            n1=0;n2=1;
            for(int j=1;j<=i;j++){
                if(j==1)
                    System.out.print("0");
                else if(j==2)
                    System.out.print("1");
                else{
                    System.out.print((n1+n2));
                      n3=n1+n2;
                      n1=n2;
                      n2=n3;
                }
                System.out.print("\t");

            }
            System.out.println();
        }
    }}