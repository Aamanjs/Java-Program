
import java.io.Serializable;

public class Student implements Serializable {

	int id;
	String name;
	String course;
	int marks;

	Student() {

	}

	public Student(int id, String name, String course, int marks) {
		this.id = id;
		this.name = name;
		this.course = course;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", marks=" + marks + "]";
	}

	public String getGrade(int marks) {
		if (marks > 90) {
			return "A";
		} else if (marks > 80) {
			return "B";
		} else if (marks > 70) {
			return "C";
		} else if (marks > 60) {
			return "D";
		} else if (marks > 50) {
			return "E";
		} else
			return "Fail";

	}
	

}
