package org.bm.task.creator;

import java.io.File;
import java.io.InputStream;
import java.sql.Connection;

import org.bm.task.entity.Matrix;
import org.bm.task.exeption.MatrixException;

public class MatrixCreator {

	/**
	 * This method filling matrix with random values.
	 * @param m
	 * @param start
	 * @param end
	 */
	public void fillRandomized(Matrix m, int start, int end) {
		int v = m.getVerticalSize();
		int h = m.getHorizontalSize();

		for (int i = 0; i < v; i++) {
			for (int j = 0; j < h; j++) {
				try {
					int value = (int) (Math.random() * ((end - start) + start));
					m.setElement(i, j, value);
				} catch (MatrixException e) {
					/*
					 * In this case exception is impossible so there is no
					 * processing
					 */
				}

			}
		}
	}
	
	public void fillFromFile(Matrix m, File f){
		
	}
	
	public void fillFromStream(Matrix m, InputStream input){
		
	}
	
	public void fillFromDataBases(Matrix m, Connection connect){
		
	}
}
