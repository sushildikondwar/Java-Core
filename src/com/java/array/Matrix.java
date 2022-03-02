package com.java.array;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matrix[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		int[][] matrix1 = new int[3][3];
				
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[0].length; j++) {
				matrix1[i][j] = matrix[j][i];
			}
		}
		
		for (int[] row: matrix) {
			for (int col: row)
				System.out.print(col + " ");
			System.out.println();
		}
		
		System.out.println("---------");
		
		for (int[] row: matrix1) {
			for (int col: row)
				System.out.print(col + " ");
			System.out.println();
		}
	}
}
