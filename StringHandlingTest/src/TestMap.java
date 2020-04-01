import java.util.Date;
import java.util.Map;
import java.util.Properties;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// in this case, Properties inherited the Map behaviour
		
		Properties mapVar = new Properties();			//generics not applied, heterogenous
		
		System.out.println("Size: "+mapVar.size()); 	// size not fixed. its flexible
		
		mapVar.setProperty("connection", "jdbc:mysql://localhost:3306");
		mapVar.setProperty("Password", null);			// both key and value must be string, no null
		
		
		
		
		/*mapVar.put("key1", true);			// to add/set a value
		mapVar.put(521, "stringvalue");
		mapVar.put(false, 210);
		mapVar.put(new Date(), "dob");
		mapVar.put("somekey", "null value");
		
		System.out.println("Size: "+mapVar.size());		// size 4
		System.out.println("value: "+mapVar.get("somekey")); 	// to fetch a value
*/	}

}
