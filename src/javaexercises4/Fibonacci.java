/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexercises4;

/**
 *
 * @author Adhiambo oyier
 */
public class Fibonacci {
    
  public static void main(String[] args){
   int a = 0; 
   int b = 1;
   int n, average;
   int sum = 0;
   
   for(int i = 2; i < 20; i++){
    n = a + b;
    sum += n;
    a = b;
    b = n;
    System.out.println(n + "\t");
   }
   
    average = sum/20;
    System.out.println("\n Average is: " + average);
}
}
