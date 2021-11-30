package trial;

public class CourseManager {
       
	//kursu ekleme butonu
	public void addCourse(Course course) {
		System.out.println(course.courseName + " Added!");
	}
	
	public void removeCourse(Course course) {
		System.out.println(course.courseName + " Removed!");
	}
}
