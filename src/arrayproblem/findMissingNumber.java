package arrayproblem;

public class findMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {1,2,3,4,6};
		int expectedNoElemnt=a.length+1;
		int totalSum=expectedNoElemnt*(expectedNoElemnt+1)/2;
        System.out.println(totalSum);
		int sum=0;
		for (int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println("missing number is"+(totalSum-sum));
	}

}
