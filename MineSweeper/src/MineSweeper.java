import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    int row;
    int col;
    int[][] minesPlace;

    MineSweeper() {
    }

    void input() {
        System.out.println("Satır x Sütun sayısını belirtiniz");
        System.out.print("Satır: ");
        int row = input.nextByte();
        System.out.print("Sütun: ");
        int col = input.nextByte();
        if (row <= 0 || col <= 0) {
            System.out.println("Lütfen 0'dan büyük değerler giriniz.");
            input();
        } else {
            this.row = row;
            this.col = col;
            field();
            run();
        }
    }

    void field() {
        int[][] field = new int[this.row][this.col];

        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                System.out.print("- ");
            }
            System.out.println();
        }
    }

    void mines() {
        int mines = Math.round((this.row * this.col) / 4);
        int[][] minesPlace = new int[this.row][this.col];
        for (int a = 0; a < this.row; a++) {
            for (int b = 0; b < this.col; b++) {
                minesPlace[a][b] = 10;
            }
        }
        int mineRow, mineCol;

        for (int i = 1; i <= mines; i++) {
            mineRow = (int) random.nextInt(this.row - 1);
            mineCol = (int) random.nextInt(this.col - 1);
            minesPlace[mineRow][mineCol] = 5;
        }
        this.minesPlace = minesPlace;
    }

    void printGame() {
        for (int z = 0; z < this.row; z++) {
            for (int j = 0; j < this.col; j++) {
                if (this.minesPlace[z][j] == 10) {
                    System.out.print("- ");
                } else if (this.minesPlace[z][j] == 5) {
                    System.out.print("- ");
                } else if (this.minesPlace[z][j] != 10 && this.minesPlace[z][j] != 5) {
                    System.out.print(this.minesPlace[z][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("==========================================");
    }

    boolean isLose(int arr[][], int row, int col) {
        if (arr[row][col] == 5) {
            return true;
        }
        return false;
    }

    boolean isWin(int arr[][]) {
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                if (arr[i][j] == 10) {
                    return false;
                }
            }
        }
        return true;
    }

    void run() {
        mines();
        int rowC, colC;
        while (!isWin(this.minesPlace)) {
            int count = 0;
            System.out.print("Satır giriniz: ");
            rowC = input.nextInt() - 1;
            System.out.print("Sütun giriniz: ");
            colC = input.nextInt() - 1;
            if (rowC < 0 || colC < 0 || rowC > this.row - 1 || colC > this.col - 1) {
                System.out.println("Satır değeleri 0 - " + (this.row + 1) + " aralığında olmalıdır");
                System.out.println("Sütun değeleri 0 - " + (this.col + 1) + " aralığında olmalıdır");
            } else {
                if (isLose(this.minesPlace, rowC, colC)) {
                    System.out.println("=================");
                    System.out.println("YOU DIED!");
                    System.out.println("=================");
                    for (int z = 0; z < this.row; z++) {
                        for (int j = 0; j < this.col; j++) {
                            if (this.minesPlace[z][j] == 10) {
                                System.out.print("- ");
                            } else if (this.minesPlace[z][j] == 5) {
                                System.out.print("* ");
                            } else if (this.minesPlace[z][j] != 10 && this.minesPlace[z][j] != 5) {
                                System.out.print(this.minesPlace[z][j] + " ");
                            }
                        }
                        System.out.println();
                    }
                        break;
                    }
                    if (rowC == 0 && colC == 0) {
                        for (int i = rowC; i <= rowC + 1; i++) {
                            for (int j = colC; j <= colC + 1; j++) {
                                if (this.minesPlace[i][j] == 5) {
                                    count++;
                                }
                            }
                        }
                        this.minesPlace[rowC][colC] = count;
                    } else if (rowC == 0 && colC != this.col - 1) {
                        for (int i = rowC; i <= rowC + 1; i++) {
                            for (int j = colC - 1; j <= colC + 1; j++) {
                                if (this.minesPlace[i][j] == 5) {
                                    count++;
                                }
                            }
                        }
                        this.minesPlace[rowC][colC] = count;
                    } else if (rowC == 0 && colC == this.col - 1) {
                        for (int i = rowC; i <= rowC + 1; i++) {
                            for (int j = colC - 1; j <= colC; j++) {
                                if (this.minesPlace[i][j] == 5) {
                                    count++;
                                }
                            }
                        }
                        this.minesPlace[rowC][colC] = count;
                    } else if (colC == 0 && rowC == this.row - 1) {
                        for (int i = rowC - 1; i <= rowC; i++) {
                            for (int j = colC; j <= colC + 1; j++) {
                                if (this.minesPlace[i][j] == 5) {
                                    count++;
                                }
                            }
                        }
                        this.minesPlace[rowC][colC] = count;
                    } else if (rowC != 0 && colC == 0 && rowC != this.row - 1) {
                        for (int i = rowC - 1; i <= rowC + 1; i++) {
                            for (int j = colC; j <= colC + 1; j++) {
                                if (this.minesPlace[i][j] == 5) {
                                    count++;
                                }
                            }
                        }
                        this.minesPlace[rowC][colC] = count;
                    } else if (rowC == this.row - 1 && colC == this.col - 1) {
                        for (int i = rowC - 1; i <= rowC; i++) {
                            for (int j = colC - 1; j <= colC; j++) {
                                if (this.minesPlace[i][j] == 5) {
                                    count++;
                                }
                            }
                        }
                        this.minesPlace[rowC][colC] = count;
                    } else if (rowC == this.row - 1 && colC != this.col - 1) {
                        for (int i = rowC - 1; i <= rowC; i++) {
                            for (int j = colC - 1; j <= colC + 1; j++) {
                                if (this.minesPlace[i][j] == 5) {
                                    count++;
                                }
                            }
                        }
                        this.minesPlace[rowC][colC] = count;
                    } else if (rowC != this.row - 1 && colC == this.col - 1) {
                        for (int i = rowC - 1; i <= rowC + 1; i++) {
                            for (int j = colC - 1; j <= colC; j++) {
                                if (this.minesPlace[i][j] == 5) {
                                    count++;
                                }
                            }
                        }
                        this.minesPlace[rowC][colC] = count;
                    } else {
                        for (int i = rowC - 1; i <= rowC + 1; i++) {
                            for (int j = colC - 1; j <= colC + 1; j++) {
                                if (this.minesPlace[i][j] == 5) {
                                    count++;
                                }
                            }
                        }
                        this.minesPlace[rowC][colC] = count;
                    }
                }
                printGame();
            }
            if (isWin(this.minesPlace)) {
                System.out.println("=================");
                System.out.println("Congratulations!");
                System.out.println("=================");
            }
        }
    }

