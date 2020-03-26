package exercise;

public class Employee {
	public String name;
	public String grade;
	
	public Employee(String name) {
		this.name=name;
	}
}

 class Engineer extends Employee{
	
	public Engineer(String name) {
		super(name);
			}


	private String skillset;
	public String getskillset() {
		return skillset;
	}
	
	
	public void setSkillset(String skillset) {
		this.skillset=skillset;
	}
}