package arrayproblem;

public class findFirstDuplicate {
	public static void main(String[]args) {
		
		int []a= {6,4,3,25,1,6,3};
		int temp=0;
		for (int i=0;i<a.length-1;i++)
		{
			for (int j=0;j<a.length-1;j++)
			{
				if (a[i]==a[j]&&(i!=j))
				{
					temp=temp+1;
					System.out.println("first duplicate element is"+a[i]);
			break;//
				}
			}
			if(temp>0) {
				
			break;
			}
		}
		
		
	}

}
