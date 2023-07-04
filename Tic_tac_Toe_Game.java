package tic_tac_toe;

import java.util.Random;
import java.util.Scanner;

public class Tic_tac_Toe_Game {
    private char[][] board;
    private char currentplayer;

    public Tic_tac_Toe_Game() {
        board = new char[10][10];
        currentplayer = 'x';
        initalizeBoard();
    }

    private void initalizeBoard() {
        for (int row = 1; row < 10; row++) {
            for (int col = 1; col < 10; col++) {
                board[row][col] = '-';
            }
        }
    }

    /* Uc 6: - Use Random to determine Heads or Tails and assign accordingly
     who starts first, the player 1 or the player 2.*/
    public void toss() {
        Random random = new Random();
        int coinToss = random.nextInt(2);
        boolean userInput = (coinToss == 0);
        if (userInput) {
            System.out.println("Player 1 won the coin toss! Player 1 play first");
            currentplayer = 'x';
        } else {
            System.out.println("Player 2 won the coin toss! Player 2 play first");
            currentplayer = 'o';
        }
    }

    // create method play game
    public void playGame() {
        boolean gameWon = false;
        boolean gameTied = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the tic tac toe game ");
        System.out.println("Player 1 : X");
        System.out.println("Player 2 : O");
        System.out.println("start the game");

        //uc4
        while (!gameWon && !gameTied) {
            System.out.println("current board");
            printBoard();

            System.out.println("player" + currentplayer + "enter your move(row[1-9] and column [1-9] :");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (isValidMove(row, col)) {
                board[row][col] = currentplayer;
            } else {
                System.out.println("Invalid Move");
            }
            System.out.println("Final board:");
            printBoard();
            if (currentplayer == 'x') {
                currentplayer = 'o';
            } else {
                currentplayer = 'x';
            }
        }
        scanner.close();
    }

    // valid till these condition
    private boolean isValidMove(int row, int col) {
        if (row < 1 || row > 9 || col < 1 || col > 9) {
            return false;
        }
        return board[row][col] == '-';
    }

    //UC3 - method show Board to display the current Board
    private void printBoard() {
        for (int row = 1; row < 10; row++) {
            for (int col = 1; col < 10; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}


