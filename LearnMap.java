import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String,String> countries=new HashMap();

System.out.println("This is  HashMap ");

countries.put("U.S", "America");
countries.put("IND", "India");
countries.put("U.K", "United Kingdom");

System.out.println(countries);
countries.put("IND","Indonesia");
System.out.println(countries);

countries.putIfAbsent("IND", "India");
System.out.println(countries);
System.out.println("the size of map:-  "+countries.size());


countries.remove("U.K");
System.out.println("Removing U.K :-"+countries);

for(Map.Entry<String,String> e:countries.entrySet()) {
	System.out.println(e);
	System.out.println(e.getKey());
	System.out.println(e.getValue());
}

	
Map<String,String> countries1=new TreeMap();
System.out.println();
System.out.println("This is  TreeMap ");

countries1.put("U.S", "America");
countries1.put("IND", "India");
countries1.put("U.K", "United Kingdom");

System.out.println(countries1);
countries1.put("IND","Indonesia");
System.out.println(countries1);

countries1.putIfAbsent("IND", "India");
System.out.println(countries1);
System.out.println("the size of map:-  "+countries1.size());


countries.remove("U.K");
System.out.println("Removing U.K :-"+countries1);

for(Map.Entry<String,String> e:countries1.entrySet()) {
	System.out.println(e);
	System.out.println(e.getKey());
	System.out.println(e.getValue());
}
	
	
	}

}
