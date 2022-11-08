package com.pragra;

import java.util.Random;
import java.util.Scanner;

public class ArrayString {
    public static void main(String[] args) {


        String[] arr = new String[5];
        arr[1] = "mahima";
        //or
        String [] ar={"mahima", "bhalla"};
        //or
        int[]a={1,2,5,8};// or
        int []b=new int[]{1,2,3,5};
        int[]marks=new int[10];
        Random s=new Random();
        for(int i=0;i<marks.length;i++){
            marks[i]=s.nextInt(10);
        }

    }


    }
