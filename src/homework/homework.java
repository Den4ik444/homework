/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

import java.util.Scanner;

public class homework{
    public static void main(String[] args) {
        // Задание 1
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter the temperature in Celcius: ");
        double celsius = scanner.nextDouble();
   
        // TF = (TC × 9/5) + 32
        double fahrenheit = (celsius * (9.0/5.0)) + 32;
        System.out.println("The temperature in Fahrenheit is: " + fahrenheit);
   
        System.out.printf("----------------------%n");
       
        // Задание 2
         System.out.printf("Enter any 3-digit number: ");
        int number = scanner.nextInt();
        int number1 = number%10;
        System.out.printf("First digit: %d%n",number1);
        int number2 = number/100;
        int number3 = number/10%10;
        System.out.printf("Second digit: %d%n",number3);
        int number4 = number1+number2+number3;
        System.out.printf("Sum of all digits: %d%n",number4);

    }
   
}