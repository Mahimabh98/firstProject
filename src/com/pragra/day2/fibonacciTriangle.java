package com.pragra.day2;

public class fibonacciTriangle {
    public static void main(String[] args){
       int n1,n2,n3;
        for (int i=0;i<10;i++){
            n1=0;n2=1;
            System.out.print("0 ");
            System.out.print("1 ");
        for(int j=0;j<i;j++){
            System.out.print(n1+n2+" ");
            n3=n1+n2;
            n1=n2;
            n2=n3;
        }
            System.out.println();

        }

    }
}
