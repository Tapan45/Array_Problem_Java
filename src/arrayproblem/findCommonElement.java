package arrayproblem;

import java.util.HashSet;

public class findCommonElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,3,7,6,2,7};
		int[]arr2= {2,4,6,8,5};		
		HashSet<Integer>hs= new HashSet<>();
		for (int i=0;i<arr1.length;i++)
		{
			for (int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j]) {
//					System.out.println(arr1[i]);
					hs.add(arr1[i]);
				}
			}
		}
                    for (int no:hs) {
                    	System.out.println(no);
                    }
	}

}
