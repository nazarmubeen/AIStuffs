package linearalgebra;

import org.apache.commons.math3.linear.OpenMapRealMatrix;
import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class MapStorageSparse {

	public static void main(String[ ] args)
	{
		int dim = 10;
		RealVector sparseVector = new OpenMapRealVector(dim);
		
		int rows = 10;
		int cols = 10;
		RealMatrix sparseMatrix = new OpenMapRealMatrix(rows, cols);
		
		System.out.println(sparseVector.toString());
		System.out.println(sparseMatrix.toString());
	}
	
	
}
