package com.company;

import java.util.Random;
import java.util.Scanner;

// Contains all methods for Main.java, for JavaONE Project
public class Methods // Contains all methods for Main.java, for JavaONE Project
{
    // GameIntro prints into only at the start of the program
    public static void GameIntro()
    {
        System.out.println("TripleX v.1.4.5!");
        System.out.println();
        System.out.println("Hello!");
        System.out.println("Welcome to te Tripple X! game");
        System.out.println();
        System.out.println("To Start the game please type \"Start\" and \"s\" confirm with Enter");
        System.out.println("To Quit the game please type \"Exit\" or \"q\" and confirm with Enter");
        userDecision();
    }

    // Gets information from the user, to start the game or to exit program (includes wrong input from user)
    public static void userDecision()
    {

        Scanner scanner = new Scanner(System.in);
        String userInputGameIntro = scanner.nextLine();

        if (userInputGameIntro.equals("start") || userInputGameIntro.equals("s"))
        {
            playTheGame();

        }
        else if (userInputGameIntro.equals("exit") || userInputGameIntro.equals("q"))
        {
            exitTheGame();
        }
        else
        {
            System.out.println("Please type start/s or exit/q");
            userDecision();
        }
    }


    // Method for exiting the program, user should be able to quit at every stage of the game
    public static void exitTheGame()
    {
        System.exit(0);
    }

    // Main method for playing the game
    public static void playTheGame()
    {
        short lvlID = 1;
        Random rand = new Random();
        int randomNumber = rand.nextInt(10) - 1;
        System.out.println(randomNumber);
    }
}
