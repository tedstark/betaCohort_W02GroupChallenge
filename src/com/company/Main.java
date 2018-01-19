package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static int boardWidth = 5;
    private static int boardHeight = 5;
    private static String [][] gameBoard = new String[boardWidth][boardHeight];  //Declare Game Board Array
    private static List<String> shipArray2 = new ArrayList<>(5);

    public static void main(String[] args) {
        /* Group Participation #2 – Week 2
        You and your team are going to create a game of battleship! However we are going to simplify the rules.
        When the application begins, it should create a game board, 5 wide by 5 high.
        It should then assign 5 randomly picked locations along the game board and save their 'X' and 'Y' locations.
        Then prompt the user to guess an X location and a Y location.
        Have the game check their guessed location again the game board and the randomly picked locations,
        if their guess matches one of the randomly picked locations, inform the user that they "HIT".
        If they guessed incorrectly, inform them that they have "MISSED".
        Keep track of guessed locations, how many randomly picked locations are left, and display those with the game board after each guess.
        The display of the game board should reflect which locations the user has already guessed.
        If a player guesses the same spot twice, they should be prompted that they have already done so and not be penalized with a guess,
        as well as be prompted to guess again.
                Objectives:
                    •    Create and utilize array to manage collections of data
                    •    Process arrays using loops
                    •    Create and utilize 2 dimensional arrays to model tables and grids */

        //| 0,0 | 1,0 | 2,0 | 3,0 | 4,0 |
        //| 0,1 | 1,1 | 2,1 | 3,1 | 4,1 |
        //| 0,2 | 1,2 | 2,2 | 3,2 | 4,2 |
        //| 0,3 | 1,3 | 2,3 | 3,3 | 4,3 |
        //| 0,4 | 1,4 | 2,4 | 3,4 | 4,4 |


        //welcome & decision block
        System.out.println(""); //Blank Line
        System.out.println("Welcome to Battleship Limited! This is a modified, simplified game for one person across a 5x5 game board. ");
        System.out.println("Would you like to play with me? (Yes/No)");
        Scanner sc = new Scanner(System.in);
        //String playGame = sc.nextLine();

        //MAIN WHILE LOOP START
        //while (playGame.equalsIgnoreCase("Yes")) {
            System.out.println("Great! Let me get the game board ready....");

        //Code block for randomized ship location selection
        Random shipSelection = new Random();
        //int shipArrayPos = 0;
        for (int i = 0; i < 5; i++) {
            int shipTempX = shipSelection.nextInt(boardWidth);
            int shipTempY = shipSelection.nextInt(boardHeight);
            String shipLocation = (Integer.toString(shipTempX) + (Integer.toString(shipTempY)));
            //System.out.println("Random Ship Selection is: " + shipTempX + "," + shipTempY);
            while (shipArray2.contains(shipLocation)) {
                //System.out.println("Duplicate Random");
                shipTempX = shipSelection.nextInt(boardWidth);
                shipTempY = shipSelection.nextInt(boardHeight);
                shipLocation = (Integer.toString(shipTempX) + (Integer.toString(shipTempY)));
            }
            shipArray2.add(shipLocation);
        }
        //code to display ship location array for troubleshooting purposes
        System.out.println("");
        System.out.println("Here are my locations:  " + shipArray2);


        //code to assign game array with values:
            gameBoard [0][0]= "A1";
            gameBoard [1][0]= "A2";
            gameBoard [2][0]= "A3";
            gameBoard [3][0]= "A4";
            gameBoard [4][0]= "A5";
            gameBoard [0][1]= "B1";
            gameBoard [1][1]= "B2";
            gameBoard [2][1]= "B3";
            gameBoard [3][1]= "B4";
            gameBoard [4][1]= "B5";
            gameBoard [0][2]= "C1";
            gameBoard [1][2]= "C2";
            gameBoard [2][2]= "C3";
            gameBoard [3][2]= "C4";
            gameBoard [4][2]= "C5";
            gameBoard [0][3]= "D1";
            gameBoard [1][3]= "D2";
            gameBoard [2][3]= "D3";
            gameBoard [3][3]= "D4";
            gameBoard [4][3]= "D5";
            gameBoard [0][4]= "E1";
            gameBoard [1][4]= "E2";
            gameBoard [2][4]= "E3";
            gameBoard [3][4]= "E4";
            gameBoard [4][4]= "E5";

            //screen output for player
            System.out.println(""); //blank line
            System.out.println("** Battleship Limited **");
            System.out.println("Here's your game board:");
            System.out.println("----------------");
            printGameBoard(); //calls method "printGameBoard" to print game board for user on screen
            System.out.println("Select the coordinates of where a ship might be:");
            //String userGuess = sc.nextLine();

            //code to Play Again or quit decision
            //System.out.println("Would you like to play again?");
            //playGame = sc.nextLine();

        //}
        // MAIN WHILE LOOP END
        System.out.println("Okay, have a nice day.");

        // CODE Exit
    }
    //Method to print the updated game board.
    public static void printGameBoard() {
        for (int y = 0; y < boardHeight; y++) { /*Exterior loop*/
            for (int x = 0; x < boardWidth; x++) { /*Interior loop*/
                System.out.print(gameBoard[x][y] + " ");
            }
            System.out.println("");
        }
    }
}