import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		List<Integer>numbers=new ArrayList();
		numbers.add(999997);
		numbers.add(9);
		numbers.add(71);
		numbers.add(19);
		numbers.add(17);
		numbers.add(900);
		numbers.add(900);
		numbers.add(979);
		numbers.add(7999);
		numbers.add(9090);
		
		
		System.out.println(numbers);
		
		System.out.println(Collections.min(numbers));
		System.out.println(Collections.max(numbers));
		System.out.println(Collections.frequency(numbers, 900));
		Collections.sort(numbers,Comparator.reverseOrder());
		System.out.println(numbers);
		
	}

}

