package com.company;

import java.util.Scanner;

public class Methods
{
    public static void GameIntro()
    {
        System.out.println("TripleX v.1.4.5!");
        System.out.println();
        System.out.println("Hello!");
        System.out.println("Welcome to te Tripple X! game");
        System.out.println();
        System.out.println("To Start the game please type \"Start\" and confirm with Enter");
        System.out.println("To Quit the game please type \"Exit\" and confirm with Enter");
        userDecision();
    }

    public static void userDecision()
    {
        Scanner scanner = new Scanner(System.in);
        String userInputGameIntro = scanner.nextLine();

        if (userInputGameIntro.equals("start"))
        {
            playTheGame();
        } else if (userInputGameIntro.equals("exit"))
        {
            exitTheGame();
        } else
        {
            System.out.println("Please type start or exit");
            userDecision();
        }
    }


    public static void exitTheGame()
    {
        System.exit(0);
    }

    public static void playTheGame()
    {
        short lvlID = 1;
        while (lvlID <= 11)
        {

        }
    }
}