package tic_tac_toe;

import java.util.Scanner;

public class Tic_tac_Toe_Game {
        private char[][] board ;
        private char currentplayer;

        public Tic_tac_Toe_Game() {
          board = new char[10][10];
          currentplayer ='x';
          initalizeBoard();
        }

        private void initalizeBoard(){
            for(int row = 1 ; row <=10; row++) {
                for (int col = 1; col < 10; col++) {
                    board[row][col] = '-';
                }
            }
        }
        // create method
        public void playGame(){
            boolean gameWon = false;
            boolean fameTied = false;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome to the tic tac toe game ");
            System.out.println("Player 1 : X");
            System.out.println("Player 1 : O");
            System.out.println("start the game");
            scanner.close();

        }
    }

