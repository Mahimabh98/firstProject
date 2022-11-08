package com.pragra;

public class StringQuestion {
    public static void main(String[] args) {
        int[] marks={90,95,96,97,99};
        int assumed=marks[0];
        for(int i=0;i<marks.length;i++){

            int largest=marks[i];
            if(largest>assumed){
                assumed=largest;
            }

        }
        System.out.println("largest is "+ assumed);
    }
}
