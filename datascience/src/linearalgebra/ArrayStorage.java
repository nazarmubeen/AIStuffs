package linearalgebra;

import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class ArrayStorage {

	public static void main(String[] args)
	{
		int size = 3;
		RealVector sizevector = new ArrayRealVector(size,1);
		System.out.println("size vector with default value 1"+sizevector);
		double[] data = {1.0, 2.2, 4.5};
		RealVector datavector = new ArrayRealVector(data);
		System.out.println("data vector with default value "+datavector);
		RealVector copyvector = new ArrayRealVector(datavector);
		System.out.println("copy vector with default value "+copyvector);
		int rowDimension = 10;
		int colDimension = 20;
		RealMatrix matrix = new Array2DRowRealMatrix(rowDimension, colDimension);
		
		double[][] matrixdata = {{1.0, 2.2, 3.3}, {2.2, 6.2, 6.3}, {3.3, 6.3, 5.1}}; 
		
		RealMatrix datamatrix = new Array2DRowRealMatrix(matrixdata);
		matrix.scalarAdd(1.0);

		RealMatrix copymatrix=datamatrix.copy();
		printRealMatrix(datamatrix);
		System.out.println(datamatrix);
	}
	
	static void printRealMatrix(RealMatrix datamatrix)
	{
		for(int i=0;i<datamatrix.getRowDimension();i++)
		{
			for(int j=0;j<datamatrix.getColumnDimension();j++)
			{
				System.out.println(datamatrix.getEntry(i, j));;
			}
			System.out.println(" ");
		}
		
	}

	
}
