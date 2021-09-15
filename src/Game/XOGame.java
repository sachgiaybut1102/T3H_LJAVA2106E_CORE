package Game;

import java.util.Scanner;

public class XOGame {
    private int[][] chessBoard;
    Scanner sc = new Scanner(System.in);

    public XOGame() {

    }

    public void startGame() {
        boolean isPlayerX = false;
        boolean isWin = false;
        initChessBoard();
        clearChessBoard();
        showChessBoard();

        while (!isWin) {
            playerMove(isPlayerX);
            isPlayerX = !isPlayerX;
            showChessBoard();
        }
    }

    private void initChessBoard() {

        int n;
        boolean flag;
        do {
            flag = true;

            System.out.print("Nhap vao so hang va cot cua ban co: ");
            n = sc.nextInt();

            if (!(0 < n && n <= 100)) {
                System.out.println("n phai nam trong khoang (0 < n <= 20), vui long nhap lai!");
                flag = false;
            }

        } while (!flag);

        chessBoard = new int[n][n];
    }

    private void clearChessBoard() {
        for (int row = 0; row < chessBoard.length; row++) {
            for (int col = 0; col < chessBoard.length; col++) {
                chessBoard[row][col] = -1;
            }
        }
    }

    private void showChessBoard() {
        for (int row = 0; row < chessBoard.length; row++) {
            System.out.print("|");
            for (int col = 0; col < chessBoard.length; col++) {
                int val = chessBoard[row][col];

                switch (val) {
                    case -1:
                        System.out.print(" ");
                        break;
                    case 0:
                        System.out.print("O");
                        break;
                    case 1:
                        System.out.print("X");
                        break;
                }
                System.out.print("|");
            }
            System.out.println();
        }
    }

    private void playerMove(boolean isPlayerX) {
        int row;
        int col;

        boolean flag;
        do {
            flag = true;

            System.out.println("Nhap vao vi tri can danh");
            System.out.print("Hang: ");
            row = sc.nextInt();
            System.out.print("Cot: ");
            col = sc.nextInt();

            if (!(0 <= row && row <= chessBoard.length) || !(0 <= col && col <= chessBoard.length)) {
                System.out.println("So cot va hang phai nam trong khoang tu 0 den " + chessBoard.length + ", vui long nhap lai!!");
                flag = false;
            } else {
                if (chessBoard[row][col] != -1) {
                    System.out.println("O nay da duoc danh, vui long nhap vi tri o khac!");
                    flag = false;
                }
            }
        } while (!flag);

        chessBoard[row][col] = isPlayerX ? 1 : 0;
    }
}
