package com.paran.chapter13;

public class ArrayDemo {
   public static void main(String[] args) {
      int[] Array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      System.out.println("변경 전");
      for(int i = 0; i < Array.length; i++) {
         System.out.println(Array[i]);
      }
      
      reverseArrayValue(Array);
      System.out.println("변경 후");
      for(int i = 0; i < Array.length; i++) {
         System.out.println(Array[i]);
      }
   }

   public static void reverseArrayValue(int[] Arr) {
      int swapPlace = 0;
      for(int i = 0; i < Arr.length; i++) {
         for(int y = i+1; y < Arr.length; y++) {
            if(Arr[i] < Arr[y]) {
               swapPlace = Arr[y];
               Arr[y] = Arr[i];
               Arr[i] = swapPlace;
            }
         }
      }
   }
}