package arrayproblem;

public class findkthLargestElememnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int []a= {1,3,5,6,9,7};
            int k=4;
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
    		
    			if (i==k-1) {
    		
    		System.out.println(k+"largest elemement is "+a[i]);   			
    			}
    		}
	}
}
    			
    			
