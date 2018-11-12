package equations;
//Author : Sree Lakshmi
//Date: 07/09/2002

import java.lang.*;
import java.lang.reflect.*;
import java.io.*;
import java.util.*;
import java.text.*;

class SubMatrix {

      Integer[][] submatrix = (Integer[][])Array.newInstance(Integer[].class, 3);
		int iDet;

		public SubMatrix(Integer[]row1,Integer[]row2,Integer[]row3)
		{    
		    Array.set(submatrix,0,row1);
			 Array.set(submatrix,1,row2);
			 Array.set(submatrix,2,row3);
			 iDet = calcDet();
		}
		public int  calcDet() {
		        int d =   ( submatrix[0][0].intValue()*( submatrix[1][1].intValue() * submatrix[2][2].intValue() -  submatrix[2][1].intValue() * submatrix[1][2].intValue() ) )
			     -( submatrix[0][1].intValue()*( submatrix[1][0].intValue() * submatrix[2][2].intValue() -  submatrix[2][0].intValue() * submatrix[1][2].intValue() ) )
				  +( submatrix[0][2].intValue()*( submatrix[1][0].intValue() * submatrix[2][1].intValue() -  submatrix[2][0].intValue() * submatrix[1][1].intValue() ) );
				  return d;

		}
		public int getDet() {
		         return iDet;
		}

}

class Matrix  {

      Integer[] row1 = (Integer[])Array.newInstance(Integer.class, 4);
		Integer[] row2 = (Integer[])Array.newInstance(Integer.class, 4) ;
		Integer[] row3 = (Integer[])Array.newInstance(Integer.class, 4) ;

		public Matrix (String input1, String input2, String input3)
		{
		   getInputData(row1,input1);
			getInputData(row2,input2);
			getInputData(row3,input3);
		
		}
		
		public void getInputData(Integer[] row,String input)
		{
		       try 
				 {
		        NumberFormat nf = NumberFormat.getInstance(Locale.US);
				  StringTokenizer sInput = new StringTokenizer(input, ",");
				  int i=0;
			      while(sInput.hasMoreTokens())
	  			  { 
 					 
	  			    row[i] =  new Integer(  nf.parse(sInput.nextToken().trim())  .intValue()  );  
	  			    i++;
				  }
				 }
				 catch(Exception e)
				 {
				    System.out.println("Number format Exception");
				 }
		  
		}
		public int getDet(int i) 
		{ 
		
		Integer[] row1 = (Integer[])Array.newInstance(Integer.class, 3);
		Integer[] row2 = (Integer[])Array.newInstance(Integer.class, 3) ;
		Integer[] row3 = (Integer[])Array.newInstance(Integer.class, 3) ;

		int k = 0;
		
		for (int j=0;j<3; j++)
		{ 
		  if(j==i)
		  k=j+1;

		  row1[j]= this.row1[k];
		  row2[j] = this.row2[k];
		  row3[j] = this.row3[k];

		  k++;
		}
		SubMatrix sm = new SubMatrix(row1,row2,row3);
		return sm.getDet();
		}
	
		public String getSolution(int D)
		{
		     int D1,D2,D3;
			  float x,y,z;
		    //D =  this.calcDet(3);
		    D1 = this.getDet(0);
		    D2 = this.getDet(1);
		    D3 = this.getDet(2);
			 
			 if(D == 0)
			 {
			   if (D1 == 0 && D2 == 0 && D3 == 0 )
			   {
			     return "DEPENDENT";
			   }
			   else
			   {
			     return "NULL";
			   }
			}
		    x = D1/D;
		    y = -D2/D;
		    z = D3/D;

			 String sol = new Float(x).toString() + "," +new Float(y).toString()+ ","+new Float(z).toString();
			 return sol;


		} //End of getSolutions()
		  
}
public class LinearEquations {

   Object [] matrices = (Object[])Array.newInstance(Matrix.class, 10);

   public void getInput(String sFileName) {

            try{
		  
		          String sFile = System.getProperty("user.dir");
		          sFile = sFile + "\\"+sFileName;
		          BufferedReader rBuffer = new BufferedReader(new FileReader(sFile));
		          int i = 0;
		          while (i < 10){
   
	                  String s1 = rBuffer.readLine();		  
		               String s2 = rBuffer.readLine();		 
		               String s3 = rBuffer.readLine();
  		  
		               Matrix m = new Matrix(s1,s2,s3);
			            Array.set(matrices,i,m);
		               i++;   
		          }
				 } //End of try
				 catch(FileNotFoundException e){
	                 
			     System.out.println("File "+sFileName+" not found in the current directory");
				  System.out.println("Make sure the input file is in your current working directory");  
			     System.exit(0);
		
	          } //End of catch
				 catch(Exception e)         {
	                 System.out.println("Invalid input");
						  System.exit(0);
		
	          } //End of catch

 }//End of getInput()
 public void printSolution()
 {
     int p = 1,D = 0;
	         for (int j=0; j<Array.getLength(matrices); j++)
		      {
				   String sol =  new String();
					 D = ((Matrix)matrices[j]).getDet(3);

		         sol = ((Matrix)matrices[j]).getSolution(D);
				   System.out.println("Output #"+ p + ": "+D);
					System.out.println("Output #"+ p + ": "+sol);
			      p++;
		       } 
 }//End of printSolution

 public static void main(String args[]){

      if( Array.getLength(args) == 0)
		{
		   System.out.println("Please provide the name of the input file as an argument");
		   System.out.println("Syntax: java LinearEquations \"yourinputdatafile.extension\" ");
			System.exit(0);
		} 
		LinearEquations myEquations = new LinearEquations();
		myEquations.getInput(args[0]);
		myEquations.printSolution(); 
 
 }//End of main()

	
} //End of class LinearEquations



