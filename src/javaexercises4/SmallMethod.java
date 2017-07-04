
package javaexercises4;
import java.util.Scanner;

/**
 *
 * @author Adhiambo oyier
 */
public class SmallMethod {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter three numbers to compare");
        System.out.println("a");
       int a = input.nextInt();
       System.out.println("b");
       int b = input.nextInt();
       System.out.println("c");
       int c = input.nextInt();
       
        System.out.println("Smallest number is " + smallNumber(a, b, c));
    }
    static int smallNumber(int a, int b, int c){
        int small = 0;
        if(a < b && a < c){
            small = a;
        }
        else if(b < a && b < c){
            small = b;
        }
        else if(c < a && c < b){
            small = c;
        }
        return small;
    }
        
    
    
}
