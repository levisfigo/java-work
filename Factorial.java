

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorial;

import java.util.Scanner;

public class Factorial {
    
    public static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1; 
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a non negative integer: ");
        int number = scanner.nextInt();

        
        if (number < 0) {
            System.out.println("Error Occured: Please enter a non-negative integer.");
        } else {
            
            int factorial = calculateFactorial(number);

            
            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        scanner.close();
    }
}