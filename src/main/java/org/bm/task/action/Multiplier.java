package org.bm.task.action;

import org.bm.task.entity.Matrix;
import org.bm.task.exeption.MatrixException;

public class Multiplier {

	/**
	 * Multiplication two matrices.
	 * 
	 * @param a
	 * @param b
	 * @return
	 * @throws MatrixException
	 */
	public Matrix multiply(Matrix a, Matrix b) throws MatrixException {
		int v = a.getVerticalSize();
		int h = b.getHorizontalSize();
		int tmp = a.getHorizontalSize();

		// Check possibilities for multiplication
		if (tmp != b.getVerticalSize()) {
			throw new MatrixException(); // Incompatible matrices
		}

		// Create result matrix
		Matrix result = new Matrix(v, h);

		try{
			//Multiply
		for (int i = 0; i < v; i++) {
			for (int j = 0; j < h; j++) {
				int value = 0;
				for (int k = 0; k < tmp; k++) {
					value += a.getElement(i, k) * b.getElement(k, j);
				}
				result.setElement(i, j, value);
			}
		}
		}catch (MatrixException e){
			// Exception is impossible according to the code logic, so
			// processing is omitted
		}
		
		return result;
	}
}
