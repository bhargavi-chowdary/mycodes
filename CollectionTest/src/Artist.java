import java.text.SimpleDateFormat;
import java.util.Date;

public class Artist {
	String name;
	String role;
	String gender;
	Date dob;
	public Artist(String name, String role, String gender, Date dob) {
		super();
		this.name = name;
		this.role = role;
		this.gender = gender;
		this.dob = dob;
	}
	public Artist() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		return String.format("%-20s %-10s %-7s %s", name,role,gender,sdf.format(dob));
	}

	//apply your code here...
}
