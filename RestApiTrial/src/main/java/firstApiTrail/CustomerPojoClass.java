package firstApiTrail;

public class CustomerPojoClass {
	
	public CustomerPojoClass(String name,int age,String gender,String profession ) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.profession = profession;
	}
	
	
	String name;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public int getAnnual_income() {
		return Annual_income;
	}
	public void setAnnual_income(int annual_income) {
		Annual_income = annual_income;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	int age ;
	String gender;
	String profession;
	int Annual_income ;
	int id;
}
