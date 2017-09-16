package student_reg;

public class Student {

	private String name, dateOfBirth, id;
	private int age;
	
	public Student(String name, String dateOfBirth, String id, int age) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.id = id;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return name+age;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", dateOfBirth=" + dateOfBirth + ", id=" + id + ", age=" + age + "]";
	}
}
