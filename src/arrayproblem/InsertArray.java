package arrayproblem;

public class InsertArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int [] a= {1,2,4,5,6};
            int pos=3;
            int element=3;
            for (int i=a.length-1;i>pos-1;i--) {
            	a[i]=a[i-1];
            }
            a[pos-1]=element;
            for (int i=0;i<a.length;i++) {
            	System.out.print(a[i]+" ");
            }
	}

}
