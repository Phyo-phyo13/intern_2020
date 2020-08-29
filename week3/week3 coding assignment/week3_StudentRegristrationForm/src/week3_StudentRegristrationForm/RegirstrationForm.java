package week3_StudentRegristrationForm;

public class RegirstrationForm extends Student{
	Integer studentId;
public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
public boolean submit() {
	return true;
}
}
