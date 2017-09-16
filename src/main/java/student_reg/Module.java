package student_reg;

import java.util.List;

import org.joda.time.DateTime;

public class Module {

	private String moduleName, moduleId;
	private List<Student> students;
	private DateTime academicStartDate, academicEndDate;
	
	public Module(String moduleName, String moduleId, List<Student> students, DateTime academicStartDate,
			DateTime academicEndDate) {
		this.moduleName = moduleName;
		this.moduleId = moduleId;
		this.students = students;
		this.academicStartDate = academicStartDate;
		this.academicEndDate = academicEndDate;
	}
	
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public String getModuleId() {
		return moduleId;
	}
	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public DateTime getAcademicStartDate() {
		return academicStartDate;
	}
	public void setAcademicStartDate(DateTime academicStartDate) {
		this.academicStartDate = academicStartDate;
	}
	public DateTime getAcademicEndDate() {
		return academicEndDate;
	}
	public void setAcademicEndDate(DateTime academicEndDate) {
		this.academicEndDate = academicEndDate;
	}

	@Override
	public String toString() {
		return "Module [moduleName=" + moduleName + ", moduleId=" + moduleId + ", students=" + students
				+ ", academicStartDate=" + academicStartDate + ", academicEndDate=" + academicEndDate + "]";
	}
}
