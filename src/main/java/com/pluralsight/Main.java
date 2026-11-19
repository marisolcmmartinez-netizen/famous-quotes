package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] famousQuotes = {
                "It always seems impossible until its done. - Nelson Mandela",
                "The journey of a thousand miles begins with one step. - Lao Tzu",
                "Believe you can and you're halfway there. - Theodore Roosevelt",
                "Keep your face always towards the sunshine. - Walt Whitman"
        };
        Scanner userInput = new Scanner(System.in);
        try {
            System.out.print("Pick a quote enter a number from 1 to 4: ");
            int quoteNumber = userInput.nextInt();

            System.out.println(famousQuotes[quoteNumber - 1]);
        } catch (Exception e) {
            System.out.println("That number isn't 1 to 4. please pick a quote from 1 to 4!");
        }
    }
}
