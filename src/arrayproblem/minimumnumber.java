package arrayproblem;

public class minimumnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {4,5,9,2,1,6};
		int min=a[0];
		for (int i=1;i<a.length;i++)
		{
			if (min>a[i])
			{
				min = a[i];
			}
		}
		System.out.println("min number is "+ min);

	}

}
