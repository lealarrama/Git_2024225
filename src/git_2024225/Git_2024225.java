/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package git_2024225;

import java.util.Scanner;

/**
 *
 * @author leandrolarramaklam
 */
public class Git_2024225 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Leandro - 2024225");
        
        
        Scanner myKb = new Scanner(System.in);// Create a scanner Object to read Input form the user
        
       String userName; // Create variable to store the user's input
       String reverseUserName ="";// Create a empty variable to store the reversed name
        
       
       // Loop to ensure the users enters a text 
        do{
           System.out.println("Please enter your name!!");// promt
           System.out.println("You must enter text only! ");//promt
           userName = myKb.nextLine();// read the user's input
           
           //Checking if the user put only letters, if not is going to display this error message
           if (!userName.matches("[a-zA-Z]+")){
               
              System.out.println("Invalid Name plesae enter a valid name!"); // error mesage
           
           }
            
       
       }while(!userName.matches("[a-zA-Z]+"));// repeat until the user's input is valid
        // if user enter number or symbols the loop continue and will show us a errr message with the others prompt
        // and if enters some text the lopp finish because the input is valid.
        
      /* for (int i = 0; i < userName.length(); i++) {
            reverseUserName= userName.charAt(i) + reverseUserName;
          } 
         I tried to use a for here to reversed the name,it worked but 
         i looked for another method to reverse it.
    
       */
      
      
     
      //Reverse the user's name and convert it to uppercase
      
      
    reverseUserName = new StringBuilder(userName).reverse().toString().toUpperCase();

    /*The metod reverse only found in class StringBuilder, So I needed to convert the String
    to StrinBuilder then apply .reverse() and after convert again to String

    */
    
    // Dispaly the message in the terminal the Original, the reverse and Uppercase number
      System.out.println("Your name " + userName + " on reverse is : "+ reverseUserName);
       
    }
    
}
