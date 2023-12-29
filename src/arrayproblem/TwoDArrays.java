package arrayproblem;
import java.util.Scanner;

public class TwoDArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter rows size");
		int rows=sc.nextInt();
		System.out.println("Enter coloumns size");
		int cols=sc.nextInt();
		int [][] numbers= new int [rows][cols];
		for (int i=0;i<rows;i++) {
			for (int j=0;j<cols;j++) {
				numbers[i][j]=sc.nextInt();
			}
		}
		for (int i=0;i<rows;i++) {
			for (int j=0;j<cols;j++) {
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
			}
             
	}

}
