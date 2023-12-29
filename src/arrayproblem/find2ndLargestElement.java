package arrayproblem;

public class find2ndLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {5,6,8,9,3,2};
		int temp;
		for (int i=0;i<a.length;i++)
		{
			for (int j=i+1;j<a.length;j++)
			{
				if (a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("2 nd largest elemement is "+a[1]);

	}

}





