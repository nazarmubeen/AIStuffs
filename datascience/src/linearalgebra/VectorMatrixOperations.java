package linearalgebra;

import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class VectorMatrixOperations {

	public static void main(String[] args)
	{
		Operations();
		
	}
	
	static void Operations()
	{
		//vector operations
		int size=5;
		RealVector vector=new ArrayRealVector(size,2);
		vector.setEntry(0, 21);
		System.out.println(vector.getEntry(0));
		System.out.println(vector);
		vector.mapMultiplyToSelf(2.4);
		System.out.println(vector);
		vector.mapDivideToSelf(1.3);
		System.out.println(vector);
		
		//matrix Operations
		double[][] data = {{1, 2, 3}, {4, 5, 6}};
		RealMatrix matrix = new Array2DRowRealMatrix(data);
		RealMatrix transposedMatrix = matrix.transpose();
		/* {{1, 4}, {2, 5}, {3, 6}} */
		System.out.println(matrix);
		System.out.println(transposedMatrix);
	}
}
