package arrayproblem;

public class duplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int []a= {4,6,8,4,3,8,1,1,1,1};
          for (int i=0;i<a.length;i++)
          {
        	  for (int j=0;j<a.length;j++)
        	  {
        		  if (a[i]==a[j]&&(i!=j))
        		  {
        			  System.out.print(a[i]+"");
        		  }
        	  }
          }
	}

}














//BRUT FORCE METHOD