import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student details");
		String line = sc.nextLine();	//	"1021,Bheem,6.35,ECE"
		String v[] = line.split(",");	//	"1021" "Bheem" "6.35" "ECE"
		
		int id = Integer.parseInt(v[0].trim());		//	"101" -> 101
		String name = v[1].trim();					// "Bheem"	trim() removes leading & trailing spaces
		double gpa = Double.parseDouble(v[2].trim());	// "6.35" -> 6.35
		String dept = v[3].trim();					// "ECE"
		
		Student s1 = null;

		try {
			s1 = new Student(id, name, gpa, dept);	// Student object
		}catch(Exception ex) {
			System.err.println(ex);
		}
		System.out.println(s1);					// display student details
	}

}
