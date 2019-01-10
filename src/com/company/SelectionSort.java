package com.company;

public class SelectionSort {
    public static void Selectionsort(int[] arr){
        if(arr==null||arr.length<2){
            return;
        }
        for(int i=0;i<arr.length-1;i++){
            int minindex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minindex])
                    minindex=j;
            }
            swap(arr,i,minindex);
        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int arr[]={8,6,7,1,3,5,9,41,36,4,5,74};
        Selectionsort(arr);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}
