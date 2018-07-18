package org.bm.task;

import org.bm.task.action.Multiplier;
import org.bm.task.creator.MatrixCreator;
import org.bm.task.entity.Matrix;
import org.bm.task.exeption.MatrixException;

public class Starter {

	public static void main(String[] args) {
		try {

			Matrix a = new Matrix(2, 3);
			MatrixCreator.fillRandomized(a, 2, 7);
			System.out.println("First matrix is: " + a);
			Matrix b = new Matrix(3, 4);
			MatrixCreator.fillRandomized(b, 3, 9);
			System.out.println("Second matrix is: " + b);

			Multiplier mult = new Multiplier();
			System.out.println("After multiplier: " + mult.multiply(a, b));

		} catch (MatrixException e) {
			System.out.println("Matrix didn't created");
		}
	}
}
