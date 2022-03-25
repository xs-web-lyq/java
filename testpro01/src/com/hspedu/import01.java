package com.hspedu;
import java.util.Arrays;

public class import01 {
    public static void main(String[] args){
        int[] arr = {-1, 20 , 3, 8};
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]+"\t");
        }
    }
}
