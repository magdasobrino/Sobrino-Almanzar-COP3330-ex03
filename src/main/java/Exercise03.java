/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Magdalena Sobrino-Almanzar
 */


import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {

        System.out.print("What is the quote? ");

        Scanner input = new Scanner(System.in);
        String quote = input.nextLine();

        System.out.print("Who said it? ");
        String speaker = input.nextLine();

        System.out.println(speaker + " says, " + "\"" + quote + "\"");

        System.exit(0);

    }//end of main//
}//end of program//

