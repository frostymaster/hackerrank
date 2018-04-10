package com.frostmaster.algorithms.gameTheory.KnightLOnAChessboard;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

import java.io.*;
import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static class Pair{
        int x,y;
        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    private static int bfs(int n, int a, int b){
        int board[][] = new int[n][n];
        board[0][0] = 1;
        Pair aPair = new Pair(0,0);
        Queue<Pair> que = new LinkedBlockingQueue<Pair>();
        que.add(aPair);
        int dx[] = new int[8];
        int dy[] = new int[8];
        for(int i=0; i<8; i++){
            if(i<4){
                if(i%4==0){
                    dx[i] = a;
                    dy[i] = b;
                }
                else if(i%4==1){
                    dx[i] = a;
                    dy[i] = -1*b;
                }
                else if(i%4==2){
                    dx[i] = -1*a;
                    dy[i] = b;
                }
                else{
                    dx[i] = -1*a;
                    dy[i] = -1*b;
                }
            }
            else{
                if(i%4==0){
                    dy[i] = a;
                    dx[i] = b;
                }
                else if(i%4==1){
                    dy[i] = a;
                    dx[i] = -1*b;
                }
                else if(i%4==2){
                    dy[i] = -1*a;
                    dx[i] = b;
                }
                else{
                    dy[i] = -1*a;
                    dx[i] = -1*b;
                }
            }
        }
        while(que.peek()!=null){
            Pair curPair = que.poll();
            int sx = curPair.x;
            int sy = curPair.y;
            for(int i=0; i<8; i++){
                int tx = sx+dx[i];
                int ty = sy+dy[i];
                if(tx<0 || tx>=n || ty<0 || ty>=n || board[tx][ty]!=0)
                    continue;
                board[tx][ty]=board[sx][sy]+1;
                Pair tempPair = new Pair(tx, ty);
                que.add(tempPair);
            }
            if(board[n-1][n-1]!=0)
                return board[n-1][n-1]-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // your code goes here
        int res[][] = new int[n][n];
        for(int i=1; i<n; i++){
            for(int j=1; j<n; j++){
                if(j==n-1)
                    System.out.println(bfs(n, i, j));
                else
                    System.out.print(bfs(n, i, j)+" ");
            }
        }
    }
}