package com.frostmaster.algorithms.implementation.ThreeDSurfaceArea;

import java.util.Scanner;

public class Solution {

	static int surfaceArea(int[][] A, int W, int H) {
		int totalArea=0;
		int removedArea=0;
		for(int i=0;i<A.length;i++){
			for(int j=0;j<A[i].length;j++){
				int currentBlock=A[i][j];
				if(currentBlock!=0){
					if(i>0)
						removedArea+=Math.min(currentBlock,A[i-1][j]);//top block
					if(i<A.length-1)
						removedArea+=Math.min(currentBlock,A[i+1][j]);//bottom. block
					if(j>0)
						removedArea+=Math.min(currentBlock,A[i][j-1]);//left block
					if(j<A[0].length-1)
						removedArea+=Math.min(currentBlock,A[i][j+1]);//right block
					totalArea+=(A[i][j]*4)+2;
				}
			}

		}
		return totalArea-removedArea;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int H = in.nextInt();
		int W = in.nextInt();
		int[][] A = new int[H][W];
		for(int A_i = 0; A_i < H; A_i++){
			for(int A_j = 0; A_j < W; A_j++){
				A[A_i][A_j] = in.nextInt();
			}
		}
		int result = surfaceArea(A, W, H);
		System.out.println(result);
		in.close();
	}

}
