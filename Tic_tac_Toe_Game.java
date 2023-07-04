package tic_tac_toe;

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

    // create method
    public void playGame() {
        boolean gameWon = false;
        boolean gameTied = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the tic tac toe game ");
        System.out.println("Player 1 : X");
        System.out.println("Player 1 : O");
        System.out.println("start the game");

        //uc4

        while (!gameWon && !gameTied) {
            System.out.println("current board");
            printBoard();
            System.out.println("player"+ currentplayer+ "enter your move(row[1-9] and column [1-9] :");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if(isValidMove(row,col)){
                board[row][col] = currentplayer;
            }
            scanner.close();
        }
    }
       //UC3
        private void printBoard() {
        for (int row = 1; row < 10; row++)
        {
            for (int col = 1; col < 10; col++) {
            System.out.print(board[row][col] + " ");
        }
        System.out.println();
    }
        System.out.println();
    }
// valid till these condition
    private boolean isValidMove(int row, int col) {
        if(row <1 || row >9 || col<1 || col>9){
            return false;
        }
        return board[row][col]=='-';
    }
}


