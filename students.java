import java.util.Objects;

public class students implements Comparable<students> {

	String name;
	int rollno;
	
	public students(String name,int rollno){
		this.name = name;
		this.rollno = rollno;
			
		
	}

	 @Override
	    public String toString() {
	        return "Student{" +
	                "name='" + name + '\'' +
	                ", rollno=" + rollno +
	                '}';
	        
	 
	 }

	@Override
	public int hashCode() {
		return Objects.hash(rollno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		students other = (students) obj;
		return rollno == other.rollno;
	}

	@Override
	public int compareTo(students that) {
		// TODO Auto-generated method stub
		return -that.rollno+this.rollno;
	}
	 
	 

	
}
