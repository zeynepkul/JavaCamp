package trial;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1,"C# Course","C# Development Program","Engin Demiroğ");
        Course course2 = new Course(2,"Basic Course For Introduction to Programming","Python,Java,C# Courses","Engin Demiroğ");
        
        Course[] courses = {course1,course2};
        
        for(Course course: courses ) {
        	System.out.println(course.id);
        	System.out.println(course.courseName);
        	System.out.println(course.explanation);
        	System.out.println(course.instructor);
        	System.out.println("-------------------");    	
        }
        
        CourseManager courseManager = new CourseManager();
        courseManager.addCourse(course1);
        courseManager.addCourse(course2);
        courseManager.removeCourse(course1);
        courseManager.removeCourse(course2);

	}

}
