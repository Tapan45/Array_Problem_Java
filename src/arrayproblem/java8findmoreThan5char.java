package arrayproblem;

import java.util.Arrays;
import java.util.List;

public class java8findmoreThan5char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> tapu = Arrays.asList("welcome,Tapan,to,our,youtube,academy");
          long count= tapu.stream().filter(s->s.length()<5).count();
           System.out.println(count);
	}

}
