import java.util.*;
public class LearnQueueLinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Queue<String> Names= new LinkedList();
		Names.offer("Ravi");
		Names.offer("Qatchy");
		Names.offer("Raven");
		System.out.println(Names);
		System.out.println(Names.peek());
		Names.poll();
		System.out.println(Names);
	}

}
