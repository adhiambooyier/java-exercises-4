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
public class CozaLozaWoza {
     public static void main(String[] args){
            int num;
           
            for(int i = 1; i <= 110; i++){
            num = i;
            if(i%12 == 0){
                  System.out.print("\n");
            }
            
             if(num%3 == 0 && num%5 == 0 && num%7 == 0)
                  System.out.print(" CozaLozaWoza ");
             else if(num%3 == 0 && num%5 == 0)
                  System.out.print(" CozaLoza ");
             else if(num%5 == 0)
                  System.out.print(" Loza ");
             else if(num%7 == 0)
                  System.out.print(" Woza ");
             else if(num%3 == 0)
                  System.out.print(" Coza ");
             else
                 System.out.print(num + " ");
             
           
             }
         }
         
     }

