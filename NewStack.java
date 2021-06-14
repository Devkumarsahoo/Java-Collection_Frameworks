import java.util.*;
public class NewStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Stack<String> animals=new Stack<String>();
		animals.push("donkey");
		animals.push("Lion");
		animals.push("Seal");
		System.out.println(animals);
		System.out.println(animals.peek());
		animals.pop();
		System.out.println(animals);
	}

}
