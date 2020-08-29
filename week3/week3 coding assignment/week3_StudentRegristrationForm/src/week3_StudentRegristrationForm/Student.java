package week3_StudentRegristrationForm;

public class Student {
	Integer studentId;
	
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public boolean login() {
		if (studentId==1)
		{
			return true;
		}
		return false;
	}
	public void register() {
	
		}
	

}
