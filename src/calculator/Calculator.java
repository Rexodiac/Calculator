/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author n1lil
 */
public class Calculator {

    public static void main(String[] args) 
    {
       int num1 = 0;
       int num2 = 0;
       char operator;
       double resenje = 0.0;
       
       Scanner scanObject = new Scanner(System.in);
       
        System.out.println("Unesite prvi broj: ");
        num1 = scanObject.nextInt();
        System.out.println("Unesite drugi broj: ");
        num2 = scanObject.nextInt();
        System.out.println("Saberi ili oduzmi? (+ ili -)?");
        operator = scanObject.next().charAt(0);
        
        switch (operator) {
            
            case '+': resenje = num1 + num2;
                        break;
            case '-': resenje = num1 - num2;
        }
        
        System.out.println("Resenje jeeeee: " + num1 + operator + num2 + "" + "=" + "" + resenje);
    }
    
}
