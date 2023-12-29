package arrayproblem;
//import java.util.Araylist;
import java.util.ArrayList;

public class evenOddNumber {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
     int []a= {8,3,5,7,9,2};
     ArrayList<Integer>al1=new ArrayList<>();
     ArrayList<Integer>al2=new ArrayList<>();
     for (int i=0;i<a.length;i++)
     {
    	 if(a[i]%2==0)
    	 {
    		 al1.add(a[i]);
    	 }
    	 else {
    		 al2.add(a[i]);
    	 }
     }
     System.out.println("evenn no are");
     for (int no:al1) {
    	 System.out.println(no);
     }
     System.out.println("\n");
     System.out.println("total no of even no"+al1.size());
     System.out.println(" odd no are");
     for (int no:al2)
     {
    	 System.out.println(no);
     }
     System.out.println("total no of even no"+al2.size());
	}

}
