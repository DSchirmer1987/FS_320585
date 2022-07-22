package json_beispiele_dozent;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		Employee e1 = new Employee("Schirmer", 34, new String[] {"Java", "Python", "C/C++"} );
//		GSONBeispiel.objectToJSON(e1, "resources/employee.json");
		
//		Employee e2 = GSONBeispiel.JSONtoObject("resources/employee.json");
//		System.out.println(e2);
		
		Employee e3 = new Employee("Müller", 35, null);
		System.out.println("E3 : " + e3);
		GSONBeispiel.objectToJSON(e3, "resources/employee_null.json");
		
		Employee e4 = GSONBeispiel.JSONtoObject("resources/employee_null.json");
		System.out.println("E4: " + e4);
		
		
		ArrayList<Employee> emps = new ArrayList<>();
		emps.add(e1);
		emps.add(e3);
		GSONBeispiel.objectToJSON(emps, "resources/employees.json");
		
		
		ArrayList<Employee> liste = GSONBeispiel.JSONtoList("resources/employees.json");
		System.out.println(liste);
		
		ArrayList<Person> personen = GSONBeispiel.fromURL("https://randomname.de/?format=json&count=10");
		System.out.println(personen);
		
		GSONBeispiel.objectToJSON(GSONBeispiel.fromURL("https://randomname.de/?format=json&count=10"), "resources/personen.json");
	}

}
