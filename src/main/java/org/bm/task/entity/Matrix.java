package org.bm.task.entity;

import org.bm.task.exeption.MatrixException;

public class Matrix {

	private int[][] matrix;

	public Matrix(int n, int m) throws MatrixException {

		if (n < 1 || m < 1) {
			throw new MatrixException();
		}

		matrix = new int[n][m];
	}

	public int getVerticalSize() {
		return matrix.length;
	}

	public int getHorizontalSize() {
		return matrix[0].length;
	}

	public int getElement(int i, int j) throws MatrixException {

		if (checkRange(i, j)) { // Check i and j
			return matrix[i][j];
		}

		throw new MatrixException();
	}

	public void setElement(int i, int j, int value) throws MatrixException {
		if (checkRange(i, j)) { // Check i and j
			matrix[i][j] = value;
		}else 
		throw new MatrixException();
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder("\nMatrix: " + matrix.length
				+ "x" + matrix[0].length + "\n");

		for (int[] row : matrix){
			for (int value : row){
				s.append(value + " ");
			}
			s.append("\n");
		}
		
		return s.toString();
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
