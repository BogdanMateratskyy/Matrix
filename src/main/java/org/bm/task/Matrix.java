package org.bm.task;

public class Matrix {

	private int[][] matrix;

	public Matrix(int n, int m) throws MatrixExeption {

		if (n < 1 || m < 1) {
			throw new MatrixExeption();
		}

		matrix = new int[n][m];
	}

	public int getVerticalSize() {
		return matrix.length;
	}

	public int getHorizontalSize() {
		return matrix[0].length;
	}

	public int getElement(int i, int j) throws MatrixExeption {

		if (checkRange(i, j)) { // Check i and j
			return matrix[i][j];
		}

		throw new MatrixExeption();
	}

	public void setElement(int i, int j, int value) throws MatrixExeption {
		if (checkRange(i, j)) { // Check i and j
			matrix[i][j] = value;
		}
		throw new MatrixExeption();
	}

	/*
	 * Check the possibility of going beyond the range of matrix
	 */
	private boolean checkRange(int i, int j) {

		if (i >= 0 && i < matrix.length && j >= 0 && j < matrix[0].length) {
			return true;
		} else {
			return false;
		}
	}
}
