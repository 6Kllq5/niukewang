package com.company;

import java.util.Arrays;

public class BubbleSort {
    public static void bubblesort(int[] arr){
        if(arr.length<2||arr==null){
            return;
        }
        for(int end=arr.length-1;end>0;end--){
            for(int i=0;i<end;i++){
                if(arr[i]>arr[i+1]){
                    swap(arr,i,i+1);
                }
            }
        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args){
        int arr[]={8,6,7,1,3,5,9,41,36,4,5,74};
        bubblesort(arr);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}
