/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.seperatingdigits;

/**
 *
 * @author Naweed
 */

import java.util.Scanner;

public class SeperatingDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer between 1 and 99999: ");
        int number = input.nextInt();
        input.close();
        
        displayDigits(number);
    }
    
    // Calculate the integer part of the quotient when integer a is divided by integer b:
    public static int quotient(int a, int b) {
        return a / b;
    }
    
    // Calculate the integer remainder when integer a is divided by integer b:
    public static int remainder(int a, int b) {
        return a % b;
    }
    
    // Use quotient() and remainder() to display an integer as a sequence of digits separated by two spaces:
    public static void displayDigits(int number) {
        int digit5 = quotient(number, 10000);
        int digit4 = quotient(remainder(number, 10000), 1000);
        int digit3 = quotient(remainder(number, 1000), 100);
        int digit2 = quotient(remainder(number, 100), 10);
        int digit1 = remainder(number, 10);
        
        System.out.printf("%d  %d  %d  %d  %d", digit5, digit4, digit3, digit2, digit1);
    }
}
