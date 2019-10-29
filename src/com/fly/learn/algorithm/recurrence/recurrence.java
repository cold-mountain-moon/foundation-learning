package com.fly.learn.algorithm.recurrence;

/**
 * @Description 递归解决迷宫问题
 * @Company 北京岚时科技
 * @Version v1.0
 * @Author liheng
 * @Date 2019/9/27 19:11
 */
public class recurrence {


    public static void main(String[] args) {

        // 初始化一个迷宫面板
        int[][] board = new int[10][10];
        for(int i=0; i<10; i++) {
            board[i][0] = 1;
            board[i][9] = 1;
            board[0][i] = 1;
            board[9][i] = 1;
        }
        board[3][1] = 1;
        board[3][2] = 1;
        board[3][4] = 1;


        for(int i = 0; i<10; i++) {
            for(int j=0; j<10; j++) {
                System.out.print(board[i][j] + "  ");
            }
            System.out.println();
        }

        pass(board, 1, 1, 8, 8);
        System.out.println("走过的路径为：");
        for(int i = 0; i<10; i++) {
            for(int j=0; j<10; j++) {
                System.out.print(board[i][j] + "  ");
            }
            System.out.println();
        }
    }



    /**
     * 递归走路，策略为 下 -> 右 -> 上 -> 坐
     * 1.代表墙壁，0.没走过，2.已走过，3.走过了但没走通
     * @param board 迷宫面板
     * @param startX 起始行下表
     * @param startY 起始列下标
     * @param endX 终点行坐标
     * @param endY 终点列坐标
     * @return 是否能走通
     */
    public static boolean pass(int[][] board, int startX, int startY, int endX, int endY) {
        if(board[endX][endY] == 2) {
            return true;
        } else {
            if(board[startX][startY] == 0) {
                board[startX][startY] = 2;
                if(pass(board, startX + 1, startY, endX, endY)) {
                    return true;
                } else if(pass(board, startX, startY + 1, endX, endY)) {
                    return true;
                } else if(pass(board, startX - 1, startY, endX, endY)) {
                    return true;
                } else if(pass(board, startX, startY - 1, endX, endY)) {
                    return true;
                } else {
                    board[startX][startY] = 3;
                    return false;
                }
            } else {
                return false;
            }

        }

    }




}
