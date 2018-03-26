package com.frostmaster.algorithms.constructiveAlgorithms.FlippingTheMatrix;

import java.util.Scanner;

public class Solution {

    public int findMax(int a[][],int x,int y,int n)
    {
        return Math.max( Math.max(a[2*n -x-1][y],a[2*n -x-1][2*n -y-1]),Math.max(a[x][y],a[x][2*n -y-1]) );
    }

    public int flippingMatrix(int[][] matrix,int n) {
        int sum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                sum+=findMax(matrix,i,j,n);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int[][] matrix = new int[2*n][2*n];
            for(int matrix_i = 0; matrix_i < 2*n; matrix_i++){
                for(int matrix_j = 0; matrix_j < 2*n; matrix_j++){
                    matrix[matrix_i][matrix_j] = in.nextInt();
                }
            }
            Solution obj=new Solution();
            int result = obj.flippingMatrix(matrix,n);
            System.out.println(result);
        }
        in.close();
    }

}
