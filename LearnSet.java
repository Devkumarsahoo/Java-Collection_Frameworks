import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {

		
		Set<Integer> numbers=new HashSet<>();
		numbers.add(88);
		numbers.add(77);
		numbers.add(980);
		numbers.add(67);
		System.out.println("HashSet:-"+numbers);
		numbers.remove(88);
		System.out.println(numbers);
		System.out.println(numbers.contains(67));
		System.out.println(numbers.size());
		numbers.clear();
		System.out.println(numbers);
		
		
		Set<Integer> num_LinkedHashSet=new LinkedHashSet<>();
		num_LinkedHashSet.add(88);
		num_LinkedHashSet.add(77);
		num_LinkedHashSet.add(980);
		num_LinkedHashSet.add(67);
		numbers.add(67);
		System.out.println();
		System.out.println("LinkedHashSet:-"+num_LinkedHashSet);
		num_LinkedHashSet.remove(88);
		System.out.println(num_LinkedHashSet);
		System.out.println(num_LinkedHashSet.contains(67));
		System.out.println(num_LinkedHashSet.size());
		num_LinkedHashSet.clear();
		System.out.println(num_LinkedHashSet);
		
		Set<Integer> num_TreeSet=new TreeSet<>();
		num_TreeSet.add(88);
		num_TreeSet.add(77);
		num_TreeSet.add(980);
		num_TreeSet.add(67);
		num_TreeSet.add(67);
		System.out.println();
		System.out.println("TreeSet:-"+num_TreeSet);
		num_TreeSet.remove(88);
		System.out.println("Removed 88 from Set  "+num_TreeSet);
		System.out.println(num_TreeSet.contains(67));
		System.out.println(num_TreeSet.size());
		num_TreeSet.clear();
		System.out.println(num_TreeSet);
		
		
		
		
	}

}
