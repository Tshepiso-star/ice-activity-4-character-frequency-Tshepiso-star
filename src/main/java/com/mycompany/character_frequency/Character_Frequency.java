

package com.mycompany.character_frequency;
import java.util.Scanner;
public class Character_Frequency {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
       
       System.out.print("Enter a string: ");
       String inputString = scanner.nextLine();
      
       System.out.print("Enter a character to count: ");
       String inputChar = scanner.nextLine();
     
       if (inputChar.length() != 1) {
           System.out.println("Please enter exactly one character.");
           return;
       }
       char targetChar = inputChar.charAt(0);
       int count = 0;
       
       for (int i = 0; i < inputString.length(); i++) {
           if (inputString.charAt(i) == targetChar) {
               count++;
           }
       }
      
       System.out.println("The character '" + targetChar + "' appears " + count + " times in the string.");
   }
} 