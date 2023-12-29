package arrayproblem;

import java.util.Scanner;

public class transposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a [][]=new int [2][2];
		Scanner sc = new Scanner (System.in);
        System.out.println("Enter Array data:\n");
	for (int i=0;i<=1;i++) {
		for (int j=0;j<=1;j++) {
			a[i][j]= sc.nextInt();
		}
	}
	
	System.out.println(" Array data:\n");
	for (int i=0;i<=1;i++) {
		for (int j=0;j<=1;j++) {
		
			System.out.print(a[i][j]+" ");
	
		}System.out.print("\n");
		}
	
	System.out.println("Transpose Array data:\n");
	for (int i=0;i<=1;i++) {
		for (int j=0;j<=1;j++) {
			
	
	System.out.println(a[j][i]+" ");
	
		}System.out.println("\n");
		}
	
	
	
	}

}
