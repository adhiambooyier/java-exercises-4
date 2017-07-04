
package javaexercises4;

import java.util.Scanner;

/**
 *
 * @author Adhiambo oyier
 */
public class JavaExercises4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      choose();            
    }
    private static void choose(){
        System.out.println("Choose a question\n");
        System.out.println("1) Write a program called Fibonacci to display the first 20 Fibonacci numbers F(n), where F(n)=F(n–1)+F(n–2) and F(1)=F(2)=1. Also compute their average.\n" +
                           "2) Write a program called CozaLozaWoza which prints the numbers 1 to 110, 11 numbers per line. The program shall print \"Coza\" in place of the numbers which are multiples of 3, \"Loza\" for multiples of 5, \"Woza\" for multiples of 7, \"CozaLoza\" for multiples of 3 and 5, and so on.\n" +
                           "3) write a program that sorts an array using the selection sort algorithm\n" +
                           "4) Write a Java method to find the smallest number among three numbers");
    Scanner input = new Scanner(System.in);
    System.out.print("\n");
        
        int question = input.nextInt();
        switch (question){
            case 1:
                Fibonacci.main(null);
                break;

            case 2:
                CozaLozaWoza.main(null);
                break;

            case 3:
                SelectionSort.main(null);
                break;

            case 4:
                SmallMethod.main(null);
                break;
            default:
                System.out.println("\nInvalid choice");
                choose();
                break;
        
    }
    }
}
    

