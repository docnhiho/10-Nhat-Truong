package javaoop.exe7;

import java.util.Scanner;

public class Game {
    private Player player1;
    private Player player2;
    private Board board;
    private Player currentPlayer;

    public Game(String player1Name, String player2Name) {
        player1 = new Player(player1Name, 'X');
        player2 = new Player(player2Name, 'O');
        board = new Board(3);
        currentPlayer = player1;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        boolean gameFinished = false;

        System.out.println("Tic-Tac-Toe Game");
        System.out.println("Player 1: " + player1.getName() + " (X)");
        System.out.println("Player 2: " + player2.getName() + " (O)");
        System.out.println("Let's start the game!\n");

        while (!gameFinished) {
            board.displayBoard();

            System.out.println(currentPlayer.getName() + "'s turn:");
            System.out.print("Enter the row number (0-2): ");
            int row = scanner.nextInt();
            System.out.print("Enter the column number (0-2): ");
            int col = scanner.nextInt();

            boolean validMove = board.makeMove(row, col, currentPlayer.getSymbol());
            if (validMove) {
                if (board.checkWin(currentPlayer.getSymbol())) {
                    board.displayBoard();
                    System.out.println(currentPlayer.getName() + " wins!");
                    gameFinished = true;
                } else if (board.isFull()) {
                    board.displayBoard();
                    System.out.println("It's a draw!");
                    gameFinished = true;
                } else {
                    currentPlayer = (currentPlayer == player1) ? player2 : player1;
                }
            } else {
                System.out.println("Invalid move. Please try again.\n");
            }
        }
        scanner.close();
    }
}
