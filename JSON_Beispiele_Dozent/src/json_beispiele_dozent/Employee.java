package json_beispiele_dozent;

import java.util.Arrays;

import com.google.gson.annotations.Since;

public class Employee {
	@Since(1.0)
	private String name;
	@Since(2.0)
	private int age;
	@Since(3.0)
	private String[] skills;
	
	/**
	 * @since 1.0
	 * @return
	 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String[] getSkills() {
		return skills;
	}
	public void setSkills(String[] skills) {
		this.skills = skills;
	}
	
	public Employee(String name, int age, String[] skills) {
		super();
		this.name = name;
		this.age = age;
		this.skills = skills;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", skills=" + Arrays.toString(skills) + "]";
	}
	
	
}
