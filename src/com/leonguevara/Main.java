/*
 *  Main.java
 *  WriteSomething_Java
 *
 *  This program will help you get the size of a phrase given by the user, and let you
 *  know if that size is an even or odd number.
 *
 *  Java:   SDK 1.8 - Language level 8
 *
 *  Author: León Felipe Guevara Chávez
 *  email:  leon.guevara@itesm.mx
 *  date:   May 29th, 2017
 */
package com.leonguevara;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);   //  Our way to get input from the user

        //  We ask the user for some phrase and we read it from the standard input
        System.out.print("Write something: ");
        String phrase = scanner.nextLine();
        String phraseSizeIs;

        //  We compute the size of the given phrase
        int phraseSize = phrase.length();

        //  We identify if the phrase size is an odd or an even number.  We do this dividing the size by
        //  two.  If the remainder of such division is 0, then it is an even number; otherwise, it is an
        //  odd number
        if (phraseSize % 2 == 0) {
            phraseSizeIs = "even";
        } else {
            phraseSizeIs = "odd";
        }

        //  We display our findings
        System.out.println("The size of your phrase is " + phraseSize + " and that is an " +
                phraseSizeIs + " number");
    }
}
