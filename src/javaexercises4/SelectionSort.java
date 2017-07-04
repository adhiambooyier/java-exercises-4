/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexercises4;

import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author Adhiambo oyier
 */
public class SelectionSort {
     public static void main(String[] args){
         int[] randArray = new int[10];
         Random rand = new Random();
         for(int i = 0; i < randArray.length; i++){
             randArray[i] = rand.nextInt(100);
             
         }
         System.out.println("A randomly generated array to be sorted:" + Arrays.toString(randArray));
         System.out.println("The array sorted:" + Arrays.toString(selectionSort(randArray)));
     }
     public static int[] selectionSort(int[] array){
         for(int i = array.length-1; i>=0; i-- ){ 
         int largest = 0;
         for(int j = 1; j < i+1; j++){
             if(array[j] > array[largest]){
             largest = j;
             }
         }
         int swap = array[i];
         array[i] = array[largest];
         array[largest] = swap;
         }
         
         return array;
     }
}
