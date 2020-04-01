
public class Student {
	private int id;
	private String name;
	private double gpa;
	private String dept;
	
	public Student(int id, String name, double gpa, String dept) throws IdException {
		if(id < 1000) {
			throw new IdException("Invalid ID: "+id);
		}
		this.id = id;
		this.name = name;
		this.gpa = gpa;
		this.dept = dept;
	}
	
	public String toString() {
		
		return String.format("%-5s %-10s %5.2f %-5s", id,name,gpa,dept);
	}
	
}
