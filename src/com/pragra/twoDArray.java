package com.pragra;

import java.util.Random;

public class twoDArray {
    public static void main(String[] args) {
        int []arr[]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        int s;
        for(int i=0;i<arr.length;i++){
            s=0;
            for(int j=0;j<arr[i].length;j++){
                s=s+arr[i][j];
            }
            System.out.println("The total of this student is : "+s);
        }
    }
}
