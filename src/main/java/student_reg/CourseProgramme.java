package student_reg;

import java.util.List;

public class CourseProgramme {

	private String courseName;
	private List<Module> modules;
	
	public CourseProgramme(String courseName, List<Module> modules) {
		this.courseName = courseName;
		this.modules = modules;
	}
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public List<Module> getModules() {
		return modules;
	}
	public void setModules(List<Module> modules) {
		this.modules = modules;
	}

	@Override
	public String toString() {
		return "CourseProgramme [courseName=" + courseName + ", modules=" + modules + "]";
	}
}
