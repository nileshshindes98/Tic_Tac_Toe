package tic_tac_toe;

public class Tic_tac_Toe_Game {
    public class TicTacToe{
        private char[][] board ;
        private char currentplayer;

        public TicTacToe() {
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
    }
}
