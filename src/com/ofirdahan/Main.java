package com.ofirdahan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Declaring both of our strings that we'll be comparing
        String original = "";
        String reversed = "";

        //Takes in the string that the user enters
        Scanner in = new Scanner(System.in);

        //original output text
        System.out.println("Enter in a word to see if its a Palindrome: ");

        //Storing in what the user is inputting
        original = in.nextLine().toLowerCase();

        //Getting the length of the text that the user inputs
        int length = original.length();

        // quick for-loop to take the users inputted word and reverse it
        for(int i = length - 1; i >= 0; i--){
            reversed = reversed.toLowerCase() + original.charAt(i);
        }

        //Last but not least, we're comparing the original and reversed strings
        //If the original string is equal to the reversed string, we print out "Entered word is a palindrome",
        //if not we print out "Not a palindrome"

        if(original.equals(reversed)){
            System.out.println("Entered word is a palindrome");
        } else{
            System.out.println("not a palindrome");
        }

    }
}
