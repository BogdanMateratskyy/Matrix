package org.bm.task;

public class Matrix {

	private int[][] matrix;

	public Matrix(int n, int m) throws MatrixExeption {
		if (n < 1 || m < 1) {
			throw new MatrixExeption();
		}
		
		matrix = new int[n][m];
	}
}
