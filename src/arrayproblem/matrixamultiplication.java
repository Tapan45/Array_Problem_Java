package arrayproblem;

public class matrixamultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int m1[][]= {
        		        {1,2,3},
        		        {4,5,6}
        		 
                     };
         int m2 [][]= {
        		     {6,7},
        		     {8,9},
        		     {10,11}
                       };
         int sum= 0;
         int r [][] = new int [2][2];
         for (int i=0;i<=2;i++) {
        	 for (int j=0;j<=2;j++) {
        		 for (int k=0;k<=3;k++) {
        			 sum= sum+ m1[i][k]*m2[k][j];
        		 }
        		 r[i][j]= sum;
        		  sum=0;
        	 }
         }
         
         for (int i=0;i<=2;i++) {
        	 for (int j=0;j<=2;j++) {
        		 System.out.print(r[i][j]+ " ");
        		 
	}System.out.println();

}
}}