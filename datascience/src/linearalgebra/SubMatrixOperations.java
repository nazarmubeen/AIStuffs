package linearalgebra;

import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

public class SubMatrixOperations {

	public static void main(String[] args)
	{
	
		double[][] data = {{1,2,3},{4,5,6},{7,8,9}};
		RealMatrix m = new Array2DRowRealMatrix(data);
		int startRow = 0;
		int endRow = 1;
		int startColumn = 1;
		int endColumn = 2;
		RealMatrix subM = m.getSubMatrix(startRow, endRow, startColumn, endColumn); 
		// {{2,3},{5,6}}
		System.out.println(subM);
		
		int[] selectedRows = {0, 2};
		int[] selectedCols = {0, 1, 2};
		RealMatrix subM2 = m.getSubMatrix(selectedRows, selectedCols);
		System.out.println(subM2);
		
	}
}
