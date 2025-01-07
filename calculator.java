//basic calculator file

import java.util.*;
import java.util.scanner;

public class calculator {
  public static void main(String[] args) {

    int num1, num2;
      
    Scanner sc = new Scanner(System.in) 
 
     
    System.out.printl("Enter Your Number");

    num1 = sc.nextInt();
    num2 = sc.nextInt();

   
     System.out.println("Enter the operator (+,-,*,/):");
 
        char op = sc.next().charAt(0);
        int o = 0;
        

        switch (op) {
            // case to add two numbers
            case '+':
                o = num1 + num2;
                break;
     
            // case to subtract two numbers
            case '-':
                o = num1 - num2;
                break;
     
            // case to multiply two numbers
            case '*':
                o = num1 * num2;
                break;
     
            // case to divide two numbers
            case '/':
                o = num1 / num2;
                break;
     
            default:
                System.out.println("You enter wrong input");
            }

          System.out.println("The final result:");
        System.out.println();
 
        // print the final result
        System.out.println(num1 + " " + op + " " + num2
                           + " = " + o);
    }
}