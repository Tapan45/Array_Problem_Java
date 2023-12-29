package arrayproblem;

public class noRepetedElement {
	public static void main(String[]args) {
		int a[]= {2,4,6,4,6,2,18};
		int res=a[0];
		for (int i=1;i<a.length;i++) {
			res =res^a[i];
		}
		System.out.println("single element is"+res);
	}

}
