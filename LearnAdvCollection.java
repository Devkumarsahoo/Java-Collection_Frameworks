import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnAdvCollection {

	public static void main(String[] args) {
		
List<students> listofstudents = new ArrayList<>();

listofstudents.add(new students("Davis",77));
listofstudents.add(new students("John",977));
listofstudents.add(new students("Doe",770));
listofstudents.add(new students("Kremlin",577));
System.out.println(listofstudents);
	Collections.sort(listofstudents);
	System.out.println(listofstudents);
	
	}

}
