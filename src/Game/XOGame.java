package Game;

import java.util.Scanner;

public class XOGame {
    private int[][] chessBoard;
    Scanner sc = new Scanner(System.in);
    private static int posX;
    private static int posY;

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

            showChessBoard();

            if (checkWin(posX, posY)) {
                System.out.println("Chuc mung nguoi choi " + (isPlayerX ? " X" : " O" + " da gianh chien thang!!!"));
                break;
            }

            isPlayerX = !isPlayerX;
        }
    }

    private boolean checkWin(int x, int y) {
        int count = 1;
        int x0;
        int y0;
        //kiem tra ngang
        //ben trai
        x0 = x - 1;
        y0 = y;
        while (x0 >= 0) {
            if (chessBoard[y][x] == chessBoard[y0][x0]) {
                count++;
                x0--;
            } else {
                break;
            }
        }

        if (count >= 5) {
            return true;
        }
        //ben phai
        x0 = x + 1;
        y0 = y;
        while (x0 < chessBoard.length) {
            if (chessBoard[y][x] == chessBoard[y0][x0]) {
                count++;
                x0++;
            } else {
                break;
            }
        }

        if (count >= 5) {
            return true;
        }

        //kiem tra doc
        //Chuyen sang kiem tra theo phuong khac thi set lai count
        count = 1;
        //kiem tra doc tren
        x0 = x;
        y0 = y - 1;
        while (y0 >= 0) {
            if (chessBoard[y][x] == chessBoard[y0][x0]) {
                count++;
                y0--;
            } else {
                break;
            }
        }

        if (count >= 5) {
            return true;
        }
        //kiem tra doc duoi
        x0 = x;
        y0 = y + 1;
        while (y0 < chessBoard.length) {
            if (chessBoard[y][x] == chessBoard[y0][x0]) {
                count++;
                y0++;
            } else {
                break;
            }
        }

        if (count >= 5) {
            return true;
        }

        //kiem tra cheo chinh
        count = 1;
        //cheo chinh tren
        x0 = x + 1;
        y0 = y - 1;
        while (y0 >= 0 && x0 < chessBoard.length) {
            if (chessBoard[y][x] == chessBoard[y0][x0]) {
                count++;
                y0--;
                x0++;
            } else {
                break;
            }
        }

        if (count >= 5) {
            return true;
        }

        //cheo chinh duoi
        x0 = x - 1;
        y0 = y + 1;
        while (y0 < chessBoard.length && x0 >= 0) {
            if (chessBoard[y][x] == chessBoard[y0][x0]) {
                count++;
                y0++;
                x0--;
            } else {
                break;
            }
        }

        if (count >= 5) {
            return true;
        }

        //kiem tra cheo phu
        count = 1;
        //cheo phu tren
        x0 = x - 1;
        y0 = y - 1;
        while (x0 >= 0 && y0 >= 0) {
            if (chessBoard[y][x] == chessBoard[y0][x0]) {
                count++;
                y0--;
                x0--;
            } else {
                break;
            }
        }

        if (count >= 5) {
            return true;
        }

        //cheo phu duoi
        x0 = x + 1;
        y0 = y + 1;
        while (x0 < chessBoard.length && y0 < chessBoard.length) {
            if (chessBoard[y][x] == chessBoard[y0][x0]) {
                count++;
                y0++;
                x0++;
            } else {
                break;
            }
        }

        if (count >= 5) {
            return true;
        }

        return false;
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
        System.out.print("  ");
        for (int col = 0; col < chessBoard.length; col++) {
            System.out.print(" " + ((col) % 10));
        }
        System.out.println();

        for (int row = 0; row < chessBoard.length; row++) {
            if (chessBoard.length > 9) {
                if (row < 10) {
                    System.out.print(" " + row + "|");
                } else {
                    System.out.print(row + "|");
                }
            } else {
                System.out.print(row + "|");
            }
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
        boolean flag;
        do {
            flag = true;

            System.out.println("Nhap vao vi tri can danh");
            System.out.print("Hang: ");
            posY = sc.nextInt();
            System.out.print("Cot: ");
            posX = sc.nextInt();

            if (!(0 <= posY && posY < chessBoard.length) || !(0 <= posX && posX < chessBoard.length)) {
                System.out.println("So cot va hang phai nam trong khoang tu 0 den " + chessBoard.length + ", vui long nhap lai!!");
                flag = false;
            } else {
                if (chessBoard[posY][posX] != -1) {
                    System.out.println("O nay da duoc danh, vui long nhap vi tri o khac!");
                    flag = false;
                }
            }
        } while (!flag);

        chessBoard[posY][posX] = isPlayerX ? 1 : 0;
    }
}
