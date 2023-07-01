package javaoop.exe7;

public class Board {
    private char[][] board;
    private int size;

    public Board(int size) {
        this.size = size;
        board = new char[size][size];
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = '-';
            }
        }
    }

    public boolean isFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean makeMove(int row, int col, char symbol) {
        if (row >= 0 && row < size && col >= 0 && col < size && board[row][col] == '-') {
            board[row][col] = symbol;
            return true;
        } else {
            return false;
        }
    }

    public boolean checkWin(char symbol) {
        // Kiểm tra hàng ngang
        for (int i = 0; i < size; i++) {
            boolean win = true;
            for (int j = 0; j < size; j++) {
                if (board[i][j] != symbol) {
                    win = false;
                    break;
                }
            }
            if (win) {
                return true;
            }
        }

        // Kiểm tra hàng dọc
        for (int i = 0; i < size; i++) {
            boolean win = true;
            for (int j = 0; j < size; j++) {
                if (board[j][i] != symbol) {
                    win = false;
                    break;
                }
            }
            if (win) {
                return true;
            }
        }

        // Kiểm tra đường chéo chính
        boolean win = true;
        for (int i = 0; i < size; i++) {
            if (board[i][i] != symbol) {
                win = false;
                break;
            }
        }
        if (win) {
            return true;
        }

        // Kiểm tra đường chéo phụ
        win = true;
        for (int i = 0; i < size; i++) {
            if (board[i][size - i - 1] != symbol) {
                win = false;
                break;
            }
        }
        return win;
    }

    public void displayBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
