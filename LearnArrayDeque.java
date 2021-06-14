import java.util.ArrayDeque;
public class LearnArrayDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayDeque<String> Adq=new ArrayDeque<>();
		Adq.offer("John");
		Adq.offerFirst("Jethalal");
		Adq.offerLast("Sundar");
		Adq.offer("Xi Ping");
		Adq.offer("Jimmy Corbey");
		Adq.offer("WildFrank");
		System.out.println(Adq);
		
		Adq.pollFirst();
		System.out.println(Adq);
		
		Adq.pollLast();
		System.out.println(Adq);
	}

}
