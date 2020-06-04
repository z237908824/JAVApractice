package com.Zhang_G.demo;


public class SparseArray {

    public static void main(String[] args){
        //创建一个原始的二维数组11*11
        //0： 表示没有棋子，1表示黑子。2表示蓝子
        int[][] chessArr1 = new int[11][11];
        chessArr1[1][2] = 1;
        chessArr1[2][3] = 2;
        chessArr1[2][6] = 1;
        chessArr1[3][5] = 2;
        chessArr1[9][6] = 1;
        //输出原始二维数组
        System.out.print("原始二维数组如下:\n");
        for(int[] row : chessArr1){
            for (int data:row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }

        //二维数组转稀疏数组
        //1.遍历二维数组获取非0元素个数
        int sum=0;
        for (int i=0;i<11;i++){
            for (int j=0;j<11;j++){
                if (chessArr1[i][j] != 0) {
                    sum++;
                }
            }
        }
        //2.根据sum生产空稀疏数组
        int[][] chessArr2 = new int[sum][3];
        //3.再次遍历二维数组并记录到稀疏数组中
        sum=0;
        for (int i=0;i<11;i++){
            for (int j=0;j<11;j++){
                if (chessArr1[i][j] != 0) {
                    chessArr2[sum][0] = i;
                    chessArr2[sum][1] = j;
                    chessArr2[sum][2] = chessArr1[i][j];
                    sum++;
                }
            }
        }
        //输出稀疏数组
        System.out.print("稀疏数组如下:\n");
        for(int[] row : chessArr2){
            for (int data:row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
        //4.还原二维数组
        int[][] chessArr3 = new int[11][11];
        for(int[] row : chessArr2){
            chessArr3[row[0]][row[1]] = row[2];
        }
        System.out.print("还原二维数组如下:\n");
        for(int[] row : chessArr3){
            for (int data:row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
    }
}
