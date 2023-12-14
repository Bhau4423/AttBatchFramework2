package Steps;

import java.util.Set;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class simpleProgram {
	
	@Test
	public void method() {
		int [] num = {1, 10, 2, 2, 10, 3, 3, 3, 4, 5, 5};
		
		Set<Integer> obj = new TreeSet<Integer>();
		
		for(int se : num) {
			obj.add(se);
		}
		
		System.out.println(obj);
		
		Integer [] obj2 = obj.toArray(new Integer[0] );
		
		for(int i=obj2.length; i<=0; i--) {
			System.out.print(obj2[i]);
		}
		
 	}
}
