package arrayproblem;

import java.util.Arrays;

public class mergeSortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {2,4,6,8,9,};
		int arr2[]= {1,3,5,7};
		int finalarray []= new int [arr1.length+arr2.length];
		System.arraycopy(arr1,0,finalarray,0,arr1.length);
		System.arraycopy(arr2,0,finalarray,arr1.length,arr2.length);
		Arrays.sort(finalarray);
		for (int i:finalarray);
		for (int element :finalarray)
		System.out.println(element + "");
	}

}
