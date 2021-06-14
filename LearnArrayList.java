import java.util.List;
import java.util.ArrayList;

public class LearnArrayList {

	public static void main(String[] args) {
	
	//printing the Array string
	ArrayList<String> students= new ArrayList();
	students.add("dev");
	System.out.println(students);
	
	//printing the List with numbers
	List<Integer> numbers=new ArrayList();
	numbers.add(14);
	numbers.add(55);
	numbers.add(7700);
	System.out.println(numbers);
	numbers.set(0, 6666);
	System.out.println(numbers);

	numbers.remove(0);
	
	for(int i=0;i<numbers.size();i++)
	System.out.println("the element is "+numbers.get(i));
	
	
	}

}
