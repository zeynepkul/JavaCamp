package trial;

public class Course {
	
	  /*public Course() {
		  System.out.println("Ben Çalýþtým");
	  }*/
	  
	  public Course(int id, String courseName, String explanation, String instructor) {
		/*this();*/
		this.id = id;
		this.courseName = courseName;
		this.explanation = explanation;
		this.instructor = instructor;
		
	  }
	  
      int id;
      String courseName;
      String explanation;
      String instructor;
}
